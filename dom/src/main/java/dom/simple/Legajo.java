package dom.simple;

import javax.jdo.annotations.Column;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.annotation.Named;



@PersistenceCapable

public class Legajo {
	
	// {{ Tarjeta (property)
	private Tarjeta tarjeta;
	
	@Persistent
	@MemberOrder(sequence = "1", name = "tarjeta")
	@Column(allowsNull = "true", name = "TARJETA_ID")
	public Tarjeta getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(final Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}
	// }}


	public Legajo(String tipo) {
		if (tipo=="empty"){
			setTarjeta(new Tarjeta("empty"));
		}
	}
	
	@MemberOrder(sequence = "1.1", name = "Nueva Tarjeta")
	@Named("Nueva Tarjeta")
	public Tarjeta create (
			final @Named("Nombre") String nombre,
			final @Named("Cuerpo") String cuerpo){
		final Tarjeta obj = new Tarjeta();
		obj.setNombre(nombre);
		obj.setCuerpo(cuerpo);
			
		return obj;
	}
	
	
	
	public Legajo () {
		
	}
	
	public String title(){
		return "Legajo";
	}
}
