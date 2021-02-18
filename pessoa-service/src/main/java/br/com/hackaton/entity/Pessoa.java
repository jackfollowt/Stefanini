package br.com.hackaton.entity;

import javax.persistence.*;

@Table(name="tb_pessoa")
@Entity
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="id_pessoa")
	private Integer codigo;
	
	@Column(name="ds_nome")
	private String nome;
			
	@Column(name="fl_ativo", columnDefinition="BIT")
	private boolean ativo;

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


	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}


}
