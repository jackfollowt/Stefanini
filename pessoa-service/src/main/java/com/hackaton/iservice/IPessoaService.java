package com.hackaton.iservice;


import com.hackaton.entity.Pessoa;
import com.hackaton.model.ResponseModel;

import java.util.List;
import java.util.Optional;

public interface IPessoaService {

    ResponseModel salvar(Pessoa pessoa);

    ResponseModel atualizar(Pessoa pessoa);

    List<Pessoa> consultar();

    Optional<Pessoa> buscar(Integer codigo);

    ResponseModel deletar(Integer codigo);

    Pessoa buscarUsuarioESenha(String usuario, String senha);
}
