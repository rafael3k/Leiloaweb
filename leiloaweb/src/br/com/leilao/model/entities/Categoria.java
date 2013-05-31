package br.com.leilao.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the categoria database table.
 * 
 */
@Entity
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idCategoria;

	@Column(name="nome_categoria")
	private String nomeCategoria;

	//bi-directional many-to-one association to Categoria
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fk_idCategoriaMae")
	private Categoria categoria;

	//bi-directional many-to-one association to Categoria
	@OneToMany(mappedBy="categoria")
	private List<Categoria> categorias;

	//bi-directional many-to-one association to Leilao
	@OneToMany(mappedBy="categoria")
	private List<Leilao> leilao;

	//bi-directional many-to-one association to Servico
	@OneToMany(mappedBy="categoria")
	private List<Servico> servicos;

	public Categoria() {
	}

	public int getIdCategoria() {
		return this.idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNomeCategoria() {
		return this.nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Categoria> getCategorias() {
		return this.categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	public Categoria addCategoria(Categoria categoria) {
		getCategorias().add(categoria);
		categoria.setCategoria(this);

		return categoria;
	}

	public Categoria removeCategoria(Categoria categoria) {
		getCategorias().remove(categoria);
		categoria.setCategoria(null);

		return categoria;
	}

	public List<Leilao> getLeilao() {
		return leilao;
	}

	public void setLeilao(List<Leilao> leilao) {
		this.leilao = leilao;
	}

	public List<Servico> getServicos() {
		return this.servicos;
	}

	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}

	public Servico addServico(Servico servico) {
		getServicos().add(servico);
		servico.setCategoria(this);

		return servico;
	}

	public Servico removeServico(Servico servico) {
		getServicos().remove(servico);
		servico.setCategoria(null);

		return servico;
	}

}