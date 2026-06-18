# Script — Lección 4: Métodos y entrada/salida con Scanner (10 min)

## Objetivo de la lección
El alumno crea métodos reutilizables y usa Scanner para recibir datos del usuario.

## Progreso en la app
El programa deja de tener datos fijos. Ahora el usuario puede ingresar el nombre, edad y promedio de un estudiante desde el teclado, y el código que muestra la ficha está organizado en un método propio.

---

## Guión

**[Pantalla: código de lección 3]**

Hasta ahora los datos del estudiante estaban escritos directamente en el código. Pero en una app real, el usuario ingresa los datos. Vamos a aprender dos cosas: cómo pedir datos al usuario, y cómo organizar el código en métodos.

**[Parte 1: Métodos]**

Un método es un bloque de código con nombre propio que puedes llamar cuando quieras. Es como una función en matemáticas: le das una entrada y hace algo con ella.

**[Dibujar: bloque con nombre "mostrarEstudiante" que recibe datos y muestra resultado]**

```java
public static void mostrarEstudiante(String nombre, int edad, double promedio) {
    System.out.println("--- Ficha del Estudiante ---");
    System.out.println("Nombre:   " + nombre);
    System.out.println("Edad:     " + edad + " años");
    System.out.println("Promedio: " + promedio);
    if (promedio >= 11) {
        System.out.println("Estado:   APROBADO");
    } else {
        System.out.println("Estado:   DESAPROBADO");
    }
}
```

`void` significa que el método no devuelve ningún valor, solo hace algo. Los valores entre paréntesis se llaman parámetros: son los datos que le pasas al método.

**[Parte 2: Scanner]**

Ahora aprendamos a pedir datos al usuario. Para eso usamos `Scanner`.

```java
import java.util.Scanner;
// ...
Scanner sc = new Scanner(System.in);
```

`System.in` es la entrada del teclado. A partir de ahí podemos pedir datos:

```java
System.out.print("Ingresa el nombre del estudiante: ");
String nombre = sc.nextLine();    // lee texto

System.out.print("Ingresa la edad: ");
int edad = sc.nextInt();          // lee número entero

System.out.print("Ingresa el promedio: ");
double promedio = sc.nextDouble(); // lee número decimal
```

**[Abrir OnlineGDB con el starter file de la lección 4 y escribir el código completo]**

Luego llamamos al método:

```java
mostrarEstudiante(nombre, edad, promedio);
```

**[Ejecutar, ingresar datos en la consola y mostrar el resultado]**

¿Ves cómo ahora el usuario controla los datos? En la siguiente lección vamos a hacer algo importante: en lugar de guardar el nombre, edad y promedio como variables separadas, los vamos a agrupar en un objeto. Para eso aprenderemos qué es una clase.

---

## Puntos clave para mostrar en pantalla (anotaciones)
- `public static void nombreMetodo(parametros)` → define un método
- Los parámetros son los datos de entrada del método
- `Scanner sc = new Scanner(System.in)` → lee desde el teclado
- `sc.nextLine()` texto | `sc.nextInt()` entero | `sc.nextDouble()` decimal