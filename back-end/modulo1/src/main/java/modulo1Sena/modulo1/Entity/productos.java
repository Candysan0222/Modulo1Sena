package modulo1Sena.modulo1.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="productos")
public class productos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, length = 5)
	private Long id;
	
	@Column(name = "nombre_producto",nullable = false, length = 50)
	private String nombreProducto;
	
	@Column(name = "descripcion", nullable = false, length = 100)
	private String descripcion;
	
	@Column(name = "cantidad", nullable = false, length = 50)
	private Double cantidad;
	
	@Column(name = "precio", nullable = false, length = 50)
	private Double precio;
	
	@Column(name = "porcentaje_iva", nullable = false, length = 50)
	private Double porcentajeIva;
	
	@Column(name = "porcentaje_descuento", nullable = false, length = 50)
	private Double porcentajeDescuento;
	
	@Column(name = "estado", nullable = false)
	private Boolean estado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Double getCantidad() {
		return cantidad;
	}

	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Double getPorcentajeIva() {
		return porcentajeIva;
	}

	public void setPorcentajeIva(Double porcentajeIva) {
		this.porcentajeIva = porcentajeIva;
	}

	public Double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	public void setPorcentajeDescuento(Double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	

}
