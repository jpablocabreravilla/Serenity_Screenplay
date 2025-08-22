screenplay-serenity-cucumber/
├── pom.xml
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── company
│   │               ├── interactions   (Clases de Interactions del patrón Screenplay)
│   │               ├── questions      (Clases de Questions del patrón Screenplay)
│   │               ├── tasks          (Clases del patrón Screenplay)
│   │               └── ui             (Mapeo de elementos de la UI)
│
├── test
│   └── java
│       └── com
│           └── company
│               ├── runners
│               │   └── RunnerTest.java          (Clase Runner para ejecutar Cucumber + Serenity)
│               └── stepDefinitions
│                   ├── Hooks.java
│                   └── cpStepDefinition.java    (Clases de Step Definitions de Cucumber)
│
├── resources
│   ├── features
│   │   └── cp.feature             (Archivos .feature con escenarios de prueba)
│   └── serenity.config            (Archivo de configuración de Serenity)
