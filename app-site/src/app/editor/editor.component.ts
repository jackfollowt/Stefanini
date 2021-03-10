import { Component, OnInit } from '@angular/core';
import { first } from 'rxjs/operators';
import {Chart} from 'chart.js';

import { Pessoa } from '@/_models';
import { PessoaService, AuthenticationService } from '@/_services';
import {Hits} from '@/_models/hits';

@Component({ templateUrl: 'editor.component.html' })
export class EditorComponent implements OnInit {
    currentPessoa: Pessoa;
    pessoas = [];
    constructor(
        private authenticationService: AuthenticationService,
        private pessoaService: PessoaService
    ) {
        this.currentPessoa = this.authenticationService.currentPessoaValue;
    }

    ngOnInit() {
        this.loadAllPessoas();

    }

    deletePessoa(codigo: number) {
        console.log('Codigo controller', codigo)
        this.pessoaService.delete(codigo)
            .pipe(first())
            .subscribe(() => this.loadAllPessoas());
    }

    private loadAllPessoas() {
        this.pessoaService.getAll()
            .pipe(first())
            .subscribe(pessoas => this.pessoas = pessoas);
    }
}
