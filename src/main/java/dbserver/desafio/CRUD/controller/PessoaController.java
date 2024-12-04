package dbserver.desafio.CRUD.controller;

import dbserver.desafio.CRUD.pessoa.DadosCadastroPessoa;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pessoas")

public class PessoaController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroPessoa dados) {
        System.out.println(dados);
    }
}