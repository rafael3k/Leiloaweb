package br.com.leilao.model.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the endereco_usuario database table.
 * 
 */
@Entity
@Table(name="endereco_usuario")
public class Endereco implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idEndereco;

	@Column(name="bairro_endereco")
	private String bairroEndereco;

	@Column(name="cep_endereco")
	private String cepEndereco;

	@Column(name="cidade_endereco")
	private String cidadeEndereco;

	@Column(name="complemento_endereco")
	private String complementoEndereco;

	@Column(name="estado_endereco")
	private String estadoEndereco;

	@Column(name="logradouro_endereco")
	private String logradouroEndereco;

	@Column(name="tel_alternativo")
	private String telAlternativo;

	@Column(name="tel_alternativo2")
	private String telAlternativo2;

	@Column(name="tel_principal")
	private String telPrincipal;

	//bi-directional many-to-one association to Usuario
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fk_idUsuario")
	private Usuario usuario;

	public Endereco() {
	}

	public int getIdEndereco() {
		return this.idEndereco;
	}

	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getBairroEndereco() {
		return this.bairroEndereco;
	}

	public void setBairroEndereco(String bairroEndereco) {
		this.bairroEndereco = bairroEndereco;
	}

	public String getCepEndereco() {
		return this.cepEndereco;
	}

	public void setCepEndereco(String cepEndereco) {
		this.cepEndereco = cepEndereco;
	}

	public String getCidadeEndereco() {
		return this.cidadeEndereco;
	}

	public void setCidadeEndereco(String cidadeEndereco) {
		this.cidadeEndereco = cidadeEndereco;
	}

	public String getComplementoEndereco() {
		return this.complementoEndereco;
	}

	public void setComplementoEndereco(String complementoEndereco) {
		this.complementoEndereco = complementoEndereco;
	}

	public String getEstadoEndereco() {
		return this.estadoEndereco;
	}

	public void setEstadoEndereco(String estadoEndereco) {
		this.estadoEndereco = estadoEndereco;
	}

	public String getLogradouroEndereco() {
		return this.logradouroEndereco;
	}

	public void setLogradouroEndereco(String logradouroEndereco) {
		this.logradouroEndereco = logradouroEndereco;
	}

	public String getTelAlternativo() {
		return this.telAlternativo;
	}

	public void setTelAlternativo(String telAlternativo) {
		this.telAlternativo = telAlternativo;
	}

	public String getTelAlternativo2() {
		return this.telAlternativo2;
	}

	public void setTelAlternativo2(String telAlternativo2) {
		this.telAlternativo2 = telAlternativo2;
	}

	public String getTelPrincipal() {
		return this.telPrincipal;
	}

	public void setTelPrincipal(String telPrincipal) {
		this.telPrincipal = telPrincipal;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}