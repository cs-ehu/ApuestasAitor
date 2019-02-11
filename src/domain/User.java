package domain;


import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class User {
	@Id 
	private String DNI;
	private String usuario;
	private String contrase�a;
	private float saldo;
	private String tipo;


	public User(String DNI, String usuario, String contrase�a,float Saldo, String tipo) {
		super();
		this.DNI=DNI;
		this.usuario=usuario;
		this.contrase�a=contrase�a;
		this.saldo=Saldo;
		this.tipo=tipo;
	}
	


	public String getUser() {
		return usuario;
	}


	public String getContrase�a() {
		return contrase�a;
	}

	public String getTipo() {
		return tipo;
	}

	public float getSaldo() {
		return saldo;
	}
	
	public String getDNI() {
		return DNI;
	}
	
	public void setUser(String usuario) {
		this.usuario=usuario;
	}


	public void setContrase�a(String contrase�a) {
		this.contrase�a= contrase�a;
	}

	public void setTipo(String tipo) {
		this.tipo=tipo;
	}
	
	
	public void setSaldo(float saldo) {
		this.saldo=saldo;
	}
	
	public void setDNI(String DNI) {
		this.DNI=DNI;
	}
}
