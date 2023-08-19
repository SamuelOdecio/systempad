package br.com.systempad.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.systempad.entities.Produto;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoResource {
	
	@GetMapping
	public ResponseEntity<List<Produto>> findAll() {
		List<Produto> list = new ArrayList<>();
		list.add(new Produto(1L, "Pao Frances", "Pãozinho quentinho", 2.0));
		return ResponseEntity.ok().body(list);
	}

}