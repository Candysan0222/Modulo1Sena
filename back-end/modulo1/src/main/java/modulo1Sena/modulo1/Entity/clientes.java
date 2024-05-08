package modulo1Sena.modulo1.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="clientes")
public class clientes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, length = 5)
	private Long id;
	
	@Column(name = "tipo_identificacion",nullable = false, length = 50)
	private String tipoIdentificacion;
	
	@Column(name = "identificacion",nullable = false, length = 50)
	private String identificacion;
	
	@Column(name = "nombres_cliente",nullable = false, length = 50)
	private String nombresCliente;
	
	@Column(name = "apellidos_cliente",nullable = false, length = 50)
	private String apellidosCliente;
	
	@Column(name = "telefono",nullable = false, length = 50)
	private String telefono;
		
	@Column(name = "direccion_cliente",nullable = false, length = 50)
	private String direccionCliente;
	
	@Column(name = "ciudad",nullable = false, length = 100)
	private String ciudad;
	
	@Column(name = "correo_electronico",nullable = false, length = 50)
	private String correoElectronico;
	
	@Column(name = "estado", nullable = false)
	private Boolean estado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombresCliente() {
		return nombresCliente;
	}

	public void setNombresCliente(String nombresCliente) {
		this.nombresCliente = nombresCliente;
	}

	public String getApellidosCliente() {
		return apellidosCliente;
	}

	public void setApellidosCliente(String apellidosCliente) {
		this.apellidosCliente = apellidosCliente;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccionCliente() {
		return direccionCliente;
	}

	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	

}
