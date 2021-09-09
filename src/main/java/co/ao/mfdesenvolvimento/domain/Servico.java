/*Estado : 1 - Disponivel
* Estado : 2 - Indisponivel
* */
package co.ao.mfdesenvolvimento.domain;

import java.io.Serializable;

public class Servico implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idServico;
	private String servico;
	private Double custo;
	private Double ganho;
	private Double preco;
	private int estado;
	public Servico() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Servico(Integer idServico, String servico, Double custo, Double ganho, Double preco, int estado) {
		super();
		this.idServico = idServico;
		this.servico = servico;
		this.custo = custo;
		this.ganho = ganho;
		this.preco = preco;
		this.estado = estado;
	}
	public Integer getIdServico() {
		return idServico;
	}
	public void setIdServico(Integer idServico) {
		this.idServico = idServico;
	}
	public String getServico() {
		return servico;
	}
	public void setServico(String servico) {
		this.servico = servico;
	}
	public Double getCusto() {
		return custo;
	}
	public void setCusto(Double custo) {
		this.custo = custo;
	}
	public Double getGanho() {
		return ganho;
	}
	public void setGanho(Double ganho) {
		this.ganho = ganho;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
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
		result = prime * result + ((custo == null) ? 0 : custo.hashCode());
		result = prime * result + estado;
		result = prime * result + ((ganho == null) ? 0 : ganho.hashCode());
		result = prime * result + ((idServico == null) ? 0 : idServico.hashCode());
		result = prime * result + ((preco == null) ? 0 : preco.hashCode());
		result = prime * result + ((servico == null) ? 0 : servico.hashCode());
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
		Servico other = (Servico) obj;
		if (custo == null) {
			if (other.custo != null)
				return false;
		} else if (!custo.equals(other.custo))
			return false;
		if (estado != other.estado)
			return false;
		if (ganho == null) {
			if (other.ganho != null)
				return false;
		} else if (!ganho.equals(other.ganho))
			return false;
		if (idServico == null) {
			if (other.idServico != null)
				return false;
		} else if (!idServico.equals(other.idServico))
			return false;
		if (preco == null) {
			if (other.preco != null)
				return false;
		} else if (!preco.equals(other.preco))
			return false;
		if (servico == null) {
			if (other.servico != null)
				return false;
		} else if (!servico.equals(other.servico))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Servico [idServico=" + idServico + ", servico=" + servico + ", custo=" + custo + ", ganho=" + ganho
				+ ", preco=" + preco + ", estado=" + estado + "]";
	}
	
}
