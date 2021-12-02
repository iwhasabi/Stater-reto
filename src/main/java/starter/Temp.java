package starter;

public class Temp {

	private Double grados;
	private String metrica;

	public Temp(Double grados, String metrica) {
		this.grados = grados;
		this.metrica = metrica;
	}

	public String consultaTemp() {
		String mensaje;
		switch (metrica) {
		case "celsius":
			mensaje = String.valueOf((grados-32)*5/9);
			mensaje= "La temperatura en Celsius es "+mensaje;

			break;

		case "fahrenheit":
			mensaje = String.valueOf((grados*9/5)+32);
			mensaje= "La temperatura en Fahrenheit es "+mensaje;
			break;
			
		default:
			mensaje = "Datos no computables";
			break;
		}

		return mensaje;
	}
}
