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

import br.com.systempad.dto.ProdutoDTO;
import br.com.systempad.services.ProdutoService;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoResource {
	
	@Autowired
	private ProdutoService service;
	
	@GetMapping(value = "findAll")
	public ResponseEntity<List<ProdutoDTO>> findAll() {
		List<ProdutoDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "find/{id}")
	public ResponseEntity<ProdutoDTO> findById(@PathVariable Long id){		
		ProdutoDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);	
	}
	
	@PostMapping
	public ResponseEntity<ProdutoDTO> insert(@RequestBody ProdutoDTO dto){
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder
					.fromCurrentRequest()
					.path("/{id}")
					.buildAndExpand(dto.getIdProduto())
					.toUri();
		return ResponseEntity.created(uri).body(null);
	}
	
	@PutMapping(value = "update/{id}")
	public ResponseEntity<ProdutoDTO> update(@PathVariable Long id, @RequestBody ProdutoDTO dto){
		dto = service.update(id, dto);
		return ResponseEntity.ok().body(dto);
	}
	
	@DeleteMapping(value = "delete/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
}