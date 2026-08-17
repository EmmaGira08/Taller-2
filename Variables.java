public class Variables {
    public static void main(String[] args) {
        System.out.println("Taller 2: Variables y Condicionales");

// 1 a 4: Enteros Primitivos
byte edadEstudiante = 20;
short anioActual = 2026;
int cantidadUsuarios = 1500;
long poblacionMundial = 8000000000L; // Uso del sufijo 'L' (Punto 8)

// 5 a 8: Flotantes y Decimales
float temperaturaCelsius = 23.5f; // Uso del sufijo 'f' (Punto 8)
float velocidadMantenida = 80.0f;
double precioDolar = 3950.50;
double notaPromedio = 4.2;

// 9 y 10: Booleanos
boolean esEstudianteActivo = true;
boolean matriculaPagada = true;

// 11 y 12: Caracteres (Uso de comillas simples '' para el Punto 8)
char genero = 'M';
char calificacionModulo = 'A';

// 13 a 20: Cadenas de Texto (String) y otras variables
String nombreUsuario = "Carlos";
String ciudadResidencia = "Medellín";
String universidad = "UPB";
String cursoMatematicas = "Calculo Multivariable";
String carreraUniversitaria = "Ingenieria de Sistemas";
int limiteCredito = 5000;
long metrosDistancia = 150000L;
double constanteMatematica = 3.14159;

// === REASIGNACIÓN DESDE OTRAS VARIABLES (Al menos 5) ===
limiteCredito = cantidadUsuarios;         // 1. int toma valor de int
notaPromedio = precioDolar;               // 2. double toma valor de double
carreraUniversitaria = cursoMatematicas;  // 3. String toma valor de String
metrosDistancia = poblacionMundial;       // 4. long toma valor de long
calificacionModulo = genero;              // 5. char toma valor de char

// === REASIGNACIÓN CON DATOS NUEVOS HARDCODED (QUEMADOS) ===
edadEstudiante = 21;
anioActual = 2027;
cantidadUsuarios = 2500;
poblacionMundial = 8500000000L;
temperaturaCelsius = 19.8f;
precioDolar = 4100.25;
esEstudianteActivo = false;
genero = 'F';
nombreUsuario = "Andrea";
ciudadResidencia = "Bogotá";
universidad = "EAFIT";
cursoMatematicas = "Ecuaciones Diferenciales";
velocidadMantenida = 95.5f;
matriculaPagada = false;
constanteMatematica = 2.71828;
    }
}