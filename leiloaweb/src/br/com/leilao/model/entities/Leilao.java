package br.com.leilao.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the leilao database table.
 * 
 */
@Entity
public class Leilao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idLeilao;

	@Temporal(TemporalType.DATE)
	@Column(name="data_fim")
	private Date dataFim;

	@Temporal(TemporalType.DATE)
	@Column(name="data_inicio")
	private Date dataInicio;

	@Lob
	@Column(name="descricao_leilao")
	private String descricaoLeilao;

	private int idOferta_vencedora;

	@Column(name="nome_leilao")
	private String nomeLeilao;

	@Column(name="valor_maximo")
	private BigDecimal valorMaximo;

	//bi-directional many-to-one association to Usuario
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fk_idUsuario")
	private Usuario usuario;

	//bi-directional many-to-one association to Categoria
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fk_idCategoria")
	private Categoria categoria;

	//bi-directional many-to-one association to NovasMsgsOferta
	@OneToMany(mappedBy="leilao")
	private List<NovasMsgsOferta> novasMsgsOfertas;

	//bi-directional many-to-one association to Oferta
	@OneToMany(mappedBy="leilao")
	private List<Oferta> ofertas;

	public Leilao() {
	}

	public int getIdLeilao() {
		return this.idLeilao;
	}

	public void setIdLeilao(int idLeilao) {
		this.idLeilao = idLeilao;
	}

	public Date getDataFim() {
		return this.dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public Date getDataInicio() {
		return this.dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDescricaoLeilao() {
		return this.descricaoLeilao;
	}

	public void setDescricaoLeilao(String descricaoLeilao) {
		this.descricaoLeilao = descricaoLeilao;
	}

	public int getIdOferta_vencedora() {
		return this.idOferta_vencedora;
	}

	public void setIdOferta_vencedora(int idOferta_vencedora) {
		this.idOferta_vencedora = idOferta_vencedora;
	}

	public String getNomeLeilao() {
		return this.nomeLeilao;
	}

	public void setNomeLeilao(String nomeLeilao) {
		this.nomeLeilao = nomeLeilao;
	}

	public BigDecimal getValorMaximo() {
		return this.valorMaximo;
	}

	public void setValorMaximo(BigDecimal valorMaximo) {
		this.valorMaximo = valorMaximo;
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

	public List<NovasMsgsOferta> getNovasMsgsOfertas() {
		return this.novasMsgsOfertas;
	}

	public void setNovasMsgsOfertas(List<NovasMsgsOferta> novasMsgsOfertas) {
		this.novasMsgsOfertas = novasMsgsOfertas;
	}

	public NovasMsgsOferta addNovasMsgsOferta(NovasMsgsOferta novasMsgsOferta) {
		getNovasMsgsOfertas().add(novasMsgsOferta);
		novasMsgsOferta.setLeilao(this);

		return novasMsgsOferta;
	}

	public NovasMsgsOferta removeNovasMsgsOferta(NovasMsgsOferta novasMsgsOferta) {
		getNovasMsgsOfertas().remove(novasMsgsOferta);
		novasMsgsOferta.setLeilao(null);

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
		oferta.setLeilao(this);

		return oferta;
	}

	public Oferta removeOferta(Oferta oferta) {
		getOfertas().remove(oferta);
		oferta.setLeilao(null);

		return oferta;
	}

}