package tp;

public class Ciudadano  {
	private boolean enfermedadPreexistente;
	private boolean personalSalud;
	private int dni;
	private int edad;

	public Ciudadano(int dni, int edad, boolean enfermedadPreexistente, boolean personalSalud) {
		this.dni = dni;
		this.edad = edad;
		this.enfermedadPreexistente = enfermedadPreexistente;
		this.personalSalud = personalSalud;
	}

	public int getDni() {
		return this.dni;
	}

	public int getEdad() {
		return this.edad;
	}

	public boolean isEnfermedadPreexistente() {
		return this.enfermedadPreexistente;
	}

	public boolean isPersonalSalud() {
		return this.personalSalud;
	}

	public Vacuna obtenerVacunaDePaciente() {
		return null; // llenar
	}
//	public Date getFechaTurno() {
//		return null; //llenar
//	}

	public String toString() {
		return null;	
	}

}
