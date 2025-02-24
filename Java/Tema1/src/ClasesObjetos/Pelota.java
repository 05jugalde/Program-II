package ClasesObjetos;

public class Pelota {
	double radio;
	char color;
	boolean bota;
	double x;
	double y;
	
	// Constructores:
	public Pelota(double x, double y, double radio, char color, boolean bota) {
		this.x = x;
		this.y = y;
		this.radio = radio;
		this.color = color;
		this.bota = bota;
	}
	
	public Pelota(double x, double y, double radio, char color) {
		this.x = x;
		this.y = y;
		this.radio = radio;
		this.color = color;
	}
	
	public Pelota(double x, double y, double radio) {
		this.x = x;
		this.y = y;
		this.radio = radio;
	}
	
	public Pelota() {
		
	}
	
	
	// Consultores
	public double getX() {
		return x;
	}
	
	public double gety() {
		return y;
	}
	
	public void getCoords() {
		System.out.println("( " + x + " , " + y + " )");
	}
	
	public double getRadio() {
		return radio;
	}
	
	public char getColor() {
		return color;
	}
	
	public boolean bota() {
		return bota;
	}
	
	
	//Modificadores:
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public void setCoords(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public void setColor(char color) {
		this.color = color;
	}
}
