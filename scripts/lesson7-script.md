# Script — Lección 7: Proyecto final — Sistema de Registro de Estudiantes (12 min)

## Objetivo de la lección
El alumno integra todos los conceptos del curso para construir el programa completo: un array de objetos Estudiante con evaluación y resumen del salón.

## Progreso en la app
Esta es la lección de cierre técnico. El programa está completo: guarda 5 estudiantes en un array, los muestra con su estado, y calcula cuántos aprobaron y cuántos no.

---

## Guión

**[Pantalla: resumen visual de lo aprendido hasta ahora]**

Llegamos a la lección más importante. Vamos a juntar todo lo que aprendimos para construir el programa completo.

Hasta ahora sabemos:
- Guardar datos con variables (lección 2)
- Tomar decisiones con if-else y recorrer listas con for (lección 3)
- Organizar código en métodos (lección 4)
- Crear objetos con clases (lección 5)
- Proteger datos con encapsulación (lección 6)

Ahora lo unimos todo.

**[Abrir JDoodle con el starter file de la lección 7]**

**Paso 1: crear el array de estudiantes**

En lugar de un solo estudiante, vamos a crear cinco. Un array nos permite guardar varios objetos del mismo tipo:

```java
Estudiante[] registro = new Estudiante[5];
registro[0] = new Estudiante("Ana García",    15, 14.5);
registro[1] = new Estudiante("Carlos López",  16,  8.0);
registro[2] = new Estudiante("Lucía Torres",  15, 11.0);
registro[3] = new Estudiante("Miguel Ramos",  17, 17.5);
registro[4] = new Estudiante("Sofía Mendoza", 14,  6.0);
```

**[Dibujar: array con 5 cajas, cada una con un estudiante adentro]**

**Paso 2: mostrar la lista completa**

Usamos un bucle for para llamar a `mostrar()` de cada estudiante:

```java
for (int i = 0; i < registro.length; i++) {
    registro[i].mostrar();
}
```

**[Ejecutar y mostrar la lista]**

**Paso 3: calcular el resumen**

```java
int aprobados    = 0;
int desaprobados = 0;

for (int i = 0; i < registro.length; i++) {
    if (registro[i].getPromedio() >= 11) {
        aprobados++;
    } else {
        desaprobados++;
    }
}

System.out.println("Aprobados:    " + aprobados);
System.out.println("Desaprobados: " + desaprobados);
System.out.println("Total:        " + registro.length);
```

**[Ejecutar el programa completo y mostrar toda la salida]**

¡Listo! Tenemos un Sistema de Registro de Estudiantes funcional. Guarda información, evalúa cada alumno y genera un resumen automático. Todo usando Java puro, sin instalar nada.

En la siguiente lección aprenderemos algunas buenas prácticas para escribir código aún más limpio.

---

## Puntos clave para mostrar en pantalla (anotaciones)
- `Tipo[] nombre = new Tipo[n]` → crea un array de n elementos
- `array[i]` → accede al elemento en la posición i
- `array.length` → cantidad de elementos en el array
- `contador++` → incrementa el contador en 1
- La clase `Estudiante` usada aquí es la versión encapsulada de la lección 6