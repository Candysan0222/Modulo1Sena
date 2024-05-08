package modulo1Sena.modulo1.Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ventas")
public class ventas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, length = 5)
	private Long id;
	
	@Column(name = "total",nullable = false, length = 50)
	private Double total;
	
	@Column(name = "estado", nullable = false)
	private Boolean estado;
	
	@Column(name = "fecha_venta",nullable = false, length = 50)
	private Date fechaVenta;
	
	@ManyToOne
	@JoinColumn(name="cliente_id", nullable = false)
	private clientes clienteId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public clientes getClienteId() {
		return clienteId;
	}

	public void setClienteId(clientes clienteId) {
		this.clienteId = clienteId;
	}
	
	

}
