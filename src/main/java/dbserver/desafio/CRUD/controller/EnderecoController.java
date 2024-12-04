package dbserver.desafio.CRUD.controller;

import dbserver.desafio.CRUD.endereco.DadosCadastroEndereco;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/endereco")

public class EnderecoController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroEndereco dados) {
        System.out.println(dados);
    }
}
