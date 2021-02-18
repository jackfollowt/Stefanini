import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Pessoa } from '@/_models';

@Injectable({ providedIn: 'root' })
export class PessoaService {
    constructor(private http: HttpClient) { }

    getAll() {
        return this.http.get<Pessoa[]>(`${config.apiUrl}/pessoa`);
    }

    register(pessoa: Pessoa) {
        return this.http.post(`${config.apiUrl}/pessoa`, pessoa);
    }

    delete(id: number) {
        return this.http.delete(`${config.apiUrl}/pessoas/${id}`);
    }
}
