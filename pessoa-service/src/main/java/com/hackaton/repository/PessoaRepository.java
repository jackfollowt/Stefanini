package com.hackaton.repository;

import com.hackaton.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

    Pessoa findPessoaByEmail(String email);

    Pessoa findPessoaByUsuarioAndSenha(String usuario, String senha);

    void delete(Pessoa pessoa);

    List<Pessoa> findAll();

}
