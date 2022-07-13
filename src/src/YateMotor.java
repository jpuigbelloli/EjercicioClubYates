package src;

public class YateMotor extends Yate {

	Double desplazamiento;
	String propulsion;
	Double potencia;
	Double velocidad;
	Double autonomia;

	public YateMotor(Integer id, String nombre, String duenio, Double manga, Double calado, Double eslora, Integer tripulacion,
			Double peso, Double desplazamiento, String propulsion, Double potencia, Double velocidad,
			Double autonomia) {
		super(id, nombre, duenio, manga, calado, eslora, tripulacion, peso);
		this.desplazamiento = desplazamiento;
		this.propulsion = propulsion;
		this.potencia = potencia;
		this.velocidad = velocidad;
		this.autonomia = autonomia;
	}

	public Double getDesplazamiento() {
		return desplazamiento;
	}

	public void setDesplazamiento(Double desplazamiento) {
		this.desplazamiento = desplazamiento;
	}

	public String getPropulsion() {
		return propulsion;
	}

	public void setPropulsion(String propulsion) {
		this.propulsion = propulsion;
	}

	public Double getPotencia() {
		return potencia;
	}

	public void setPotencia(Double potencia) {
		this.potencia = potencia;
	}

	public Double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}

	public Double getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(Double autonomia) {
		this.autonomia = autonomia;
	}

}
