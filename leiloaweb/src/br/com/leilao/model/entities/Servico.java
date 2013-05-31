package br.com.leilao.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the servico database table.
 * 
 */
@Entity
public class Servico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String idServico;

	@Lob
	@Column(name="descricao_servico")
	private String descricaoServico;

	@Column(name="nome_servico")
	private String nomeServico;

	@Column(name="valor_servico")
	private BigDecimal valorServico;

	//bi-directional many-to-one association to Usuario
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fk_idUsuario")
	private Usuario usuario;

	//bi-directional many-to-one association to Categoria
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fk_idCategoria")
	private Categoria categoria;

	public Servico() {
	}

	public String getIdServico() {
		return this.idServico;
	}

	public void setIdServico(String idServico) {
		this.idServico = idServico;
	}

	public String getDescricaoServico() {
		return this.descricaoServico;
	}

	public void setDescricaoServico(String descricaoServico) {
		this.descricaoServico = descricaoServico;
	}

	public String getNomeServico() {
		return this.nomeServico;
	}

	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}

	public BigDecimal getValorServico() {
		return this.valorServico;
	}

	public void setValorServico(BigDecimal valorServico) {
		this.valorServico = valorServico;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}