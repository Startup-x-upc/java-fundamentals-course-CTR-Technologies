# Script — Lección 6: Encapsulación — Getters y Setters (8 min)

## Objetivo de la lección
El alumno entiende por qué los atributos deben ser privados y crea getters y setters para controlar el acceso.

## Progreso en la app
La clase `Estudiante` queda completamente encapsulada: atributos privados, acceso controlado. Es la versión final y correcta de la clase que usaremos en el proyecto.

---

## Guión

**[Pantalla: clase Estudiante de la lección 5]**

En la lección anterior, los atributos de `Estudiante` eran públicos. Eso significa que cualquier parte del programa podría cambiarlos directamente, así:

```java
e1.promedio = -999;
```

Eso es un problema. Un promedio negativo no tiene sentido. Necesitamos controlar cómo se accede y se modifica la información de un objeto. Para eso existe la **encapsulación**.

**[Dibujar: caja cerrada con candado. Solo se puede entrar por la puerta controlada]**

La idea es simple: los atributos se declaran como `private`, lo que significa que solo pueden ser accedidos desde dentro de la propia clase. Para leerlos o modificarlos desde afuera, usamos métodos especiales.

**[Abrir JDoodle con el starter file de la lección 6]**

Primero, hacemos los atributos privados:

```java
private String nombre;
private int    edad;
private double promedio;
```

Ahora nadie puede escribir `e1.promedio = -999` porque el compilador dará error.

Para leer los atributos creamos **getters**:

```java
public String getNombre()  { return nombre; }
public int    getEdad()    { return edad; }
public double getPromedio(){ return promedio; }
```

Para modificarlos creamos **setters**. Aquí podríamos agregar validaciones:

```java
public void setPromedio(double promedio) {
    this.promedio = promedio;
}
```

**[Mostrar el main de la lección]**

```java
Estudiante e = new Estudiante("Ana García", 15, 14.5);
e.mostrar();

e.setPromedio(16.0);  // cambiamos el promedio
e.mostrar();

System.out.println("Nombre: " + e.getNombre()); // leemos con getter
```

**[Ejecutar y mostrar salida]**

Ahora la clase está bien protegida. En la siguiente lección vamos a usar todo lo que aprendimos para construir el proyecto final completo: un array de varios estudiantes con un resumen del salón.

---

## Puntos clave para mostrar en pantalla (anotaciones)
- `private` → solo accesible desde dentro de la clase
- `public` → accesible desde cualquier parte
- Getter → lee un atributo: `getNombre()`
- Setter → modifica un atributo: `setPromedio(valor)`
- Encapsulación = proteger datos + controlar acceso