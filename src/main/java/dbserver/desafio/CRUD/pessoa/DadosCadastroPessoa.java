package dbserver.desafio.CRUD.pessoa;

import dbserver.desafio.CRUD.endereco.DadosCadastroEndereco;
import jakarta.validation.constraints.NotBlank;

public record DadosCadastroPessoa(
        @NotBlank String nome,
        @NotBlank String dataNascimento,
        @NotBlank String cpf,
        DadosCadastroEndereco endereco) {
}
