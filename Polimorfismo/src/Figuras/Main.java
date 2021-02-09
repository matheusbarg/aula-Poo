package Figuras;




public class Main {

	public static void main(String[] args) {
	
	Retangulo rt = new Retangulo ("retangulo",20,50);
	Circulo c = new Circulo ("Circulo",50);
	Quadrado q = new Quadrado("Quadrado",50);
	Triangulo t = new Triangulo("Triangulo",50,50,50);
	
	
   System.out.println("Retangulo "+rt.getArea());
   System.out.println("Circulo "+c.getArea());
   System.out.println("Quadrado "+q.getArea());
   System.out.println("Triangulo "+t.getArea());
   
   
	
	
	}
	
}
