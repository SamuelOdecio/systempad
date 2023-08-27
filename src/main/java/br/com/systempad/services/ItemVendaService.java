package br.com.systempad.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.systempad.dto.ItemVendaDTO;
import br.com.systempad.entities.ItemVenda;
import br.com.systempad.repositories.ItemVendaRepository;
import br.com.systempad.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;


@Service
public class ItemVendaService {


	@Autowired
	private ItemVendaRepository repository;

	@Transactional(readOnly = true)
	public List<ItemVendaDTO> findAll(){
		List<ItemVenda> lista = repository.findAll();
		return lista.stream().map(x -> new ItemVendaDTO(x)).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public ItemVendaDTO findById(Long id) {
		Optional<ItemVenda> obj = repository.findById(id);
		ItemVenda entity = obj.get();
		return new ItemVendaDTO(entity);		
	}
	
	@Transactional
	public ItemVendaDTO insert(ItemVendaDTO dto) {
		ItemVenda entity = new ItemVenda();
		entity.setIdItemVenda(dto.getIdItemVenda());
		entity.setIdProduto(dto.getIdProduto());
		entity.setQuantidade(dto.getQuantidade());

		entity = repository.save(entity);

		return new ItemVendaDTO(entity);
	}

	@Transactional
	public ItemVendaDTO update(Long id, ItemVendaDTO dto) {

		try {
			ItemVenda entity = repository.getReferenceById(id);

			entity.setIdItemVenda(dto.getIdItemVenda());
			entity.setIdProduto(dto.getIdProduto());
			entity.setQuantidade(dto.getQuantidade());
			

			entity = repository.save(entity);

			return new ItemVendaDTO(entity);
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