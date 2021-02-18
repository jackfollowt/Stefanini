package br.com.hackaton.iservice;

import br.com.hackaton.entity.Pessoa;
import br.com.hackaton.model.ResponseModel;

public interface IPessoaService {

    ResponseModel salvar(Pessoa pessoa);
}
