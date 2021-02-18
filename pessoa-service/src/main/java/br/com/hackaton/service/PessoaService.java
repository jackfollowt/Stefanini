package br.com.hackaton.service;

import br.com.hackaton.entity.Pessoa;
import br.com.hackaton.iservice.IPessoaService;
import br.com.hackaton.model.ResponseModel;
import br.com.hackaton.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService implements IPessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;


    @Override
    public ResponseModel salvar(Pessoa pessoa) {
        try {

            this.pessoaRepository.save(pessoa);

            return new ResponseModel(1,"Registro salvo com sucesso!");

        }catch(Exception e) {

            return new ResponseModel(0,e.getMessage());
        }

    }
}
