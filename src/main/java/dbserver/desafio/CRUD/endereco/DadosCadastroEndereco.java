package dbserver.desafio.CRUD.endereco;

public record DadosCadastroEndereco(
        String rua,
        String numero,
        String bairro,
        String cidade,
        Estado estado,
        String cep) {
}
