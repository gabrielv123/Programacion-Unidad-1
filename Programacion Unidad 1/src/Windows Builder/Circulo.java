package FigurasGeometricas;

public class Circulo {
	double radio;
	double area;
	double longitud;

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	/**
	 * @author ikaslea
	 * 
	 *         contructor vacio
	 */
	public Circulo() {
		// Constructor clase Circulo
		/*
		 * comentarios de bloques
		 */
	}

	public Circulo(double radioInicial) {
		setRadio(radioInicial);
		setArea(Math.PI * radioInicial * radioInicial);
		setLongitud(2.0 * Math.PI * radioInicial);
		
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", area=" + area + ", longitud=" + longitud + "]";
	}

}
