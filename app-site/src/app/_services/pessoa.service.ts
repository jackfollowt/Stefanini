import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Pessoa } from '@/_models';
import {map} from 'rxjs/operators';
import {Observable} from 'rxjs';
import {Hits} from '@/_models/hits';

@Injectable({ providedIn: 'root' })
export class PessoaService {
    constructor(private http: HttpClient) { }

    getAll() {
        return this.http.get<Pessoa[]>(`${config.apiUrl}/pessoa`);
    }

    register(pessoa: Pessoa) {
        return this.http.post(`${config.apiUrl}/pessoa`, pessoa);
    }

    delete(codigo: number) {
        console.log('CODIGO PARA DELETAR',codigo);
        return this.http.delete(`${config.apiUrl}/pessoa/deletar/${codigo}`);
    }

    susAPI(): Observable<Hits[]> {
        return this.http.get<Hits>(`${config.apiUrl}/api`)
            .pipe(map((data: any) => data.hits.hits));
    }
}
