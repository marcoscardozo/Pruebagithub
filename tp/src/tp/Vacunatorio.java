package tp;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Vacunatorio {

	public int limiteDiarioVacunatorio = 200;
	private ArrayList<Paciente> vacunasAplicadas;
	private CentroAlmacenamiento centroAlmacenamiento;
	private Inscripcion inscripciones;

	public Vacunatorio() {

	}

	public void iniciarVacunacion(Fecha fecha, int limiteDiario) {

	}

	private ArrayList<Ciudadano> personasListaDeEspera() {
		return null;
	}

	private ArrayList<Paciente> reporteVacunasAplicadas() {
		return null;
	}

	private ArrayList<Paciente> listadoPorFecha() {
		return null;
	}

	@Override
	public String toString() {
		return "Vacunatorio [limiteDiarioVacunatorio=" + limiteDiarioVacunatorio + ", vacunasAplicadas="
				+ vacunasAplicadas + ", centroAlmacenamiento=" + centroAlmacenamiento + ", inscripciones="
				+ inscripciones + "]";
	}
}
