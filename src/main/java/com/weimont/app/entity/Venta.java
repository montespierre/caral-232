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
@Table(name="ventas")
@SequenceGenerator(name = "sq_ventas", sequenceName = "sq_ventas",
allocationSize = 1)
public class Venta implements Serializable{


	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idVenta")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_ventas")
	private Long idVenta;
	
    @ManyToOne
	@JoinColumn(name = "idEmpleado")
	private Empleado empleado;/////////////////////////
	
    @Column(name="fechaVenta")
	private String fechaVenta;// = formattedDate;
	
    @Column(name="horaVenta")
	private String horaVenta;// = strHour;
	
    @Column(name="unidTotales")
	private Long unidTotales;
	
    @Column(name="subTotal")
	private Double subTotal;
	
    @Column(name="igv")
	private Double igv;
	
    @Column(name="imporTotal")
	private Double imporTotal;
    
    
	public Venta() {
	}



	public Venta(Long idVenta, Long idEmpleado, String fechaVenta, String horaVenta, Long unidTotales,
			Double subTotal, Double igv, Double imporTotal) {
		super();
		this.idVenta = idVenta;
		this.empleado.setIdEmpleado(idEmpleado);
		this.fechaVenta = fechaVenta;
		this.horaVenta = horaVenta;
		this.unidTotales = unidTotales;
		this.subTotal = subTotal;
		this.igv = igv;
		this.imporTotal = imporTotal;
	}



	public Long getIdVenta() {
		return idVenta;
	}



	public void setIdVenta(Long idVenta) {
		this.idVenta = idVenta;
	}



	public Empleado getEmpleado() {
		return empleado;
	}



	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}



	public String getFechaVenta() {
		return fechaVenta;
	}



	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;
	}



	public String getHoraVenta() {
		return horaVenta;
	}



	public void setHoraVenta(String horaVenta) {
		this.horaVenta = horaVenta;
	}



	public Long getUnidTotales() {
		return unidTotales;
	}



	public void setUnidTotales(Long unidTotales) {
		this.unidTotales = unidTotales;
	}



	public Double getSubTotal() {
		return subTotal;
	}



	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}



	public Double getIgv() {
		return igv;
	}



	public void setIgv(Double igv) {
		this.igv = igv;
	}



	public Double getImporTotal() {
		return imporTotal;
	}



	public void setImporTotal(Double imporTotal) {
		this.imporTotal = imporTotal;
	}



	@Override
	public String toString() {
		return "Venta [idVenta=" + idVenta + ", empleado=" + empleado + ", fechaVenta=" + fechaVenta + ", horaVenta="
				+ horaVenta + ", unidTotales=" + unidTotales + ", subTotal=" + subTotal + ", igv=" + igv
				+ ", imporTotal=" + imporTotal + "]";
	}
    
	
    
}
