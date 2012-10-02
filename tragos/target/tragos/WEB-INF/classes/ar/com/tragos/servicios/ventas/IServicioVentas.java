package ar.com.tragos.servicios.ventas;

import java.util.List;

import ar.com.tragos.entity.Ventas;
import ar.com.tragos.views.TragoView;

public interface IServicioVentas {
	public List<Ventas> getVentas();
	public void registrarVenta(List<TragoView> listaTragos, int idMesa);
	public void cerrarMesa(String idMesa);
}
