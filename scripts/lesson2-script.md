# Script — Lección 2: Variables, tipos de datos y operadores (8 min)

## Objetivo de la lección
El alumno aprende a declarar variables de distintos tipos y a mostrar su valor en pantalla.

## Progreso en la app
Ahora el programa guarda los datos de un estudiante real: nombre, edad, promedio y si está activo. Ya tenemos información, aunque todavía no la evaluamos.

---

## Guión

**[Pantalla: código de la lección anterior ejecutándose]**

En la lección anterior hicimos que Java mostrara un mensaje. Pero una app útil necesita guardar información. Para eso existen las variables.

Piensa en una variable como una caja con una etiqueta. La etiqueta es el nombre de la variable, y adentro guardas un dato.

**[Dibujar en pantalla: caja con etiqueta "nombre" y valor "Ana García"]**

En Java, antes de usar una variable tienes que decirle qué tipo de dato va a guardar. Los tipos más comunes son:

- `String` → texto, como un nombre o una frase
- `int` → número entero, como la edad
- `double` → número con decimales, como un promedio
- `boolean` → solo puede ser `true` o `false`

**[Abrir JDoodle con el starter file de la lección 2]**

Vamos a guardar los datos de nuestro primer estudiante.

```java
String  nombre   = "Ana García";
int     edad     = 15;
double  promedio = 14.5;
boolean activo   = true;
```

El signo `=` no significa "igual" como en matemáticas. Significa "guarda este valor en esta variable".

**[Mostrar cómo imprimir los valores]**

Ahora mostramos los datos con `println`. Podemos unir texto y variables con el signo `+`:

```java
System.out.println("Nombre:   " + nombre);
System.out.println("Edad:     " + edad + " años");
System.out.println("Promedio: " + promedio);
System.out.println("Activo:   " + activo);
```

**[Ejecutar y mostrar salida]**

También podemos hacer operaciones. Por ejemplo, calcular el promedio de dos notas:

```java
double nota1 = 13.0;
double nota2 = 16.0;
double resultado = (nota1 + nota2) / 2;
System.out.println("Promedio: " + resultado);
```

**[Ejecutar y mostrar resultado]**

Ahora ya sabes guardar información de un estudiante. En la siguiente lección vamos a aprender a tomar decisiones: ¿aprobó o no aprobó?

---

## Puntos clave para mostrar en pantalla (anotaciones)
- `String` → texto | `int` → entero | `double` → decimal | `boolean` → true/false
- `=` asigna un valor a la variable
- `"texto" + variable` une texto con el valor de la variable
- Operadores: `+` `-` `*` `/`