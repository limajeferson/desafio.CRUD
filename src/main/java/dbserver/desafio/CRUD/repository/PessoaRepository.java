package dbserver.desafio.CRUD.repository;

import dbserver.desafio.CRUD.pessoa.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
