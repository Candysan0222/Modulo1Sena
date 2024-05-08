package modulo1Sena.modulo1.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="descripcion_ventas")
public class descripcionVentas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, length = 5)
	private Long id;
	
	@Column(name = "cantidad_productos",nullable = false, length = 50)
	private Double cantidadProductos;
	
	@Column(name = "precio",nullable = false, length = 50)
	private Double precio;
	
	@Column(name = "descuento",nullable = false, length = 50)
	private Double descuento;
	
	@Column(name = "sub_total",nullable = false, length = 50)
	private Double subTotal;
	
	@ManyToOne
	@JoinColumn(name="producto_id", nullable = false)
	private productos productoId;
	
	@ManyToOne
	@JoinColumn(name="ventas_id", nullable = false)
	private ventas ventasId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public Double getCantidadProductos() {
		return cantidadProductos;
	}

	public void setCantidadProductos(Double cantidadProductos) {
		this.cantidadProductos = cantidadProductos;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Double getDescuento() {
		return descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	public productos getProductoId() {
		return productoId;
	}

	public void setProductoId(productos productoId) {
		this.productoId = productoId;
	}

	public ventas getVentasId() {
		return ventasId;
	}

	public void setVentasId(ventas ventasId) {
		this.ventasId = ventasId;
	}

	

}
