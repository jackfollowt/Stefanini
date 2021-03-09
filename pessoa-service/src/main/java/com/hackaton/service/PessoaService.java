package com.hackaton.service;

import com.hackaton.entity.Pessoa;
import com.hackaton.iservice.IPessoaService;
import com.hackaton.model.ResponseModel;
import com.hackaton.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PessoaService implements IPessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;


    @Override
    public ResponseModel salvar(Pessoa pessoa) {
        boolean emailExiste =  emailCadastradoExiste(pessoa);

            try {
                if (!emailExiste) {
                    this.pessoaRepository.save(pessoa);
                    return new ResponseModel(1, "Registro salvo com sucesso!");
                }
                return new ResponseModel(2, "Email já Cadastrado");
            } catch (Exception e) {

                return new ResponseModel(0, e.getMessage());
            }
    }

    private boolean emailCadastradoExiste(Pessoa pessoa) {
        Pessoa pessoaExiste = pessoaRepository.findPessoaByEmail(pessoa.getEmail());
        if (pessoaExiste !=null){
            return true;
         }else {
            return false;
        }
    }


    @Override
    public ResponseModel atualizar(Pessoa pessoa) {
        try {

            this.pessoaRepository.save(pessoa);

            return new ResponseModel(1,"Registro atualizado com sucesso!");

        }catch(Exception e) {

            return new ResponseModel(0,e.getMessage());
        }
    }

    @Override
    public List<Pessoa> consultar() {
        return pessoaRepository.findAll();
    }

    @Override
    public Optional<Pessoa> buscar(Integer codigo) {
        return pessoaRepository.findById(codigo);
    }

    @Override
    public ResponseModel deletar(Integer codigo) {

        boolean pessoaExiste = pessoaRepository.existsById(codigo);

        try {
            if (pessoaExiste) {
                Pessoa pessoa = pessoaRepository.findPessoaByCodigo(codigo);

                pessoaRepository.delete(pessoa);

                return new ResponseModel(1, "Registro excluido com sucesso!");
            }
            return new ResponseModel(3, "Registro Não Existe!");


        }catch(Exception e) {
            return new ResponseModel(0, e.getMessage());
        }
    }

    @Override
    public Pessoa buscarUsuarioESenha(String usuario, String senha) {
        return pessoaRepository.findPessoaByUsuarioAndSenha(usuario, senha);
    }

}
