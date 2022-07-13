package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import excepciones.NoHayAmarraDisponibleException;
import src.Fondeadero;
import src.Yate;
import src.YateMotor;
import src.YateVela;

public class testCasesYates {

	@Test
	public void test() {
		Boolean exito = true;
		assertTrue(exito);
	}

	@Test
	public void queSePuedaCrearUnFondeadero() {
		Integer CANTIDAD_MAXIMA_AMARRAS_ESPERADAS = 70;
		Integer ID_ESPERADO = 1;

		Fondeadero puertoBlack = new Fondeadero(ID_ESPERADO, CANTIDAD_MAXIMA_AMARRAS_ESPERADAS);

		assertEquals(CANTIDAD_MAXIMA_AMARRAS_ESPERADAS, puertoBlack.getCantidadAmarrasMaxima());
	}

	@Test
	public void queSePuedaCrearUnYateAMotor() {
		Integer ID_DE_YATE_ESPERADO = 1;
		String NOMBRE_DE_YATE_ESPERADO = "AZ1";
		String DUENIO_DE_YATE_ESPERADO = "Andrés Borgeat";
		Double MANGA_ESPERADA = 18.87;
		Double CALADO_ESPERADO = 5.15;
		Double ESLORA_ESPERADA = 119.0;
		Integer TRIPULACION_ESPERADA = 37;
		Double PESO_ESPERADO = 5500.0;
		Double DESPLAZAMIENTO_ESPERADO = 5959.0;
		String PROPULSION_ESPERADA = "2 x motores diésel MAN RK2805";
		Double POTENCIA_ESPERADA = 9000.0;
		Double VELOCIDAD_ESPERADA = 23.0;
		Double AUTONOMIA_ESPERADA = 6500.0;

		Yate AZ1 = new YateMotor(ID_DE_YATE_ESPERADO, NOMBRE_DE_YATE_ESPERADO, DUENIO_DE_YATE_ESPERADO, MANGA_ESPERADA, CALADO_ESPERADO,
				ESLORA_ESPERADA, TRIPULACION_ESPERADA, PESO_ESPERADO, DESPLAZAMIENTO_ESPERADO, PROPULSION_ESPERADA,
				POTENCIA_ESPERADA, VELOCIDAD_ESPERADA, AUTONOMIA_ESPERADA);

		assertNotNull(AZ1);

	}

	@Test
	public void queSePuedaCrearUnYateAVela() {
		Integer ID_DE_YATE_ESPERADO = 2;
		String NOMBRE_DE_YATE_ESPERADO = "XXR";
		String DUENIO_DE_YATE_ESPERADO = "Sebastian Pardo";
		Double MANGA_ESPERADA = 6.90;
		Double CALADO_ESPERADO = 2.7;
		Double ESLORA_ESPERADA = 13.45;
		Integer TRIPULACION_ESPERADA = 5;
		Double PESO_ESPERADO = 1400.0;
		Double ALTURA_MASTIL_ESPERADA = 21.5;
		Double SUPERFICIE_VELICA_MAYOR_ESPERADA = 85.0;
		Double SUPERFICIE_TOTAL_ESPERADA = 133.0;

		Yate XXR = new YateVela(ID_DE_YATE_ESPERADO, NOMBRE_DE_YATE_ESPERADO, DUENIO_DE_YATE_ESPERADO, MANGA_ESPERADA, CALADO_ESPERADO,
				ESLORA_ESPERADA, TRIPULACION_ESPERADA, PESO_ESPERADO, ALTURA_MASTIL_ESPERADA,
				SUPERFICIE_VELICA_MAYOR_ESPERADA, SUPERFICIE_TOTAL_ESPERADA);

		assertNotNull(XXR);
	}

	@Test
	public void queSePuedaAmarrarUnYate() throws NoHayAmarraDisponibleException{
		Integer ID_DE_YATE_ESPERADO = 1;
		String NOMBRE_DE_YATE_ESPERADO = "XXR";
		String DUENIO_DE_YATE_ESPERADO = "Sebastian Pardo";
		Double MANGA_ESPERADA = 6.90;
		Double CALADO_ESPERADO = 2.7;
		Double ESLORA_ESPERADA = 13.45;
		Integer TRIPULACION_ESPERADA = 5;
		Double PESO_ESPERADO = 1400.0;
		Double ALTURA_MASTIL_ESPERADA = 21.5;
		Double SUPERFICIE_VELICA_MAYOR_ESPERADA = 85.0;
		Double SUPERFICIE_TOTAL_ESPERADA = 133.0;
		
		Integer CANTIDAD_YATES_AMARRADOS_ESPERADOS = 1;
		Integer CANTIDAD_MAXIMA_AMARRAS_ESPERADAS = 1;
		Integer ID_ESPERADO = 1;
		Boolean exito = false;
		
		Fondeadero puertoBlack = new Fondeadero(ID_ESPERADO, CANTIDAD_MAXIMA_AMARRAS_ESPERADAS);
		Yate XXR = new YateVela(ID_DE_YATE_ESPERADO, NOMBRE_DE_YATE_ESPERADO, DUENIO_DE_YATE_ESPERADO, MANGA_ESPERADA, CALADO_ESPERADO,
				ESLORA_ESPERADA, TRIPULACION_ESPERADA, PESO_ESPERADO, ALTURA_MASTIL_ESPERADA,
				SUPERFICIE_VELICA_MAYOR_ESPERADA, SUPERFICIE_TOTAL_ESPERADA);
		
		exito = puertoBlack.amarrarYate(XXR);
		System.out.println(exito);
		
		System.out.println(puertoBlack.obtenerCantidadDeYatesAmarrados());
		assertEquals(CANTIDAD_YATES_AMARRADOS_ESPERADOS, puertoBlack.obtenerCantidadDeYatesAmarrados());
				
	}
}
