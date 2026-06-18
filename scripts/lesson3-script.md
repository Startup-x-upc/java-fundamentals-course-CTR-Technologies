# Script — Lección 3: Estructuras de control — Decisiones y bucles (10 min)

## Objetivo de la lección
El alumno usa if-else para evaluar condiciones y bucles for para recorrer listas de datos.

## Progreso en la app
El programa ya no solo muestra datos: ahora evalúa si un estudiante aprobó o no, y puede recorrer una lista de promedios automáticamente. La lógica central de evaluación está lista.

---

## Guión

**[Pantalla: código de lección 2 ejecutándose]**

Ya sabemos guardar datos de un estudiante. Ahora necesitamos que el programa tome decisiones. Por ejemplo: ¿aprobó o no?

Para eso usamos `if-else`. En español significa "si... de lo contrario...".

**[Dibujar en pantalla: diagrama de decisión con dos caminos]**

```
¿promedio >= 11?
    Sí → APROBADO
    No → DESAPROBADO
```

**[Abrir JDoodle con el starter file de la lección 3]**

En Java se escribe así:

```java
if (promedio >= 11) {
    System.out.println(nombre + ": APROBADO");
} else {
    System.out.println(nombre + ": DESAPROBADO");
}
```

El `>=` significa "mayor o igual a". Otros operadores de comparación son `>`, `<`, `==` (igual) y `!=` (diferente).

**[Ejecutar con promedio 14.5 y mostrar resultado]**

Ahora imagina que tienes una lista de 5 estudiantes. ¿Vas a copiar y pegar el mismo código 5 veces? No. Para eso existen los **bucles**.

Un bucle `for` repite instrucciones una cantidad de veces.

**[Explicar visualmente la estructura del for]**

```java
for (int i = 0; i < promedios.length; i++) {
    // esto se repite para cada posición del array
}
```

- `int i = 0` → empezamos en la posición 0
- `i < promedios.length` → seguimos mientras no lleguemos al final
- `i++` → pasamos a la siguiente posición

**[Escribir el bucle completo y ejecutar]**

```java
double[] promedios = {14.5, 8.0, 11.0, 17.5, 6.0};

for (int i = 0; i < promedios.length; i++) {
    if (promedios[i] >= 11) {
        System.out.println("Promedio " + promedios[i] + ": APROBADO");
    } else {
        System.out.println("Promedio " + promedios[i] + ": DESAPROBADO");
    }
}
```

**[Mostrar salida]**

Con pocas líneas evaluamos 5 promedios automáticamente. En la siguiente lección vamos a organizar mejor este código usando métodos, y vamos a permitir que el usuario ingrese los datos desde el teclado.

---

## Puntos clave para mostrar en pantalla (anotaciones)
- `if (condición) { } else { }` → toma una decisión
- `>=` `>` `<` `==` `!=` → operadores de comparación
- `for (inicio; condición; paso)` → repite instrucciones
- `array[i]` → accede al elemento en la posición i