package ec.edu.puce;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Alternativa a partir de la version 26");
		
		int edad = 19;
		boolean mayorEdad = false;
		String nombre = "Sebas";
		
		System.out.println("La edad es: " + edad + "y su nombre es: " + nombre);
		System.out.printf("La edad es: %s y su nombre es: %s\n", edad, nombre);
		
		if (edad > 18) {
			System.out.println("\tMayor de edad");
		} else {
			System.out.println("\tMenor de edad");
		}
	}
}