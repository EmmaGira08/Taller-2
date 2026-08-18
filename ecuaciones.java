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

// Numerador: (3x) / (1 + (3x) / (3z^2 + 2))
double num1 = 3 * x;
double denSub1 = 3 * Math.pow(z, 2) + 2;
double denNum = 1 + (num1 / denSub1);
double numeradorPrincipal = num1 / denNum;

// Denominador: 1 + 1 / ((1 / (1 + z)) + 3x^2 + 2z + 3)
double fraccInterna = 1 / (1 + z);
double denSub2 = fraccInterna + 3 * Math.pow(x, 2) + 2 * z + 3;
double denominadorPrincipal = 1 + (1 / denSub2);
double y1 = numeradorPrincipal / denominadorPrincipal;
System.out.println("El resultado de la Ecuación 1 es y = " + y1);
if (z == -1) {
    System.out.println("Error: El valor de z no puede ser -1 porque produce división por cero.");
} else {
    // Código de los cálculos de la Ecuación 1
}


        
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
