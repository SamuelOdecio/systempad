package br.com.systempad.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.systempad.dto.ProdutoDTO;
import br.com.systempad.entities.Produto;
import br.com.systempad.repositories.ProdutoRepository;
import br.com.systempad.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;


@Service
public class ProdutoService {


	@Autowired
	private ProdutoRepository repository;

	@Transactional(readOnly = true)
	public List<ProdutoDTO> findAll(){
		List<Produto> lista = repository.findAll();
		return lista.stream().map(x -> new ProdutoDTO(x)).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public ProdutoDTO findById(Long id) {
		Optional<Produto> obj = repository.findById(id);
		Produto entity = obj.get();
		return new ProdutoDTO(entity);		
	}
	
	@Transactional
	public ProdutoDTO insert(ProdutoDTO dto) {
		Produto entity = new Produto();
		entity.setNome(dto.getNome());
		entity.setDescricao(dto.getDescricao());
		entity.setPreco(dto.getPreco());
		

		entity = repository.save(entity);

		return new ProdutoDTO(entity);
	}

	@Transactional
	public ProdutoDTO update(Long id, ProdutoDTO dto) {

		try {
			Produto entity = repository.getReferenceById(id);

			entity.setNome(dto.getNome());
			entity.setDescricao(dto.getDescricao());
			entity.setPreco(dto.getPreco());
			

			entity = repository.save(entity);

			return new ProdutoDTO(entity);
		} catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException(
					"O recurso com o ID "+id+" não foi localizado");
		}
	}

	public void delete(Long id) {
		try {
			repository.deleteById(id);
		}catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(
					"O recurso com o ID "+id+" não foi localizado");
		}
	}
}