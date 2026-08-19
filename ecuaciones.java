import java.util.Scanner;

public class ecuaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== MENÚ DE OPCIONES ===");
        System.out.println("1. Solución ecuación 1");
        System.out.println("2. Solución ecuación 2");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("\n--- RESOLVER ECUACIÓN 1 ---");
                System.out.print("Ingrese el valor de x: ");
                double x = scanner.nextDouble();

                System.out.print("Ingrese el valor de z: ");
                double z = scanner.nextDouble();

                // Validación DEPUÉS de capturar la variable z
                if (z == -1) {
                    System.out.println("Error: El valor de z no puede ser -1 porque produce división por cero.");
                } else {
                    double num1 = 3 * x;
                    double denSub1 = 3 * Math.pow(z, 2) + 2;
                    double denNum = 1 + (num1 / denSub1);
                    double numeradorPrincipal = num1 / denNum;

                    double fraccInterna = 1 / (1 + z);
                    double denSub2 = fraccInterna + 3 * Math.pow(x, 2) + 2 * z + 3;
                    double denominadorPrincipal = 1 + (1 / denSub2);
                    double y1 = numeradorPrincipal / denominadorPrincipal;

                    System.out.println("El resultado de la Ecuación 1 es y = " + y1);
                }
                break;

            case 2:
                System.out.println("\n--- RESOLVER ECUACIÓN 2 ---");
                System.out.print("Ingrese el valor de x: ");
                double x2 = scanner.nextDouble();

                System.out.print("Ingrese el valor de z: ");
                double z2 = scanner.nextDouble();

                // Validación DESPUÉS de capturar la variable z2
                if (z2 == 0 || (1 + 2 * z2) == 0) {
                    System.out.println("Error: Los valores ingresados producen una división sobre cero.");
                } else {
                    // Término 1: (x^2 + 3z + 2) / (2 + 1 / (1 + 2z))
                    double numTerm1 = Math.pow(x2, 2) + 3 * z2 + 2;
                    double denTerm1 = 2 + (1 / (1 + 2 * z2));
                    double term1 = numTerm1 / denTerm1;

                    // Sub-fracción más profunda: 2z + (3 / (1 + (5 / z)))
                    double denFondo = 1 + (5 / z2);
                    double denMedio = 2 * z2 + (3 / denFondo);

                    // Fracciones intermedias y unificación del Término 2
                    double denInterno = (1 / (1 + 3 * x2)) + ((3 * x2 + 1) / denMedio);
                    double denSub3 = 1 / denInterno;
                    double numSub2 = 1 + 3 * Math.pow(x2, 3) + 3 * z2 + 2;
                    double den2 = numSub2 / denSub3;
                    double term2 = 2 / den2;

                    double y2 = term1 + term2;
                    System.out.println("El resultado de la Ecuación 2 es y = " + y2);
                }
                break;

            case 3:
                System.out.println("Saliendo del programa...");
                break;

            default:
                System.out.println("Opción no válida. Intente de nuevo.");
                break;
        }

        scanner.close(); // Buena práctica: cerrar el recurso
    }
}
