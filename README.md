# serenity-demoblaze-test
# Ejercicio de Automatización E2E - Serenity BDD

## 📌 Requisitos previos:
- **Java JDK 21+** ([Descargar JDK](https://adoptium.net/))
- **Apache Maven 3.9+** ([Descargar Maven](https://maven.apache.org/download.cgi))
- **Google Chrome 133+** o **Microsoft Edge 133+**
- **ChromeDriver o EdgeDriver** (descargar según el navegador)
- **IntelliJ IDEA o Visual Studio Code** como IDE
- **Git** instalado para la gestión del código

## 📥 Instalación del proyecto:
1. Clonar el repositorio:
git clone <URL_DEL_REPO> cd serenity-e2e

2. Instalar las dependencias:
mvn clean install

3. Configurar el driver en `serenity.conf`:
- Para Chrome:
  ```
  webdriver.driver=chrome
  ```
- Para Edge:
  ```
  webdriver.driver=edge
  ```

## 🚀 Ejecución de las pruebas:
- Para ejecutar las pruebas en Chrome:
mvn clean verify


## 📊 Reportes:
- Los reportes se generan en:
target/site/serenity/index.html
