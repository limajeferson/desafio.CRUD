package dbserver.desafio.CRUD.endereco;

public record DadosCadastroEndereco(int id,
                                    String rua,
                                    String numero,
                                    String bairro,
                                    String cidade,
                                    Estado estado,
                                    String cep) {
}
