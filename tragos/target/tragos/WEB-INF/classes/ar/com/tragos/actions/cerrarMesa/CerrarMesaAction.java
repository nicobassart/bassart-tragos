package ar.com.tragos.actions.cerrarMesa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.WebApplicationContext;

import ar.com.tragos.actions.Action;
import ar.com.tragos.bean.cerrarmesa.CerrarMesaBean;
import ar.com.tragos.servicios.ventas.IServicioVentas;

@Controller
@Scope(value=WebApplicationContext.SCOPE_SESSION)
public class CerrarMesaAction extends Action implements ICerrarMesaAction{

	private static final long serialVersionUID = -2261476298684088030L;

	@Autowired
	private CerrarMesaBean cerrarMesaBean;
	
	@Autowired
	private IServicioVentas servicioVentas;
		
	@Override
	public String cerrarMesa() {
		cerrarMesaBean.getIdMesa();
		return "mesaCerradaSuccess";
	}

	@Override
	public String cerrarMesaSeleccionada() {
		//Se suponde que deberia cerrar la meza y quizas imprimir un ticket pero deberia estar implementado a nivle de servicio generar los ticket
		servicioVentas.cerrarMesa(cerrarMesaBean.getIdMesa());
		return "mesaCerradaSuccessOK";
	}
}
