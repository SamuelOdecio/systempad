
package br.com.systempad.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.systempad.dto.ClienteDTO;
import br.com.systempad.entities.Cliente;
import br.com.systempad.repositories.ClienteRepository;
import br.com.systempad.resources.exceptions.DataBaseException;
import br.com.systempad.services.exceptions.ResourceNotFoundException;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    @Transactional(readOnly = true)
	public List<ClienteDTO> findAll(){
		List<Cliente> lista = repository.findAll();
		return lista.stream().map(x -> new ClienteDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public ClienteDTO findById(Long id){
		Optional<Cliente> obj = repository.findById(id);
		Cliente entity = obj.orElseThrow(() -> new ResourceNotFoundException("O registro não foi localizado na base de dados"));
		return new ClienteDTO(entity);
	}
	
	@Transactional
	public ClienteDTO insert(ClienteDTO dto) {
		Cliente entity = new Cliente();		
		converterEntityToDTO(entity, dto);				
		entity = repository.save(entity);
		return new ClienteDTO(entity);
	}
	
	@Transactional
	public ClienteDTO update(Long id, ClienteDTO dto) {
		try {
			Cliente entity = repository.getReferenceById(id);
			
			converterEntityToDTO(entity, dto);
			
			entity = repository.save(entity);
			return new ClienteDTO(entity);
		} catch (jakarta.persistence.EntityNotFoundException e) {
			throw new ResourceNotFoundException("O recurso com o ID "+id+" não foi localizado");
		}
	}
	
	private void converterEntityToDTO(Cliente entity, ClienteDTO dto) {
		entity.setNome(dto.getNome());
		entity.setCpf(dto.getCpf());
		entity.setTelefone(dto.getTelefone());
		entity.setEmail(dto.getEmail());
		entity.setEndereco(dto.getEndereco());
		
	}
	
	public void delete(Long id) {
		try {
			repository.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataBaseException("Violação de Integridade");
		}			
	}
}