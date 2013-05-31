package br.com.leilao.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idUsuario;

	@Column(name="email_user")
	private String emailUser;

	@Column(name="login_user")
	private String loginUser;

	@Column(name="password_user")
	private String passwordUser;

	@Column(name="primeiro_nome")
	private String primeiroNome;

	@Column(name="url_website")
	private String urlWebsite;

	//bi-directional many-to-one association to Endereco
	@OneToOne(mappedBy="usuario", fetch=FetchType.LAZY)
	private Endereco endereco;

	//bi-directional many-to-one association to Leilao
	@OneToMany(mappedBy="usuario")
	private List<Leilao> leilaos;

	//bi-directional many-to-one association to NovasMsgsOferta
	@OneToMany(mappedBy="usuario")
	private List<NovasMsgsOferta> novasMsgsOfertas;

	//bi-directional many-to-one association to Oferta
	@OneToMany(mappedBy="usuario")
	private List<Oferta> ofertas;

	//bi-directional one-to-one association to PessoaFisica
	@OneToOne(mappedBy="usuario", fetch=FetchType.LAZY)
	private PessoaFisica pessoaFisica;

	//bi-directional one-to-one association to PessoaJuridica
	@OneToOne(mappedBy="usuario", fetch=FetchType.LAZY)
	private PessoaJuridica pessoaJuridica;

	//bi-directional many-to-one association to Servico
	@OneToMany(mappedBy="usuario")
	private List<Servico> servicos;

	public Usuario() {
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getEmailUser() {
		return this.emailUser;
	}

	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}

	public String getLoginUser() {
		return this.loginUser;
	}

	public void setLoginUser(String loginUser) {
		this.loginUser = loginUser;
	}

	public String getPasswordUser() {
		return this.passwordUser;
	}

	public void setPasswordUser(String passwordUser) {
		this.passwordUser = passwordUser;
	}

	public String getPrimeiroNome() {
		return this.primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUrlWebsite() {
		return this.urlWebsite;
	}

	public void setUrlWebsite(String urlWebsite) {
		this.urlWebsite = urlWebsite;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Leilao> getLeilaos() {
		return this.leilaos;
	}

	public void setLeilaos(List<Leilao> leilaos) {
		this.leilaos = leilaos;
	}

	public Leilao addLeilao(Leilao leilao) {
		getLeilaos().add(leilao);
		leilao.setUsuario(this);

		return leilao;
	}

	public Leilao removeLeilao(Leilao leilao) {
		getLeilaos().remove(leilao);
		leilao.setUsuario(null);

		return leilao;
	}

	public List<NovasMsgsOferta> getNovasMsgsOfertas() {
		return this.novasMsgsOfertas;
	}

	public void setNovasMsgsOfertas(List<NovasMsgsOferta> novasMsgsOfertas) {
		this.novasMsgsOfertas = novasMsgsOfertas;
	}

	public NovasMsgsOferta addNovasMsgsOferta(NovasMsgsOferta novasMsgsOferta) {
		getNovasMsgsOfertas().add(novasMsgsOferta);
		novasMsgsOferta.setUsuario(this);

		return novasMsgsOferta;
	}

	public NovasMsgsOferta removeNovasMsgsOferta(NovasMsgsOferta novasMsgsOferta) {
		getNovasMsgsOfertas().remove(novasMsgsOferta);
		novasMsgsOferta.setUsuario(null);

		return novasMsgsOferta;
	}

	public List<Oferta> getOfertas() {
		return this.ofertas;
	}

	public void setOfertas(List<Oferta> ofertas) {
		this.ofertas = ofertas;
	}

	public Oferta addOferta(Oferta oferta) {
		getOfertas().add(oferta);
		oferta.setUsuario(this);

		return oferta;
	}

	public Oferta removeOferta(Oferta oferta) {
		getOfertas().remove(oferta);
		oferta.setUsuario(null);

		return oferta;
	}

	public PessoaFisica getPessoaFisica() {
		return this.pessoaFisica;
	}

	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}

	public PessoaJuridica getPessoaJuridica() {
		return this.pessoaJuridica;
	}

	public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
		this.pessoaJuridica = pessoaJuridica;
	}

	public List<Servico> getServicos() {
		return this.servicos;
	}

	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}

	public Servico addServico(Servico servico) {
		getServicos().add(servico);
		servico.setUsuario(this);

		return servico;
	}

	public Servico removeServico(Servico servico) {
		getServicos().remove(servico);
		servico.setUsuario(null);

		return servico;
	}

}