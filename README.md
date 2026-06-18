# Fundamentos de Java para Principiantes

## Resumen del Curso

Este proyecto forma parte del trabajo complementario del curso **Desarrollo de Aplicaciones Open Source (1ASI0729)** de la **Universidad Peruana de Ciencias Aplicadas (UPC)**.  
El objetivo es diseñar un curso para enseñar los **fundamentos de la programación con Java** a estudiantes de secundaria, usando como proyecto final la creación de un **Sistema de Registro de Estudiantes**.

El curso se compone de videos cortos, prácticas interactivas en editores de código online y un repositorio con ejemplos de código.

**Duración total:**   
**Público objetivo:** Estudiantes de 12 a 17 años sin experiencia en programación  
**Prerrequisitos:** Ninguno  
**Herramientas necesarias:** **¡Solo tu navegador web!** (Chrome, Firefox, Safari, Edge)  
**Editores de código:** [JDoodle](https://www.jdoodle.com/online-java-compiler)  · [Replit](https://replit.com/languages/java)  
**Repositorio de código fuente:** [https://github.com/Startup-x-upc/java-fundamentals-course-CTR-Technologies.git](https://github.com/Startup-x-upc/java-fundamentals-course-CTR-Technologies.git)

---

## Secuencia de la Lección

### Lección 1: ¿Qué es Java y la programación? (5 minutos)

- **Descripción:** Aprende qué es la programación, para qué se usa Java y cómo ejecutar tu primer programa. Escribiremos nuestro primer `Hola, mundo` y entenderemos cómo funciona un programa básico.
- **Enlace:** [Ver la lección]()
- **Conclusiones clave:** Java se usa en aplicaciones, juegos y más; `System.out.println()` muestra texto en pantalla.
- **Practica aquí:** [Abrir en JDoodle](https://www.jdoodle.com/online-java-compiler) — ¡No necesitas registrarte!

---

### Lección 2: Variables, tipos de datos y operadores (8 minutos)

- **Descripción:** Aprende a almacenar información con variables. Usaremos `int`, `String`, `double` y `boolean` para guardar datos de un estudiante: su nombre, edad y promedio. También exploraremos los operadores básicos.
- **Enlace:** [Ver la lección]()
- **Conclusiones clave:** `int edad = 15;`, `String nombre = "Ana";`, operadores `+`, `-`, `*`, `/`.
- **Practica aquí:** [Abrir en JDoodle](https://www.jdoodle.com/online-java-compiler) — ¡Sin registro!

---

### Lección 3: Estructuras de control — Decisiones y bucles (10 minutos)

- **Descripción:** Aprende a tomar decisiones con `if-else` y a repetir acciones con `for` y `while`. Usaremos esto para determinar si un estudiante aprobó o reprobó según su promedio.
- **Enlace:** [Ver la lección]()
- **Conclusiones clave:** `if (promedio >= 11) { ... }`, `for (int i = 0; i < 5; i++) { ... }`.
- **Practica aquí:** [Abrir en JDoodle](https://www.jdoodle.com/online-java-compiler) — ¡Inicio inmediato!

---

### Lección 4: Métodos y entrada/salida con Scanner (10 minutos)

- **Descripción:** Aprende a crear bloques de código reutilizables llamados métodos, y a pedir datos al usuario con `Scanner`. Crearemos un método que solicita el nombre de un estudiante y lo muestra en pantalla.
- **Enlace:** [Ver la lección]()
- **Conclusiones clave:** `public static void mostrarInfo() { ... }`, `Scanner sc = new Scanner(System.in);`.
- **Practica aquí:** [Abrir en OnlineGDB](https://www.onlinegdb.com/online_java_compiler) — ¡No necesitas registrarte!

---

### Lección 5: Introducción a la POO — Clases y objetos (12 minutos)

- **Descripción:** Descubre qué es la programación orientada a objetos. Crearemos la clase `Estudiante` con atributos como nombre, edad y promedio, y aprenderemos a construir objetos a partir de ella usando constructores.
- **Enlace:** [Ver la lección]()
- **Conclusiones clave:** `class Estudiante { ... }`, `Estudiante e = new Estudiante("Ana", 15, 14.5);`.
- **Practica aquí:** [Abrir en Replit](https://replit.com/languages/java) — ¡Guarda y comparte tu código!

---

### Lección 6: Encapsulación — Getters y Setters (8 minutos)

- **Descripción:** Aprende a proteger los datos de una clase con encapsulación. Modificaremos la clase `Estudiante` para usar atributos privados y métodos públicos de acceso y modificación.
- **Enlace:** [Ver la lección]()
- **Conclusiones clave:** `private String nombre;`, `public String getNombre() { return nombre; }`, `public void setNombre(String nombre) { ... }`.
- **Practica aquí:** [Abrir en Replit](https://replit.com/languages/java) — ¡No necesitas descargar nada!

---

### Lección 7: Proyecto final — Sistema de Registro de Estudiantes (12 minutos)

- **Descripción:** Combinamos todo lo aprendido: usamos un array para almacenar varios objetos `Estudiante`, recorremos la lista con un bucle y mostramos quién aprobó y quién no. El resultado es nuestro programa completo.
- **Enlace:** [Ver la lección]()
- **Conclusiones clave:** `Estudiante[] registro = new Estudiante[5];`, iterar con `for`, mostrar resultados con condiciones.
- **Proyecto final:** [Abrir en Replit](https://replit.com/languages/java) — ¡Guarda y comparte!

---

### Lección 8: Mejores prácticas y errores comunes (5 minutos)

- **Descripción:** Consejos clave para escribir código limpio, cómo leer mensajes de error en Java y qué aprender a continuación en tu camino como programador.
- **Enlace:** [Ver la lección]()
- **Conclusiones clave:** Nombres descriptivos para variables, cómo leer un error de compilación, explorar la documentación oficial de Java.
- **Recursos:** [Documentación oficial de Java](https://docs.oracle.com/en/java/)

---

## Recursos Adicionales

- **Código fuente completo:** [Repositorio de GitHub](https://github.com/Startup-x-upc/java-fundamentals-course-CTR-Technologies.git)
- **Editores utilizados:** [JDoodle](https://www.jdoodle.com) · [OnlineGDB](https://www.onlinegdb.com) · [Replit](https://replit.com)

| Número de lección | Actividad | Empezar a programar |
|---|---|---|
| 1 | Hola, mundo | [JDoodle](https://www.jdoodle.com/online-java-compiler) |
| 2 | Variables y tipos de datos | [JDoodle](https://www.jdoodle.com/online-java-compiler) |
| 3 | Decisiones y bucles | [OnlineGDB](https://www.onlinegdb.com/online_java_compiler) |
| 4 | Métodos y Scanner | [OnlineGDB](https://www.onlinegdb.com/online_java_compiler) |
| 5 | Clases y objetos | [Replit](https://replit.com/languages/java) |
| 6 | Getters y Setters | [Replit](https://replit.com/languages/java) |
| 7 | Proyecto final | [Replit](https://replit.com/languages/java) |
| 8 | Buenas prácticas | — |

---

## Elaboración

Universidad Peruana de Ciencias Aplicadas  
Carrera de Ingeniería de Software  
Período 202610  
1ASI0729 Desarrollo de Aplicaciones Open Source  
NRC 10155

**Nombre del equipo:** CTR Technologies  
**Líder del equipo:** Aguirre Ramos, Eduardo 
**Integrantes del equipo:**
- Castillo Vidal, Jesús Iván
- Aguirre Ramos, Eduardo
- Pillaca Gonzales, Andy
- Torres Sanchez, Dalila
- Aiquipa Poma, Sebastian

**Fecha de entrega:** 17 de junio de 2026

---

## Estructura del repositorio

```
java-fundamentals-course-chapa-tu-ruta/
├── README.md
├── starter-files/
│   ├── Lesson1_HelloWorld.java
│   ├── Lesson2_Variables.java
│   ├── Lesson3_ControlFlow.java
│   ├── Lesson4_Methods.java
│   ├── Lesson5_Classes.java
│   ├── Lesson6_Encapsulation.java
│   └── Lesson7_FinalProject.java
├── completed-examples/
│   ├── Lesson1_HelloWorld.java
│   ├── Lesson2_Variables.java
│   ├── Lesson3_ControlFlow.java
│   ├── Lesson4_Methods.java
│   ├── Lesson5_Classes.java
│   ├── Lesson6_Encapsulation.java
│   └── Lesson7_FinalProject.java
└── scripts/
    ├── lesson1-script.md
    ├── lesson2-script.md
    ├── lesson3-script.md
    ├── lesson4-script.md
    ├── lesson5-script.md
    ├── lesson6-script.md
    ├── lesson7-script.md
    └── lesson8-script.md
```

---

## Conclusión

El proyecto *Sistema de Registro de Estudiantes* busca enseñar los fundamentos de Java de forma práctica y accesible para estudiantes de secundaria. A través de las ocho lecciones, se abordan conceptos esenciales desde las variables y estructuras de control hasta los principios básicos de la programación orientada a objetos, construyendo progresivamente un programa completo y funcional.