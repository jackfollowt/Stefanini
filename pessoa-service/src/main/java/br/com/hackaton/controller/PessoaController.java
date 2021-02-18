package br.com.hackaton.controller;

import java.util.List;

import br.com.hackaton.iservice.IPessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import br.com.hackaton.entity.Pessoa;
import br.com.hackaton.model.ResponseModel;
import br.com.hackaton.repository.PessoaRepository;

@CrossOrigin(origins = "http://localhost:4200")
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
    @PostMapping(value = "/pessoa", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody ResponseModel salvar(@RequestBody Pessoa pessoa) {


        return this.pessoaService.salvar(pessoa);
    }

    /**
     * ATUALIZAR O REGISTRO DE UMA PESSOA
     *
     * @param pessoa
     * @return
     */
    @PutMapping(value = "/pessoa", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody ResponseModel atualizar(@RequestBody Pessoa pessoa) {

        return pessoaService.atualizar(pessoa);
    }

    /**
     * CONSULTAR TODAS AS PESSOAS
     *
     * @return
     */
    @GetMapping(value = "/pessoa", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody List<Pessoa> consultar() {

        return pessoaService.consultar();
    }

    /**
     * BUSCAR UMA PESSOA PELO CÓDIGO
     *
     * @param codigo
     * @return
     */
    @GetMapping(value = "/pessoa/{codigo}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody Pessoa buscar(@PathVariable("codigo") Integer codigo) {

        return this.pessoaService.buscar(codigo);
    }

    /***
     * EXCLUIR UM REGISTRO PELO CÓDIGO
     * @param codigo
     * @return
     */
    @DeleteMapping(value = "/pessoa/{codigo}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody ResponseModel excluir(@PathVariable("codigo") Integer codigo) {

        return pessoaService.deletar(codigo);

    }

}
