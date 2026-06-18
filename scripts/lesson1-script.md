# Script — Lección 1: ¿Qué es Java y la programación? (5 min)

## Objetivo de la lección
El alumno entiende qué es un programa, para qué sirve Java, y ejecuta su primer código.

## Progreso en la app
Al terminar esta lección, el programa imprime el título del Sistema de Registro de Estudiantes en pantalla. Es el punto de partida del proyecto.

---

## Guión

**[Pantalla: editor en blanco en JDoodle]**

Hola, bienvenido a este curso de Java. Antes de escribir código, vamos a entender qué es exactamente un programa.

Un programa es una lista de instrucciones que le das a la computadora para que haga algo. Cuando abres una app en tu celular, esa app fue escrita por alguien que le dio instrucciones a la computadora. Eso es programar.

**[Mostrar en pantalla: logos de Minecraft, Android, aplicaciones bancarias]**

Java es uno de los lenguajes más usados en el mundo. Lo usan para hacer apps de Android, sistemas bancarios, videojuegos como Minecraft y mucho más. Es un excelente primer lenguaje.

**[Abrir JDoodle]**

Lo mejor de todo es que no necesitas instalar nada. Vamos a usar JDoodle, un editor que funciona directo en el navegador. Solo abre el enlace en la descripción.

**[Escribir en vivo]**

```java
public class Lesson1_HelloWorld {
    public static void main(String[] args) {
        System.out.println("¡Hola, mundo!");
    }
}
```

Esta línea, `System.out.println()`, le dice a Java que muestre un mensaje en pantalla. Todo lo que pongas entre las comillas aparecerá ahí.

**[Ejecutar el programa y mostrar la salida]**

¿Lo ves? La computadora siguió nuestra instrucción. Ahora agreguemos el título de nuestra aplicación, que iremos construyendo lección a lección.

```java
System.out.println("=== Sistema de Registro de Estudiantes ===");
System.out.println("¡Bienvenido!");
```

**[Ejecutar y mostrar salida]**

Eso es todo por esta lección. En la siguiente vamos a aprender a guardar información, como el nombre y el promedio de un estudiante. ¡Nos vemos ahí!

---

## Puntos clave para mostrar en pantalla (anotaciones)
- `System.out.println()` → muestra texto en pantalla
- Las instrucciones terminan con `;`
- El código va dentro de `main`