package br.com.leilao.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the pessoa_fisica database table.
 * 
 */
@Entity
@Table(name="pessoa_fisica")
public class PessoaFisica implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int fk_idUsuario;

	private String cpf;

	@Temporal(TemporalType.DATE)
	@Column(name="data_nascimento")
	private Date dataNascimento;

	private String sobrenome;

	//bi-directional one-to-one association to Usuario
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fk_idUsuario")
	private Usuario usuario;

	public PessoaFisica() {
	}

	public int getFk_idUsuario() {
		return this.fk_idUsuario;
	}

	public void setFk_idUsuario(int fk_idUsuario) {
		this.fk_idUsuario = fk_idUsuario;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return this.dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSobrenome() {
		return this.sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}