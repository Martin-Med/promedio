package Martin;
import java.util.Scanner;
public class Promedio {
	
	private static Scanner leer;

	public static void main(String[] args) {
	
        leer = new Scanner(System.in);
		
		System.out.println("¿Cual es la cantidad de valores a promediar?");
		int valores = leer.nextInt();
		int i = 0, suma = 0;
		while (i < valores) {
		System.out.println("Ingrese valor");
		int n = leer.nextInt();
		suma = suma + n;
		i = i + 1;
		}
		float promedio = suma / valores;
		System.out.println("El promedio es de: " + promedio);
  }
}
