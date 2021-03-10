package com.hackaton.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Table(name="tb_pessoa")
@Entity
@Getter
@Setter
public class Pessoa implements Serializable {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="id_pessoa")
	private Integer codigo;
	
	@Column(name="ds_nome")
	private String nome;

	@Column(name="ds_idade")
	private String idade;
			
	@Column(name="fl_atuaTI")
	private String atuacao;

	@Column(name = "num_telefone")
	private String telefone;

	@Column(name = "num_endereco")
	private String endereco;

	@Column(name = "end_email")
	private String email;

	@Column(name = "login_user")
	private String usuario;

	@Column(name = "login_senha")
	private String senha;

    @Column(name = "ident_sexo")
	private String sexo;

}
