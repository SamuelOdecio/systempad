package br.com.systempad.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.systempad.dto.AtendenteDTO;
import br.com.systempad.entities.Atendente;
import br.com.systempad.repositories.AtendenteRepository;
import br.com.systempad.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;

@Service
public class AtendenteService {

    @Autowired
    private AtendenteRepository repository;

    @Transactional(readOnly = true)
    public List<AtendenteDTO> findAll() {
        List<Atendente> lista = repository.findAll();
        return lista.stream().map(x -> new AtendenteDTO(x)).collect(Collectors.toList());
    }
    /*

    @Transactional(readOnly = true)
    public AtendenteDTO findById(Long id) {
        Optional<Atendente> obj = repository.findById(id);
        Atendente entity = obj.get();
        return new AtendenteDTO(entity);
    }

    @Transactional
    public AtendenteDTO insert(AtendenteDTO dto) {
        Atendente entity = new Atendente();
        entity.setNome(dto.getNome());
        entity.setCpf(dto.getCpf());
        entity.setTelefone(dto.getTelefone());
        entity.setEmail(dto.getEmail());
        entity.setUserName(dto.getUserName());
        entity.setSenha(dto.getSenha());

        entity = repository.save(entity);

        return new AtendenteDTO(entity);
    }

    @Transactional
    public AtendenteDTO update(Long id, AtendenteDTO dto) {

        try {
            Atendente entity = repository.getReferenceById(id);

            entity.setNome(dto.getNome());
            entity.setCpf(dto.getCpf());
            entity.setTelefone(dto.getTelefone());
            entity.setEmail(dto.getEmail());
            entity.setUserName(dto.getUserName());
            entity.setSenha(dto.getSenha());

            entity = repository.save(entity);

            return new AtendenteDTO(entity);
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
    */
}
