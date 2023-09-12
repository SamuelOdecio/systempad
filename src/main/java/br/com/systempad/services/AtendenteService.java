package br.com.systempad.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.systempad.dto.AtendenteDTO;
import br.com.systempad.entities.Atendente;
import br.com.systempad.repositories.AtendenteRepository;
import br.com.systempad.resources.exceptions.DataBaseException;
import br.com.systempad.services.exceptions.ResourceNotFoundException;

@Service
public class AtendenteService {

    @Autowired
    private AtendenteRepository repository;

    @Transactional(readOnly = true)
	public List<AtendenteDTO> findAll(){
		List<Atendente> lista = repository.findAll();
		return lista.stream().map(x -> new AtendenteDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public AtendenteDTO findById(Long id){
		Optional<Atendente> obj = repository.findById(id);
		Atendente entity = obj.orElseThrow(() -> new ResourceNotFoundException("O registro não foi localizado na base de dados"));
		return new AtendenteDTO(entity);
	}
	
	@Transactional
	public AtendenteDTO insert(AtendenteDTO dto) {
		Atendente entity = new Atendente();		
		converterEntityToDTO(entity, dto);				
		entity = repository.save(entity);
		return new AtendenteDTO(entity);
	}
	
	@Transactional
	public AtendenteDTO update(Long id, AtendenteDTO dto) {
		try {
			Atendente entity = repository.getReferenceById(id);
			
			converterEntityToDTO(entity, dto);
			
			entity = repository.save(entity);
			return new AtendenteDTO(entity);
		} catch (jakarta.persistence.EntityNotFoundException e) {
			throw new ResourceNotFoundException("O recurso com o ID "+id+" não foi localizado");
		}
	}
	
	private void converterEntityToDTO(Atendente entity, AtendenteDTO dto) {
		entity.setNome(dto.getNome());
		entity.setCpf(dto.getCpf());
		entity.setTelefone(dto.getTelefone());
		entity.setEmail(dto.getEmail());
		
	}
	
	public void delete(Long id) {
		try {
			repository.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataBaseException("Violação de Integridade");
		}			
	}
}
