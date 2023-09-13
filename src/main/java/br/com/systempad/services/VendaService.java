package br.com.systempad.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.systempad.dto.VendaDTO;
import br.com.systempad.entities.Venda;
import br.com.systempad.repositories.VendaRepository;
import br.com.systempad.services.exceptions.DataBaseException;
import br.com.systempad.services.exceptions.ResourceNotFoundException;


@Service
public class VendaService {


	@Autowired
	private VendaRepository repository;

	@Transactional(readOnly = true)
	public List<VendaDTO> findAll(){
		List<Venda> lista = repository.findAll();
		return lista.stream().map(x -> new VendaDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public VendaDTO findById(Long id){
		Optional<Venda> obj = repository.findById(id);
		Venda entity = obj.orElseThrow(() -> new ResourceNotFoundException("O registro não foi localizado na base de dados"));
		return new VendaDTO(entity);
	}
	
	@Transactional
	public VendaDTO insert(VendaDTO dto) {
		Venda entity = new Venda();		
		converterEntityToDTO(entity, dto);				
		entity = repository.save(entity);
		return new VendaDTO(entity);
	}
	
	@Transactional
	public VendaDTO update(Long id, VendaDTO dto) {
		try {
			Venda entity = repository.getReferenceById(id);
			
			converterEntityToDTO(entity, dto);
			
			entity = repository.save(entity);
			return new VendaDTO(entity);
		} catch (jakarta.persistence.EntityNotFoundException e) {
			throw new ResourceNotFoundException("O recurso com o ID "+id+" não foi localizado");
		}
	}
	
	private void converterEntityToDTO(Venda entity, VendaDTO dto) {
		entity.setData(dto.getData());
		entity.setPagamento(dto.getPagamento());
		entity.setAtendente(dto.getAtendente());
		entity.setCliente(dto.getCliente());
		
	}
	
	public void delete(Long id) {
		try {
			repository.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataBaseException("Violação de Integridade");
		}			
	}
}