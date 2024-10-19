# EducaITP

Este es un proyecto realizado, en Selenium, JAVA, y TESTNG como FRAMEWORK. Además contiene práctica con el patrón de diseño PAGE FACTORY.

Aquí tienes un archivo `README.md` para el proyecto **EducaITP**:

```markdown
# EducaITP

EducaITP es un proyecto automatizado de pruebas desarrollado en **Java**, utilizando **Selenium** como herramienta de automatización de pruebas y **TestNG** como framework de pruebas. El proyecto sigue el patrón de diseño **Page Factory** para una mejor organización y mantenimiento del código.

## Características

- Automatización de pruebas con Selenium
- Desarrollo en lenguaje de programación Java
- Uso de TestNG como framework para la ejecución y organización de pruebas
- Implementación del patrón de diseño Page Factory para la gestión de elementos web
- Ejecución de pruebas de interfaz de usuario (UI) para asegurar la funcionalidad y usabilidad de la aplicación EducaITP

## Prerrequisitos

Antes de comenzar, asegúrate de tener instalados los siguientes programas y herramientas:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) - versión 8 o superior
- [Apache Maven](https://maven.apache.org/download.cgi) - para la gestión de dependencias y ejecución de pruebas
- [Eclipse](https://www.eclipse.org/downloads/) o [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) - IDEs recomendados para desarrollar en Java
- [Selenium WebDriver](https://www.selenium.dev/downloads/) - biblioteca de automatización de navegadores

## Instalación

1. **Clona el repositorio**:

   ```bash
   git clone https://github.com/usuario/EducaITP.git
   ```

2. **Importa el proyecto en tu IDE**:

   - Abre Eclipse o IntelliJ IDEA.
   - Importa el proyecto como un proyecto de Maven existente.

3. **Configura las dependencias de Maven**:

   El archivo `pom.xml` ya debe incluir las dependencias necesarias para Selenium y TestNG. Maven se encargará de descargar estas dependencias automáticamente.

4. **Configura TestNG en el proyecto**:

   Si estás utilizando un IDE como Eclipse o IntelliJ, asegúrate de tener instalado el plugin de TestNG.

## Estructura del Proyecto

El proyecto sigue una estructura estándar para proyectos de pruebas automatizadas:

```
EducaITP/
│
├── src/main/java/              # Código fuente principal (si es necesario)
│
├── src/test/java/              # Código de pruebas automatizadas
│   ├── pages/                  # Clases de Page Factory que representan las páginas web
│   ├── tests/                  # Clases de pruebas que contienen los casos de prueba
│   └── utils/                  # Utilidades y configuraciones adicionales
│
├── pom.xml                     # Archivo de configuración de Maven con las dependencias
└── README.md                   # Documentación del proyecto
```

## Ejecución de Pruebas

1. **Ejecución con TestNG**:

   Puedes ejecutar las pruebas directamente desde tu IDE utilizando los archivos de configuración `testng.xml`, o desde la línea de comandos con Maven:

   ```bash
   mvn clean test
   ```

2. **Reporte de Resultados**:

   TestNG genera un reporte de resultados de las pruebas en formato HTML. Puedes encontrar el informe en la carpeta `target/surefire-reports/` después de ejecutar las pruebas.

## Diseño Page Factory

El patrón **Page Factory** facilita la creación y gestión de los elementos de las páginas web. En este proyecto, se utilizan las anotaciones de Selenium para definir los elementos web en las clases de página. Cada clase representa una página de la aplicación EducaITP y proporciona métodos para interactuar con los elementos de la interfaz de usuario.

## Contacto

Para más información o consultas, puedes contactar a los desarrolladores del proyecto.

Este archivo proporciona una guía completa para configurar, ejecutar y contribuir al proyecto EducaITP.
