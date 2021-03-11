package com.hackaton.iservice;


import com.hackaton.entity.Pessoa;
import com.hackaton.model.ResponseModel;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface IPessoaService {

    ResponseEntity<Pessoa> salvar(Pessoa pessoa);

    ResponseModel atualizar(Pessoa pessoa);

    List<Pessoa> consultar();

    Optional<Pessoa> buscar(Integer codigo);

    ResponseEntity deletar(Integer codigo);

    Object buscarUsuarioESenha(String usuario, String senha);
}
