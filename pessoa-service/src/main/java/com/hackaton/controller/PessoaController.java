package com.hackaton.controller;

import com.hackaton.entity.Pessoa;
import com.hackaton.iservice.IPessoaService;
import com.hackaton.model.ResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/service")
public class PessoaController {

    @Autowired
    private IPessoaService pessoaService;

    /**
     * SALVAR UM NOVO REGISTRO
     *
     * @param pessoa
     * @return
     */
    @PostMapping(value = "/pessoa")
    public @ResponseBody
    ResponseModel salvar(@RequestBody Pessoa pessoa) {

        return this.pessoaService.salvar(pessoa);
    }

    /**
     * ATUALIZAR O REGISTRO DE UMA PESSOA
     *
     * @param pessoa
     * @return
     */
    @PutMapping(value = "/pessoa")
    public @ResponseBody ResponseModel atualizar(@RequestBody Pessoa pessoa) {

        return pessoaService.atualizar(pessoa);
    }

    /**
     * CONSULTAR TODAS AS PESSOAS
     *
     * @return
     */
    @GetMapping(value = "/pessoa")
    public @ResponseBody
    List<Pessoa> consultar() {

        return pessoaService.consultar();
    }

    /**
     * BUSCAR UMA PESSOA PELO CÓDIGO
     *
     * @param codigo
     * @return
     */
    @GetMapping(value = "/pessoa/{codigo}")
    public @ResponseBody Pessoa buscar(@PathVariable("codigo") Integer codigo) {

        return this.pessoaService.buscar(codigo);
    }

    /***
     * EXCLUIR UM REGISTRO PELO CÓDIGO
     * @param codigo
     * @return
     */
    @DeleteMapping(value = "/pessoa/{codigo}")
    public @ResponseBody ResponseModel excluir(@PathVariable("codigo") Integer codigo) {

        return pessoaService.deletar(codigo);

    }

    /**
     * BUSCAR UM USUARUIO PELO LOGIN
     *
     * @param usuario
     * @param senha
     * @return
     */
    @GetMapping(value = "/pessoa/{usuario}/{senha}")
    public @ResponseBody Pessoa buscar(@PathVariable("usuario") String usuario, @PathVariable("senha") String senha) {

        return pessoaService.buscarUsuarioESenha(usuario, senha);
    }

}
