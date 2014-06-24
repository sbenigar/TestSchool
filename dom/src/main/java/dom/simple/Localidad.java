package dom.simple;

import javax.jdo.annotations.*;

import org.apache.isis.applib.annotation.MemberOrder;

@PersistenceCapable
public class Localidad {
	
	// {{ Codigopostal (property)
	private int codigoPostal;

	@Column(allowsNull = "true")
	@MemberOrder(sequence = "1", name = "Codigo Postal")
	@Persistent
	public int getCodigopostal() {
		return codigoPostal;
	}

	public void setCodigopostal(final int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	// }}


	// {{ Nombre (property)
	private String nombre;

	@Column(allowsNull = "true")
	@MemberOrder(sequence = "1.1")
	@Persistent
	public String getNombre() {
		return nombre;
	}

	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}
	// }}

	public String title(){
		return "(" +codigoPostal + ")" +" - " + nombre;
	}

}
