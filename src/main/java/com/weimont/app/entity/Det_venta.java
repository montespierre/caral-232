package com.weimont.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="det_venta")
@SequenceGenerator(name = "sq_detventa", sequenceName = "sq_detventa",
allocationSize = 1)
public class Det_venta implements Serializable{


	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idDet_venta")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_detventa")
	private Long idDet_venta;
	
	@ManyToOne
	@JoinColumn(name = "idVenta")
	private Venta venta;
	
	@ManyToOne
	@JoinColumn(name="idArticulo")
	private Articulo articulo;
	
	@Column(name="cant")
	private Long cant;
	
	@Column(name="precioUnit")
	private Double precioUnit;
	
	@Column(name="importe")
	private Double importe;
	
	public Det_venta() {

	}

	public Det_venta(Long idDet_venta, Venta venta, Articulo articulo, Long cant, Double precioUnit, Double importe) {
		super();
		this.idDet_venta = idDet_venta;
		this.venta = venta;
		this.articulo = articulo;
		this.cant = cant;
		this.precioUnit = precioUnit;
		this.importe = importe;
	}

	public Long getIdDet_venta() {
		return idDet_venta;
	}

	public void setIdDet_venta(Long idDet_venta) {
		this.idDet_venta = idDet_venta;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public Long getCant() {
		return cant;
	}

	public void setCant(Long cant) {
		this.cant = cant;
	}

	public Double getPrecioUnit() {
		return precioUnit;
	}

	public void setPrecioUnit(Double precioUnit) {
		this.precioUnit = precioUnit;
	}

	public Double getImporte() {
		return importe;
	}

	public void setImporte(Double importe) {
		this.importe = importe;
	}

	@Override
	public String toString() {
		return "Det_venta [idDet_venta=" + idDet_venta + ", venta=" + venta + ", articulo=" + articulo + ", cant="
				+ cant + ", precioUnit=" + precioUnit + ", importe=" + importe + "]";
	}
	
	


	
	
}
