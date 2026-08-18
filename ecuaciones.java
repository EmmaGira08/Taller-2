import java.util.Scanner;
public class ecuaciones {
    public static void main(String[] args) {
    // Dentro del método main:
Scanner scanner = new Scanner(System.in);


System.out.println("\n=== MENÚ DE OPCIONES ===");
System.out.println("1. Solución ecuación 1");
System.out.println("2. Solución ecuación 2");
System.out.println("3. Salir");
System.out.print("Seleccione una opción: ");


int opcion = scanner.nextInt();

switch (opcion) {
    case 1:
        // Ecuación 1 (por implementar)
        System.out.println("\n--- RESOLVER ECUACIÓN 1 ---");
System.out.print("Ingrese el valor de x: ");
double x = scanner.nextDouble();

System.out.print("Ingrese el valor de z: ");
double z = scanner.nextDouble();

        
        break;

    case 2:
        // Ecuación 2 (por implementar)
        break;
    case 3:
        System.out.println("Saliendo del programa...");
        break;
    default:
        System.out.println("Opción no válida. Intente de nuevo.");
        break;
}

    }
}
