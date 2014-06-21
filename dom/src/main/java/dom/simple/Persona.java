package dom.simple;

import org.apache.isis.applib.value.Date;

public class Persona {	

	
	/* LAS ANOTACIONES DE PERSISTENCIA Y LA REFERENCIA DE HERENCIA EN "ALUMNO" LAS AGREGO CUANDO SEPA BIEN COMO 
	  SE PERSISTEN CLASES HEREDADAS. PARA NO METER MANO SIN SABER.. */
	
		private int dni;
		public int getDni() {
			return dni;
		}
		public void setDni(int dni) {
			this.dni = dni;
		}


		private String apellido;
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}


		private String nombre;
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		private Direccion direccion;
		public Direccion getDireccion() {
			return direccion;
		}
		public void setDireccion(Direccion direccion) {
			this.direccion = direccion;
		}


		private Date fechadeNacimiento;
		public Date getFechadeNacimiento() {
			return fechadeNacimiento;
		}
		public void setFechadeNacimiento(Date fechadeNacimiento) {
			this.fechadeNacimiento = fechadeNacimiento;
		}


		private String nacionalidad;
		public String getNacionalidad() {
			return nacionalidad;
		}
		public void setNacionalidad(String nacionalidad) {
			this.nacionalidad = nacionalidad;
		}


		private String sexo;
		public String getSexo() {
			return sexo;
		}
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}


		private int telefono;	
		public int getTelefono() {
			return telefono;
		}
		public void setTelefono(int telefono) {
			this.telefono = telefono;
		}
		
		public String title(){
			return apellido + ", " + nombre + " " + Integer.toString(dni) + " - " + fechadeNacimiento.toString() + " - " +
					sexo + " - " + nacionalidad + " - " + Integer.toString(telefono) + "Direccion: " + direccion.title() + ".";
		}
		
}
