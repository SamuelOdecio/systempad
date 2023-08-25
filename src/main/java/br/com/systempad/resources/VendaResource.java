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

import br.com.systempad.dto.VendaDTO;
import br.com.systempad.services.VendaService;

@RestController
@RequestMapping(value = "/venda")
public class VendaResource {
	
	
	
	@Autowired
	private VendaService service;
	
	@GetMapping
	public ResponseEntity<List<VendaDTO>> findAll() {
		List<VendaDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
/*
	@GetMapping(value = "/{id}")
	public ResponseEntity<VendaDTO> findById(@PathVariable Long id){
		VendaDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}
	
	@PostMapping
	public ResponseEntity<VendaDTO> insert(@RequestBody VendaDTO dto){
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder
					.fromCurrentRequest()
					.path("/{id}")
					.buildAndExpand(dto.getIdVenda())
					.toUri();
		return ResponseEntity.created(uri).body(null);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<VendaDTO> update(
			@PathVariable Long id,
			@RequestBody VendaDTO dto){
		dto = service.update(id, dto);
		return ResponseEntity.ok().body(dto);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	*/
}