 package backend.pasteleria.model;
 

 import javax.persistence.Column;
 import javax.persistence.Entity;
 import javax.persistence.GeneratedValue;
 import javax.persistence.GenerationType;
 import javax.persistence.Id;
 import javax.persistence.Table;

 import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
 
 @Entity
 @Table(name="Pasteles")

public class Pastel {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		@Column
		private String nombre_pastel;
		private String tipo;
		private long peso;
		private String fecha_Solicitud;
		private String fecha_Entrega;
		private String solicitante;
		private String empleado;
		private String notas;
		
		
		public Pastel() {
			
		}


		public Pastel(Integer id, String nombre_pastel, String tipo, long peso, String fecha_Solicitud,
				String fecha_Entrega, String solicitante, String empleado, String notas) {
			super();
			this.id = id;
			this.nombre_pastel = nombre_pastel;
			this.tipo = tipo;
			this.peso = peso;
			this.fecha_Solicitud = fecha_Solicitud;
			this.fecha_Entrega = fecha_Entrega;
			this.solicitante = solicitante;
			this.empleado = empleado;
			this.notas = notas;
		}


		public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public String getNombre_pastel() {
			return nombre_pastel;
		}


		public void setNombre_pastel(String nombre_pastel) {
			this.nombre_pastel = nombre_pastel;
		}


		public String getTipo() {
			return tipo;
		}


		public void setTipo(String tipo) {
			this.tipo = tipo;
		}


		public long getPeso() {
			return peso;
		}


		public void setPeso(long peso) {
			this.peso = peso;
		}


		public String getFecha_Solicitud() {
			return fecha_Solicitud;
		}


		public void setFecha_Solicitud(String fecha_Solicitud) {
			this.fecha_Solicitud = fecha_Solicitud;
		}


		public String getFecha_Entrega() {
			return fecha_Entrega;
		}


		public void setFecha_Entrega(String fecha_Entrega) {
			this.fecha_Entrega = fecha_Entrega;
		}


		public String getSolicitante() {
			return solicitante;
		}


		public void setSolicitante(String solicitante) {
			this.solicitante = solicitante;
		}


		public String getEmpleado() {
			return empleado;
		}


		public void setEmpleado(String empleado) {
			this.empleado = empleado;
		}


		public String getNotas() {
			return notas;
		}


		public void setNotas(String notas) {
			this.notas = notas;
		}


		@Override
		public String toString() {
			return "pasteleria [id=" + id + ", nombre_pastel=" + nombre_pastel + ", tipo=" + tipo + ", peso=" + peso
					+ ", fecha_Solicitud=" + fecha_Solicitud + ", fecha_Entrega=" + fecha_Entrega + ", solicitante="
					+ solicitante + ", empleado=" + empleado + ", notas=" + notas + "]";
		}

		
		
		

}
