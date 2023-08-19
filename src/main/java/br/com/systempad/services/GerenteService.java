package br.com.systempad.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import br.com.systempad.dto.GerenteDTO;
import br.com.systempad.entities.Gerente;
import br.com.systempad.repositories.GerenteRepository;
import br.com.systempad.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;

@Service
public class GerenteService {


	@Autowired
	private GerenteRepository repository;

	@Transactional(readOnly = true)
	public List<GerenteDTO> findAll(){
		List<Gerente> lista = repository.findAll();
		return lista.stream().map(x -> new GerenteDTO(x)).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public GerenteDTO findById(Long id) {
		Optional<Gerente> obj = repository.findById(id);
		Gerente entity = obj.get();
		return new GerenteDTO(entity);		
	}
	
	@Transactional
	public GerenteDTO insert(GerenteDTO dto) {
		Gerente entity = new Gerente();
		entity.setNome(dto.getNome());
        entity.setCpf(dto.getCpf());
        entity.setTelefone(dto.getTelefone());
        entity.setEmail(dto.getEmail());
        entity.setUserName(dto.getUserName());
        entity.setSenha(dto.getSenha());
		

		entity = repository.save(entity);

		return new GerenteDTO(entity);
	}

	@Transactional
	public GerenteDTO update(Long id, GerenteDTO dto) {

		try {
			Gerente entity = repository.getReferenceById(id);

			entity.setNome(dto.getNome());
            entity.setCpf(dto.getCpf());
            entity.setTelefone(dto.getTelefone());
            entity.setEmail(dto.getEmail());
            entity.setUserName(dto.getUserName());
            entity.setSenha(dto.getSenha());
			

			entity = repository.save(entity);

			return new GerenteDTO(entity);
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