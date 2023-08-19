
package br.com.systempad.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.systempad.dto.ClienteDTO;
import br.com.systempad.entities.Cliente;
import br.com.systempad.repositories.ClienteRepository;
import br.com.systempad.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    @Transactional(readOnly = true)
    public List<ClienteDTO> findAll() {
        List<Cliente> lista = repository.findAll();
        return lista.stream().map(x -> new ClienteDTO(x)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public ClienteDTO findById(Long id) {
        Optional<Cliente> obj = repository.findById(id);
        Cliente entity = obj.get();
        return new ClienteDTO(entity);
    }

    @Transactional
    public ClienteDTO insert(ClienteDTO dto) {
        Cliente entity = new Cliente();
        entity.setNome(dto.getNome());
        entity.setCpf(dto.getCpf());
        entity.setTelefone(dto.getTelefone());
        entity.setEmail(dto.getEmail());
        entity.setUserName(dto.getUserName());
        entity.setSenha(dto.getSenha());

        entity = repository.save(entity);

        return new ClienteDTO(entity);
    }

    @Transactional
    public ClienteDTO update(Long id, ClienteDTO dto) {

        try {
            Cliente entity = repository.getReferenceById(id);

            entity.setNome(dto.getNome());
            entity.setCpf(dto.getCpf());
            entity.setTelefone(dto.getTelefone());
            entity.setEmail(dto.getEmail());
            entity.setUserName(dto.getUserName());
            entity.setSenha(dto.getSenha());
            entity.setEndereco(dto.getEndereco());

            entity = repository.save(entity);

            return new ClienteDTO(entity);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException(
                    "O recurso com o ID " + id + " não foi localizado");
        }
    }

    public void delete(Long id) {
        try {
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(
                    "O recurso com o ID " + id + " não foi localizado");
        }
    }
}