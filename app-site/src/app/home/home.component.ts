import { Component, OnInit } from '@angular/core';
import { first } from 'rxjs/operators';

import { Pessoa } from '@/_models';
import { PessoaService, AuthenticationService } from '@/_services';

@Component({ templateUrl: 'home.component.html' })
export class HomeComponent implements OnInit {
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

    deletePessoa(id: number) {
        this.pessoaService.delete(id)
            .pipe(first())
            .subscribe(() => this.loadAllPessoas());
    }

    private loadAllPessoas() {
        this.pessoaService.getAll()
            .pipe(first())
            .subscribe(pessoas => this.pessoas = pessoas);
    }
}
