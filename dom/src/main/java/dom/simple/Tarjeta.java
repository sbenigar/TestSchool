package dom.simple;

import javax.jdo.annotations.Column;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.annotation.Title;


@PersistenceCapable
public class Tarjeta {
	
	
	
	// {{ Nombre (property)
	private String nombre;
	
	@Persistent
	@MemberOrder(sequence = "1")
	@Column(allowsNull = "true", name = "nombre_t")
	@Title
	public String getNombre() {
		return nombre;
	}

	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}
	// }}


	// {{ Cuerpo (property)
	private String cuerpo;

	@Persistent
	@MemberOrder(sequence = "1.1")
	@Column(allowsNull = "true", name = "cuerpo_t")
	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(final String cuerpo) {
		this.cuerpo = cuerpo;
	}
	// }}

	public Tarjeta(String tipo) {
		if (tipo=="empty"){
			setNombre("Nombre_Tarjeta");
			setCuerpo("Texto del cuerpo");
		}
	}

	public Tarjeta() {
		// TODO Auto-generated constructor stub
	}

}
