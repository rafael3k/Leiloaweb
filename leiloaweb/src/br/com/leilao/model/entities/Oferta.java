package br.com.leilao.model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the oferta database table.
 * 
 */
@Entity
public class Oferta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idOferta;

	@Column(name="atualizada_lida")
	private String atualizadaLida;

	@Temporal(TemporalType.DATE)
	@Column(name="data_oferta")
	private Date dataOferta;

	@Lob
	@Column(name="descricao_oferta")
	private String descricaoOferta;

	@Column(name="lida_leiloeiro")
	private String lidaLeiloeiro;

	@Column(name="qualificacao_oferta")
	private int qualificacaoOferta;

	@Column(name="valor_oferta")
	private BigDecimal valorOferta;

	//bi-directional many-to-one association to NovasMsgsOferta
	@OneToMany(mappedBy="oferta")
	private List<NovasMsgsOferta> novasMsgsOfertas;

	//bi-directional many-to-one association to Leilao
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fk_idLeilao")
	private Leilao leilao;

	//bi-directional many-to-one association to Usuario
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fk_idUsuario")
	private Usuario usuario;

	public Oferta() {
	}

	public int getIdOferta() {
		return this.idOferta;
	}

	public void setIdOferta(int idOferta) {
		this.idOferta = idOferta;
	}

	public String getAtualizadaLida() {
		return this.atualizadaLida;
	}

	public void setAtualizadaLida(String atualizadaLida) {
		this.atualizadaLida = atualizadaLida;
	}

	public Date getDataOferta() {
		return this.dataOferta;
	}

	public void setDataOferta(Date dataOferta) {
		this.dataOferta = dataOferta;
	}

	public String getDescricaoOferta() {
		return this.descricaoOferta;
	}

	public void setDescricaoOferta(String descricaoOferta) {
		this.descricaoOferta = descricaoOferta;
	}

	public String getLidaLeiloeiro() {
		return this.lidaLeiloeiro;
	}

	public void setLidaLeiloeiro(String lidaLeiloeiro) {
		this.lidaLeiloeiro = lidaLeiloeiro;
	}

	public int getQualificacaoOferta() {
		return this.qualificacaoOferta;
	}

	public void setQualificacaoOferta(int qualificacaoOferta) {
		this.qualificacaoOferta = qualificacaoOferta;
	}

	public BigDecimal getValorOferta() {
		return this.valorOferta;
	}

	public void setValorOferta(BigDecimal valorOferta) {
		this.valorOferta = valorOferta;
	}

	public List<NovasMsgsOferta> getNovasMsgsOfertas() {
		return this.novasMsgsOfertas;
	}

	public void setNovasMsgsOfertas(List<NovasMsgsOferta> novasMsgsOfertas) {
		this.novasMsgsOfertas = novasMsgsOfertas;
	}

	public NovasMsgsOferta addNovasMsgsOferta(NovasMsgsOferta novasMsgsOferta) {
		getNovasMsgsOfertas().add(novasMsgsOferta);
		novasMsgsOferta.setOferta(this);

		return novasMsgsOferta;
	}

	public NovasMsgsOferta removeNovasMsgsOferta(NovasMsgsOferta novasMsgsOferta) {
		getNovasMsgsOfertas().remove(novasMsgsOferta);
		novasMsgsOferta.setOferta(null);

		return novasMsgsOferta;
	}

	public Leilao getLeilao() {
		return this.leilao;
	}

	public void setLeilao(Leilao leilao) {
		this.leilao = leilao;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}