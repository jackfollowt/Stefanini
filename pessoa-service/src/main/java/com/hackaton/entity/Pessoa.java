package com.hackaton.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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

	@NotBlank(message = "{name.not.blank}")
	@NotNull(message = "{name.not.null}")
	@Column(name="ds_nome")
	private String nome;

	@Column(name="ds_idade")
	private String idade;

	@Column(name="dt_incio")
	private String dtInicio;

	@Column(name="dt_fim")
	private String dtFim;
	@NotNull(message = "{name.not.null}")
	@Column(name="fl_atuaTI", columnDefinition="BIT")
	private String atuacao;

	@NotBlank(message = "{telefone.not.blank}")
	@NotNull(message = "{telefone.not.null}")
	@Column(name = "num_telefone")
	private String telefone;

	@NotBlank(message = "{endereco.not.blank}")
	@NotNull(message = "{endereco.not.null}")
	@Column(name = "num_endereco")
	private String endereco;

	@NotBlank(message = "{email.not.blank}")
	@NotNull(message = "{email.not.null}")
	@Email(message = "{email.not.valid}")
	@Column(name = "end_email")
	private String email;

	@NotBlank(message = "{usuario.not.blank}")
	@NotNull(message = "{usuario.not.null}")
	@Column(name = "login_user")
	private String usuario;

	@NotBlank(message = "{senha.not.blank}")
	@NotNull(message = "{senha.not.null}")
	@Column(name = "login_senha")
	private String senha;

	@NotBlank(message = "{sexo.not.blank}")
	@NotNull(message = "{sexo.not.null}")
    @Column(name = "ident_sexo")
	private String sexo;

}
