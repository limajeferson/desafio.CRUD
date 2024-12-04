package dbserver.desafio.CRUD.pessoa;

import dbserver.desafio.CRUD.endereco.DadosCadastroEndereco;

public record DadosCadastroPessoa(
        String nome,
        String dataNascimento,
        String cpf,
        String email,
        DadosCadastroEndereco endereco) {
}
