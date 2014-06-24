package dom.simple;

import javax.jdo.annotations.Column;
import javax.jdo.annotations.Discriminator;
import javax.jdo.annotations.DiscriminatorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.value.Date;

@PersistenceCapable
@Inheritance(strategy=InheritanceStrategy.NEW_TABLE)
@Discriminator(strategy = DiscriminatorStrategy.CLASS_NAME)
public abstract class Persona {	
	
		// {{ DNI (property)
		private int dni;
		@MemberOrder(sequence = "1.3")
		
		public int getDni() {
			return dni;
		}

		public void setDni (final int dni) {
			this.dni = dni;
		}
		// }}

		// {{ Apellido (property)
		
		private String apellido;
		@MemberOrder(sequence = "1.1")
		@javax.jdo.annotations.Column(allowsNull="false")
		
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		// }}

		// {{ Nombre (property)
	    
		private String nombre;
		@javax.jdo.annotations.Column(allowsNull="false")
	    @MemberOrder(sequence="1.2")
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		// {{ Direccion (property)
		private Direccion direccion;

		@MemberOrder(sequence = "1.5")
		@Column(allowsNull = "true", name = "DIRECCION_ID")
		
	    public Direccion getDireccion() {
			return direccion;
		}

		public void setDireccion(final Direccion direccion) {
			this.direccion = direccion;
		}

		/*// {{ Fecha de nacimiento (property)
		private Date fechadeNacimiento;
		@MemberOrder(sequence = "1.4")
		@javax.jdo.annotations.Column(allowsNull="false")
		@Persistent
		public Date getFechadeNacimiento() {
			return fechadeNacimiento;
		}
		public void setFechadeNacimiento(Date fechadeNacimiento) {
			this.fechadeNacimiento = fechadeNacimiento;
		}*/

		// {{ Nacionalidad (property)
		private String nacionalidad;
		@MemberOrder(sequence = "1.6")
		@javax.jdo.annotations.Column(allowsNull="false")
		
		public String getNacionalidad() {
			return nacionalidad;
		}
		public void setNacionalidad(String nacionalidad) {
			this.nacionalidad = nacionalidad;
		}

		// {{ Sexo (property)
		private String sexo;
		@MemberOrder(sequence = "1.7")
		@javax.jdo.annotations.Column(allowsNull="false")
		
		public String getSexo() {
			return sexo;
		}
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}


		// {{ Telefono (property)
		private int telefono;
		@MemberOrder(sequence = "1.8")
		@javax.jdo.annotations.Column(allowsNull="false")
		
		public int getTelefono() {
			return telefono;
		}
		public void setTelefono(int telefono) {
			this.telefono = telefono;
		}
		
		public String title(){
			return apellido + ", " + nombre + " " + Integer.toString(dni) +/* " - " + fechadeNacimiento.toString() + */" - " +
					sexo + " - " + nacionalidad + " - " + Integer.toString(telefono) + "Direccion: " + direccion.title() + ".";
		}
		
}
