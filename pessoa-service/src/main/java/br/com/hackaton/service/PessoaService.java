package br.com.hackaton.service;

import br.com.hackaton.entity.Pessoa;
import br.com.hackaton.iservice.IPessoaService;
import br.com.hackaton.model.ResponseModel;
import br.com.hackaton.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService implements IPessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;


    @Override
    public ResponseModel salvar(Pessoa pessoa) {
            try {

                this.pessoaRepository.save(pessoa);

                return new ResponseModel(1, "Registro salvo com sucesso!");

            } catch (Exception e) {

                return new ResponseModel(0, e.getMessage());
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
    public Pessoa buscar(Integer codigo) {
        return this.pessoaRepository.findOne(codigo);
    }

    @Override
    public ResponseModel deletar(Integer codigo) {
        Pessoa pessoa = pessoaRepository.findOne(codigo);

        try {

            pessoaRepository.delete(pessoa);

            return new ResponseModel(1, "Registro excluido com sucesso!");

        }catch(Exception e) {
            return new ResponseModel(0, e.getMessage());
        }
    }

    @Override
    public Pessoa buscarUsuarioESenha(String usuario, String senha) {
        return pessoaRepository.findPessoaByUsuarioAndSenha(usuario, senha);
    }
}
