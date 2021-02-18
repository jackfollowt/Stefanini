package br.com.hackaton.repository;

import java.util.List;


import org.springframework.data.repository.Repository;

import br.com.hackaton.entity.Pessoa;


public interface PessoaRepository extends Repository<Pessoa, Integer> {

	void save(Pessoa pessoa);
	
	void delete(Pessoa pessoa);
	
	List<Pessoa> findAll();
	
	Pessoa findOne(Integer id);
}
