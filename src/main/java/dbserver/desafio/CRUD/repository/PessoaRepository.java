package dbserver.desafio.CRUD.repository;

import dbserver.desafio.CRUD.pessoa.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    @Query("SELECT COUNT(p) FROM Pessoa p WHERE p.cpf = :cpf")
    long countByCpf(@Param("cpf") String cpf);
}
