package br.com.systempad.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.systempad.dto.VendaDTO;
import br.com.systempad.entities.Venda;
import br.com.systempad.repositories.VendaRepository;
import br.com.systempad.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;


@Service
public class VendaService {


	@Autowired
	private VendaRepository repository;

	@Transactional(readOnly = true)
	public List<VendaDTO> findAll(){
		List<Venda> lista = repository.findAll();
		return lista.stream().map(x -> new VendaDTO(x)).collect(Collectors.toList());
	}
/*
	@Transactional(readOnly = true)
	public VendaDTO findById(Long id) {
		Optional<Venda> obj = repository.findById(id);
		Venda entity = obj.get();
		return new VendaDTO(entity);		
	}


	@Transactional
	public VendaDTO insert(VendaDTO dto) {
		Venda entity = new Venda();
		//entity.setData(dto.getData());
		///entity.setPagamento(dto.getPagamento());
		//entity.setPreco(dto.getPreco());


		entity = repository.save(entity);

		return new VendaDTO(entity);
	}

	@Transactional
	public VendaDTO update(Long id, VendaDTO dto) {

		try {
			Venda entity = repository.getReferenceById(id);

			//entity.setNome(dto.getNome());
			//entity.setDescricao(dto.getDescricao());
			//entity.setPreco(dto.getPreco());


			entity = repository.save(entity);

			return new VendaDTO(entity);
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
	*/
}