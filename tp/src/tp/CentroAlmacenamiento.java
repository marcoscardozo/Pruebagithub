package tp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CentroAlmacenamiento {

	private Map<String, ArrayList<Vacuna>> vacunas;
	public TipoVacuna t;
	private int limiteDiario;

	public CentroAlmacenamiento(int limiteDiario) {
		this.limiteDiario = limiteDiario;
	}

	public void agregarVacunas(int cant, String nombre, int temp) {
	}

	public int obtenerCantidadDevacunasPorNombre(String nombre) {
		return 0;
	}

	private void descontarVacuna(String nombre) {
	}

	public String toString() {
		return null;
	}

	// enum--------------------------------------------------------------------------------------------------
	enum TipoVacuna {
		PZIFER("pzifer"), SPUTNIK("sputnik"), SINOPHARM("sinopharm"), MODERNA("moderna"), ASTRANEZCA("astranezca");
// recibe en mayusculas y devuelve lo de adentro, en minuscula.

		private TipoVacuna(String nombre) {
			this.tipoVacuna = nombre;

		}

		private String tipoVacuna;

		public String getTipoVacuna() {
			return tipoVacuna;
		}
	}
	// ----------------------------------------------------------------------------------------------------------------

	public static void main(String[] args) {
//		TipoVacuna tipo = Enum.valueOf(TipoVacuna.class, "MODERNA");
//		System.out.println(tipo.getTipoVacuna());
	

	}
}
