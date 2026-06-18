# Script — Lección 5: Introducción a la POO — Clases y objetos (12 min)

## Objetivo de la lección
El alumno crea su primera clase con atributos, constructor y método, e instancia objetos a partir de ella.

## Progreso en la app
El salto más grande del curso. Los datos del estudiante dejan de ser variables sueltas y pasan a vivir dentro de un objeto `Estudiante`. La clase tiene constructor y método `mostrar()` propio. Ya tenemos la estructura central de la app.

---

## Guión

**[Pantalla: código de lección 4]**

Hasta ahora usábamos tres variables separadas para un estudiante: nombre, edad y promedio. Pero si quisiéramos guardar 30 estudiantes, necesitaríamos 90 variables. Hay una mejor forma.

En la vida real, un estudiante es un concepto que agrupa muchas características. La programación orientada a objetos, o POO, nos permite modelar el mundo real en código.

**[Dibujar en pantalla: ficha de estudiante con campos nombre, edad, promedio]**

Una **clase** es el molde. Un **objeto** es algo creado a partir de ese molde. Piensa en la clase como el diseño de una galleta, y el objeto como la galleta en sí.

**[Abrir JDoodle con el starter file de la lección 5]**

Vamos a crear la clase `Estudiante`:

```java
class Estudiante {
    String nombre;
    int    edad;
    double promedio;

    Estudiante(String nombre, int edad, double promedio) {
        this.nombre   = nombre;
        this.edad     = edad;
        this.promedio = promedio;
    }

    void mostrar() {
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
}
```

Tres partes importantes:
- **Atributos**: las variables que describen al estudiante (`nombre`, `edad`, `promedio`).
- **Constructor**: el método especial que se ejecuta cuando creamos un objeto. Tiene el mismo nombre que la clase.
- **`this`**: se refiere al objeto actual. Lo usamos para distinguir el atributo del parámetro.
- **Método `mostrar()`**: el comportamiento del estudiante.

**[En main, crear objetos]**

```java
Estudiante e1 = new Estudiante("Ana García", 15, 14.5);
Estudiante e2 = new Estudiante("Carlos López", 16, 8.0);

e1.mostrar();
e2.mostrar();
```

`new` crea un objeto nuevo en memoria. Ahora e1 y e2 son dos estudiantes diferentes, cada uno con sus propios datos.

**[Ejecutar y mostrar salida]**

En la siguiente lección vamos a proteger los atributos de la clase para que nadie los pueda cambiar desde afuera sin control. Eso se llama encapsulación.

---

## Puntos clave para mostrar en pantalla (anotaciones)
- Clase → molde | Objeto → instancia del molde
- Atributos → variables de la clase
- Constructor → se ejecuta al crear el objeto, mismo nombre que la clase
- `this.atributo` → se refiere al atributo del objeto actual
- `new Clase(args)` → crea un objeto