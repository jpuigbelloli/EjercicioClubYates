package src;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

import excepciones.NoHayAmarraDisponibleException;

public class Fondeadero {

	Integer id;
	Integer cantidadAmarrasMaxima;
	HashSet<Yate> yatesAmarrados;

	public Fondeadero(Integer id, Integer cantidadAmarrasMaxima) {
		super();
		this.id = id;
		this.cantidadAmarrasMaxima = cantidadAmarrasMaxima;
		this.yatesAmarrados = new HashSet<Yate>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCantidadAmarrasMaxima() {
		return cantidadAmarrasMaxima;
	}

	public Integer getYatesAmarrados() {
		return yatesAmarrados.size();
	}

/*
	public Boolean amarrarYate(Yate nuevoYate) throws NoHayAmarraDisponibleException {
		Boolean amarrado = false;
		for (Yate yate : yatesAmarrados) {
			if(yate.getId() != nuevoYate.getId() && obtenerCantidadDeYatesAmarrados() >= cantidadAmarrasMaxima) {
				yatesAmarrados.add(nuevoYate);
				amarrado = true;
				System.out.println(yatesAmarrados.size());
				return amarrado;
			} else {
				throw new NoHayAmarraDisponibleException("No hay amarra disponible.");
			}
		}
		return amarrado;
	}
*/	

	public Boolean amarrarYate(Yate nuevoYate) throws NoHayAmarraDisponibleException {
		Boolean amarrado = false;
		if (yatesAmarrados.size() >= cantidadAmarrasMaxima) {
			throw new NoHayAmarraDisponibleException("No hay amarra disponible.");
		} else {
			yatesAmarrados.add(nuevoYate);
			amarrado = true;
			System.out.println(yatesAmarrados.size());
		}
		return amarrado;
	}


	public Integer obtenerCantidadDeYatesAmarrados() {
		return yatesAmarrados.size();
	}

}
