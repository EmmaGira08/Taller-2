# TALLER 2
## Integrantes:

 - Emmanuel Rios Molina.
 - Juan Pablo Morales Parra.
 - Emmanuel Giraldo Arango.
## Descripción:
Este taller tiene como objetivo entender el funcionamiento de las variables y condicionales dentro del entorno java para la creación de programas útiles que ayuden a solucionar problemas de una manera más fácil y rápida.

![enter image description here](https://codelearn.es/wp-content/uploads/sites/4/2021/11/code-944499_1280-1080x675.jpg)

## Programas que encontrarás aquí:

 - **Variables.java:**
   Se implementaron 20 variables abarcando:
- **Tipos Primitivos:** `byte`, `short`, `int`, `long`, `float`, `double`, `boolean`, `char`.
- **Tipos por Referencia:** `String`.

### Reglas de Literales Aplicadas:
1. **Sufijo `f` / `F`:** Usado en `temperaturaCelsius` y `velocidadMantenida` para especificar literales de tipo `float`.
2. **Sufijo `L` / `l`:** Usado en `poblacionMundial` y `metrosDistancia` para literales enteros de tipo `long`.
3. **Comillas Simples `' '`:** Usadas en `genero` y `calificacionModulo` para literales de tipo `char`.
  
 - **Ecuaciones.java:**
   ## Sección del Menú y Ecuación 1

### Menú Interactivo
Se construyó un menú basado en `Scanner` y un condicional `switch` que ofrece 3 opciones de ejecución.

### Ecuación 1
Se implementó la evaluación de la expresión matemática aplicando el método *divide y vencerás*:
1. **Numerador principal:** Se desglosó el término `3z^2 + 2` y la fracción correspondiente.
2. **Denominador principal:** Se evaluaron los términos con la función `Math.pow()` y la fracción `1 / (1 + z)`.
3. **Validación:** Se incluyó un condicional para prevenir indeclaraciones por división sobre cero.

 - Este programa contiene 2 ecuciones previamente propuestas de las cuáles podrás elegir una y asignar sus respectivos valores a sus variables para llegar a un resultado único.
### 🧮 Solución e Implementación - Ecuación 2

La **Ecuación 2** evalúa una expresión matemática compuesta por dos términos principales con múltiples niveles de fracciones continuas e iteradas:

$$y = \frac{x^2 + 3z + 2}{2 + \frac{1}{1 + 2z}} + \frac{2}{\frac{1 + 3x^3 + 3z + 2}{\frac{1}{\frac{1}{1 + 3x} + \frac{3x + 1}{2z + \frac{3}{1 + \frac{5}{z}}}}}}$$

#### 🛠️ Estrategia de Resolución (*Divide y Vencerás*)
Para traducir con precisión esta fórmula a Java sin perder legibilidad ni cometer errores de parentización, se desglosó la expresión en sub-variables intermedias:

1. **Término 1:** Se evalúa la fracción superior $T_1 = \frac{x^2 + 3z + 2}{2 + \frac{1}{1 + 2z}}$.
2. **Término 2 (Denominador en cascada):** 
   - Se resuelve la base del denominador: $D_{\text{fondo}} = 1 + \frac{5}{z}$.
   - Se asciende en la fracción interna: $D_{\text{medio}} = 2z + \frac{3}{D_{\text{fondo}}}$.
   - Se unifican los denominadores anidados para calcular la fracción intermedia principal $T_2$.
3. **Suma Final:** $y = T_1 + T_2$.

## Conclusiones, Dudas y Aprendizajes

### Aprendizajes:
1. **Tipos de Datos y Sufijos:** Se reforzó el uso obligatorio de `f` para flotantes, `L` para enteros largos y comillas simples `' '` para caracteres.
2. **Jerarquía de Operadores:** Aplicación de la técnica *divide y vencerás* para desglosar fracciones complejas en variables intermedias.
3. **Flujo de Trabajo con Git:** Uso de comandos para gestión de historial y atribución correcta de commits.

### Dudas / Dificultades Resueltas:
- Manejo de la precisión decimal y prevención de indeterminaciones por división sobre cero.
## Enlace a la Presentación

- **Diapositivas de la Exposición:** ( https://canva.link/c5joloqt9ufj6ir)
