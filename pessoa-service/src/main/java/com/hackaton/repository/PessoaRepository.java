package com.hackaton.repository;

import com.hackaton.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

	//Object save(Pessoa pessoa);
/*
	void delete(Pessoa pessoa);

	List<Pessoa> findAll();

	Pessoa findOne(Integer id);

	Pessoa findPessoaByUsuarioAndSenha(String usuario, String senha);

	Pessoa findPessoaByEmail(String email);*/
}
