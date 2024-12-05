package dbserver.desafio.CRUD.pessoa;

import dbserver.desafio.CRUD.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.Period;

@Table(name = "pessoas")
@Entity(name = "Pessoa")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dataNascimento;
    private String cpf;

    @Embedded
    private Endereco endereco;

    public Pessoa(DadosCadastroPessoa pessoa) {
        this.nome = pessoa.nome();
        this.dataNascimento = pessoa.dataNascimento();
        this.cpf = pessoa.cpf();
        this.endereco = new Endereco(pessoa.endereco());
    }

    public int getIdade() {
        LocalDate nascimento = LocalDate.parse(this.dataNascimento);
        return Period.between(nascimento, LocalDate.now()).getYears();
    }
}
