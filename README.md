# 🌿 Espacios Culturales de Medellín — Java

Proyecto Java que modela espacios culturales de Medellín usando **interfaces** y **polimorfismo**, con una lista dinámica de lugares que comparten un comportamiento común.

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)
![OOP](https://img.shields.io/badge/Paradigma-POO-blue?style=flat)
![Paquete](https://img.shields.io/badge/Paquete-com.example-lightgrey?style=flat)

---

## Descripción

El proyecto define una interfaz `EspacioCultural` que establece un contrato común para distintos lugares culturales. Cada clase concreta implementa ese contrato con su propia lógica. La clase `Main` recorre todos los lugares usando polimorfismo.

**Lugares incluidos:**
- 🌱 Jardín Botánico
- 🎨 Museo de Antioquia
- 🔬 Parque Explora

---

## Estructura del proyecto

```
src/
└── com/
    └── example/
        ├── EspacioCultural.java     ← interfaz
        ├── JardinBotanico.java      ← implementación
        ├── MuseoDeAntioquia.java    ← implementación
        ├── ParqueExplora.java       ← implementación
        └── Main.java                ← punto de entrada
```

---

## Interfaz `EspacioCultural`

Define el contrato que deben cumplir todos los espacios culturales.

| Método | Retorno | Descripción |
|---|---|---|
| `mostrarHorario()` | `void` | Imprime el horario de atención |
| `obtenerRequisitoEntrada()` | `String` | Retorna el requisito para ingresar |
| `realizarActividadPrincipal()` | `void` | Describe la actividad principal del lugar |

---

## Clases concretas

### 🌱 `JardinBotanico`

| Método | Valor |
|---|---|
| `mostrarHorario()` | `9:00 AM - 4:30 PM` |
| `obtenerRequisitoEntrada()` | Entrada libre (algunos eventos requieren registro) |
| `realizarActividadPrincipal()` | Caminando por el Bosque Tropical... |

### 🎨 `MuseoDeAntioquia`

| Método | Valor |
|---|---|
| `mostrarHorario()` | Definido en la clase |
| `obtenerRequisitoEntrada()` | Definido en la clase |
| `realizarActividadPrincipal()` | Definido en la clase |

### 🔬 `ParqueExplora`

| Método | Valor |
|---|---|
| `mostrarHorario()` | `8:00 AM - 6:00 PM` |
| `obtenerRequisitoEntrada()` | Documento original |
| `realizarActividadPrincipal()` | Interactuar con experimentos... |

---

## Clase `Main`

Punto de entrada del programa. Usa un `ArrayList<EspacioCultural>` para recorrer todos los lugares de forma polimórfica.

### ¿Qué hace?

1. Crea un `ArrayList` de tipo `EspacioCultural`
2. Agrega una instancia de cada lugar
3. Recorre la lista con un `for` e invoca los tres métodos de la interfaz en cada lugar
4. Imprime la información de cada espacio cultural separada por líneas

### Salida esperada en consola

```
Lugar: Jardín Botánico
Horario: 9:00 AM - 4:30 PM
Requisito: Entrada libre (algunos eventos requieren registro)
Actividad: Caminando por el Bosque Tropical...
------------------------
Lugar: Museo de Antioquia
Horario: ...
Requisito: ...
Actividad: ...
------------------------
Lugar: Parque Explora
Horario: 8:00 AM - 6:00 PM
Requisito: Documento original
Actividad: Interactuar con experimentos...
------------------------
```

---

## Cómo ejecutar

### Con terminal

```bash
# Compilar todas las clases
javac -d out src/com/example/*.java

# Ejecutar
java -cp out com.example.Main
```

### Con IDE

Abrí el proyecto en **IntelliJ IDEA**, **Eclipse** o **VS Code** con extensión Java y ejecutá la clase `Main`.

---

## Conceptos aplicados

| Concepto | Dónde se aplica |
|---|---|
| **Interfaz** | `EspacioCultural` define el contrato común |
| **Implementación de interfaz** | `JardinBotanico`, `MuseoDeAntioquia`, `ParqueExplora` |
| **Polimorfismo** | El `ArrayList<EspacioCultural>` trata todos los objetos de forma uniforme |
| **`ArrayList`** | Colección dinámica para almacenar los lugares |
| **`@Override`** | Cada clase sobreescribe los métodos de la interfaz |
| **Recorrido con `for`** | Iteración sobre la lista para invocar métodos en cada objeto |

---

## Requisitos

- Java 8 o superior

---

## Licencia

MIT
