# Script — Lección 8: Mejores prácticas y errores comunes (5 min)

## Objetivo de la lección
El alumno conoce hábitos básicos de escritura de código limpio y aprende a leer mensajes de error de Java.

## Progreso en la app
No se agrega código nuevo. Se revisa el programa completo de la lección 7 aplicando las buenas prácticas vistas.

---

## Guión

**[Pantalla: código completo de la lección 7]**

Ya terminamos de construir la app. En esta última lección vamos a ver algunas reglas simples que hacen que tu código sea más fácil de leer y mantener.

**[Práctica 1: Nombres descriptivos]**

Un buen nombre de variable dice exactamente qué guarda. Compara:

```java
int x = 15;           // ¿Qué es x?
int edadEstudiante = 15;  // Claro y directo
```

Lo mismo con métodos. `mostrar()` está bien, pero `mostrarFicha()` es aún más claro.

**[Práctica 2: Comentarios]**

Los comentarios explican el por qué, no el qué. El código ya dice el qué.

```java
// Promedio mínimo aprobatorio en el sistema escolar peruano
if (promedio >= 11) { ... }
```

Un comentario que dice `// suma 1 a aprobados` junto a `aprobados++` no agrega nada. El código ya lo dice.

**[Práctica 3: Leer los errores]**

Java te dice exactamente qué salió mal. No ignores los mensajes de error.

**[Mostrar en pantalla un error común y cómo leerlo]**

Errores frecuentes en Java para principiantes:

| Error | Causa más común |
|---|---|
| `cannot find symbol` | Nombre de variable o método mal escrito |
| `';' expected` | Falta un punto y coma al final |
| `NullPointerException` | Usaste un objeto que no fue creado con `new` |
| `ArrayIndexOutOfBoundsException` | Intentaste acceder a una posición que no existe en el array |

**[Mostrar cada error brevemente en el editor y cómo corregirlo]**

**¿Qué aprender después?**

Si este curso te gustó, estos son los siguientes pasos:
- Herencia y polimorfismo (más POO)
- Colecciones: `ArrayList` en lugar de arrays
- Interfaces y abstracción
- Documentación oficial de Java: [docs.oracle.com/en/java](https://docs.oracle.com/en/java/)

¡Felicitaciones por completar el curso! Ahora sabes los fundamentos de Java y de la programación orientada a objetos. Todo lo que construiste aquí lo puedes seguir mejorando.

---

## Puntos clave para mostrar en pantalla (anotaciones)
- Nombres descriptivos para variables, métodos y clases
- Comentarios explican el propósito, no la mecánica
- Lee el mensaje de error completo antes de buscar en Google
- `cannot find symbol` → revisa el nombre | `';' expected` → falta `;`