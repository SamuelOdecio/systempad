package br.com.systempad.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.systempad.dto.ItemVendaDTO;
import br.com.systempad.services.ItemVendaService;

@RestController
@RequestMapping(value = "/itemvenda")
public class ItemVendaResource {
	
	@Autowired
	private ItemVendaService service;
	
	@GetMapping(value = "findAll")
	public ResponseEntity<List<ItemVendaDTO>> findAll() {
		List<ItemVendaDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "find/{id}")
	public ResponseEntity<ItemVendaDTO> findById(@PathVariable Long id){		
		ItemVendaDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);	
	}
	
	@PostMapping
	public ResponseEntity<ItemVendaDTO> insert(@RequestBody ItemVendaDTO dto){
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder
					.fromCurrentRequest()
					.path("/{id}")
					.buildAndExpand(dto.getIdItemVenda())
					.toUri();
		return ResponseEntity.created(uri).body(null);
	}
	
	@PutMapping(value = "update/{id}")
	public ResponseEntity<ItemVendaDTO> update(@PathVariable Long id, @RequestBody ItemVendaDTO dto){
		dto = service.update(id, dto);
		return ResponseEntity.ok().body(dto);
	}
	
	@DeleteMapping(value = "delete/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
}