package br.com.leilao.model.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pessoa_juridica database table.
 * 
 */
@Entity
@Table(name="pessoa_juridica")
public class PessoaJuridica implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int fk_idUsuario;

	private String cnpj;

	@Column(name="insc_estadual")
	private String inscEstadual;

	@Column(name="razao_social")
	private String razaoSocial;

	//bi-directional one-to-one association to Usuario
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fk_idUsuario")
	private Usuario usuario;

	public PessoaJuridica() {
	}

	public int getFk_idUsuario() {
		return this.fk_idUsuario;
	}

	public void setFk_idUsuario(int fk_idUsuario) {
		this.fk_idUsuario = fk_idUsuario;
	}

	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscEstadual() {
		return this.inscEstadual;
	}

	public void setInscEstadual(String inscEstadual) {
		this.inscEstadual = inscEstadual;
	}

	public String getRazaoSocial() {
		return this.razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}