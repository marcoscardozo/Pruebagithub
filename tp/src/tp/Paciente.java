package tp;

import java.util.Date;

public abstract class Paciente extends Ciudadano {

	private Date fechaTurno;
	private Vacuna vacuna;
	
	public Paciente(int dni, int edad, boolean enfermedadPreexistente, boolean personalSalud) {
			super(dni,edad,enfermedadPreexistente,personalSalud);
	}

	public boolean asignarTurno(Fecha f) {
		return true;
	}
	public boolean asignarVacuna(Vacuna v) {
		return true;
	}
	public Fecha getFechaTurno() {
		return null;
	}

	public int prioridad() {
		return 0;
	}

	public String toString() {
		return null;
	}

	public String obtenerVacuna() {
		return null;
	}

	
	// comparable <--

}
