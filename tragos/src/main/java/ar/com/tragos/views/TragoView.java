package ar.com.tragos.views;

import ar.com.tragos.entity.Trago;

public class TragoView extends Trago{
	private static final long serialVersionUID = 1L;

	private String cantidad;

	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public int getCantidadInt() {
		if(cantidad!=null && !"".equals(cantidad)) 
			return Integer.parseInt(cantidad);
		return 0;
	}
	

}
