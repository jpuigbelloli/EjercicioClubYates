package src;

public class YateVela extends Yate {

	Double alturaMastil;
	Double SupVelicaMayor;
	Double superficieTotal;

	public YateVela(Integer id, String nombre, String duenio, Double manga, Double calado, Double eslora, Integer tripulacion,
			Double peso, Double alturaMastil, Double supVelicaMayor, Double superficieTotal) {
		super(id, nombre, duenio, manga, calado, eslora, tripulacion, peso);
		this.alturaMastil = alturaMastil;
		SupVelicaMayor = supVelicaMayor;
		this.superficieTotal = superficieTotal;
	}

	public Double getAlturaMastil() {
		return alturaMastil;
	}

	public void setAlturaMastil(Double alturaMastil) {
		this.alturaMastil = alturaMastil;
	}

	public Double getSupVelicaMayor() {
		return SupVelicaMayor;
	}

	public void setSupVelicaMayor(Double supVelicaMayor) {
		SupVelicaMayor = supVelicaMayor;
	}

	public Double getSuperficieTotal() {
		return superficieTotal;
	}

	public void setSuperficieTotal(Double superficieTotal) {
		this.superficieTotal = superficieTotal;
	}

}
