package br.com.leilao.model.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the novas_msgs_oferta database table.
 * 
 */
@Embeddable
public class NovasMsgsOfertaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int fk_idUsuario;

	private int fk_idLeilao;

	private int fk_idOferta;

	public NovasMsgsOfertaPK() {
	}
	public int getFk_idUsuario() {
		return this.fk_idUsuario;
	}
	public void setFk_idUsuario(int fk_idUsuario) {
		this.fk_idUsuario = fk_idUsuario;
	}
	public int getFk_idLeilao() {
		return this.fk_idLeilao;
	}
	public void setFk_idLeilao(int fk_idLeilao) {
		this.fk_idLeilao = fk_idLeilao;
	}
	public int getFk_idOferta() {
		return this.fk_idOferta;
	}
	public void setFk_idOferta(int fk_idOferta) {
		this.fk_idOferta = fk_idOferta;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof NovasMsgsOfertaPK)) {
			return false;
		}
		NovasMsgsOfertaPK castOther = (NovasMsgsOfertaPK)other;
		return 
			(this.fk_idUsuario == castOther.fk_idUsuario)
			&& (this.fk_idLeilao == castOther.fk_idLeilao)
			&& (this.fk_idOferta == castOther.fk_idOferta);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.fk_idUsuario;
		hash = hash * prime + this.fk_idLeilao;
		hash = hash * prime + this.fk_idOferta;
		
		return hash;
	}
}