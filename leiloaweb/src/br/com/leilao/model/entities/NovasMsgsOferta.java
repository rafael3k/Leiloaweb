package br.com.leilao.model.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the novas_msgs_oferta database table.
 * 
 */
@Entity
@Table(name="novas_msgs_oferta")
public class NovasMsgsOferta implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private NovasMsgsOfertaPK id;

	@Column(name="msg_lida")
	private String msgLida;

	//bi-directional many-to-one association to Usuario
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fk_idUsuario")
	private Usuario usuario;

	//bi-directional many-to-one association to Leilao
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fk_idLeilao")
	private Leilao leilao;

	//bi-directional many-to-one association to Oferta
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fk_idOferta")
	private Oferta oferta;

	public NovasMsgsOferta() {
	}

	public NovasMsgsOfertaPK getId() {
		return this.id;
	}

	public void setId(NovasMsgsOfertaPK id) {
		this.id = id;
	}

	public String getMsgLida() {
		return this.msgLida;
	}

	public void setMsgLida(String msgLida) {
		this.msgLida = msgLida;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Leilao getLeilao() {
		return this.leilao;
	}

	public void setLeilao(Leilao leilao) {
		this.leilao = leilao;
	}

	public Oferta getOferta() {
		return this.oferta;
	}

	public void setOferta(Oferta oferta) {
		this.oferta = oferta;
	}

}