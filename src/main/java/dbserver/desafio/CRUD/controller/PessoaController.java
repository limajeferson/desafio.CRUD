package dbserver.desafio.CRUD.controller;

import dbserver.desafio.CRUD.pessoa.DadosCadastroPessoa;
import dbserver.desafio.CRUD.pessoa.Pessoa;
import dbserver.desafio.CRUD.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pessoas")
public class PessoaController {

    @Autowired
    private PessoaRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroPessoa pessoa) {
        repository.save(new Pessoa(pessoa));
    }
}