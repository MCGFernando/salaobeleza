/*Estado : 1 - Activo
* Estado : 2 - Inativo
* Estado : 3 - Senha Inalterada
* */
package co.ao.mfdesenvolvimento.domain;

import java.io.Serializable;
import java.util.Date;

public class Conta implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idConta;
	private String email;
	private String senha;
	private Date registo;
	private int estado;
	public Conta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Conta(Integer idConta, String email, String senha, Date registo, int estado) {
		super();
		this.idConta = idConta;
		this.email = email;
		this.senha = senha;
		this.registo = registo;
		this.estado = estado;
	}
	public Integer getIdConta() {
		return idConta;
	}
	public void setIdConta(Integer idConta) {
		this.idConta = idConta;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
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
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + estado;
		result = prime * result + ((idConta == null) ? 0 : idConta.hashCode());
		result = prime * result + ((registo == null) ? 0 : registo.hashCode());
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
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
		Conta other = (Conta) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (estado != other.estado)
			return false;
		if (idConta == null) {
			if (other.idConta != null)
				return false;
		} else if (!idConta.equals(other.idConta))
			return false;
		if (registo == null) {
			if (other.registo != null)
				return false;
		} else if (!registo.equals(other.registo))
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Conta [idConta=" + idConta + ", email=" + email + ", senha=" + senha + ", registo=" + registo
				+ ", estado=" + estado + "]";
	}
	
	
}
