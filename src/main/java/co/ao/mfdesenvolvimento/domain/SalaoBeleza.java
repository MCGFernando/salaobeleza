/*Estado : 1 - Activo
* Estado : 2 - Inativo
* */
package co.ao.mfdesenvolvimento.domain;

import java.io.Serializable;
import java.util.Date;

public class SalaoBeleza implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idSalaoBeleza;
	private String nome;
	private String descricao;
	private Date registo;
	private int estado;
	public SalaoBeleza() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SalaoBeleza(Integer idSalaoBeleza, String nome, String descricao, Date registo, int estado) {
		super();
		this.idSalaoBeleza = idSalaoBeleza;
		this.nome = nome;
		this.descricao = descricao;
		this.registo = registo;
		this.estado = estado;
	}
	public Integer getIdSalaoBeleza() {
		return idSalaoBeleza;
	}
	public void setIdSalaoBeleza(Integer idSalaoBeleza) {
		this.idSalaoBeleza = idSalaoBeleza;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getRegisto() {
		return registo;
	}
	public void setRegisto(Date registo) {
		this.registo = registo;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + estado;
		result = prime * result + ((idSalaoBeleza == null) ? 0 : idSalaoBeleza.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((registo == null) ? 0 : registo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SalaoBeleza other = (SalaoBeleza) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (estado != other.estado)
			return false;
		if (idSalaoBeleza == null) {
			if (other.idSalaoBeleza != null)
				return false;
		} else if (!idSalaoBeleza.equals(other.idSalaoBeleza))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (registo == null) {
			if (other.registo != null)
				return false;
		} else if (!registo.equals(other.registo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "SalaoBeleza [idSalaoBeleza=" + idSalaoBeleza + ", nome=" + nome + ", descricao=" + descricao
				+ ", registo=" + registo + ", estado=" + estado + "]";
	}
	
}
