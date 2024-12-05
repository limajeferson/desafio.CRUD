package dbserver.desafio.CRUD.controller;

import dbserver.desafio.CRUD.pessoa.DadosCadastroPessoa;
import dbserver.desafio.CRUD.pessoa.Pessoa;
import dbserver.desafio.CRUD.repository.PessoaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("pessoas")
public class PessoaController {

    @Autowired
    private PessoaRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@Valid @RequestBody DadosCadastroPessoa pessoa) {
        if (repository.countByCpf(pessoa.cpf()) > 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "CPF já cadastrado");
        }

        repository.save(new Pessoa(pessoa));
    }

    @GetMapping
    public List<Pessoa> listar() {
        return repository.findAll();
    }
}
