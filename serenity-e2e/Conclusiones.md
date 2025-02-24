# Conclusiones del Ejercicio de Automatización E2E

## 🔍 Hallazgos
1. **Manejo de versiones**: Se requiere que WebDriver y el navegador estén en la misma versión para evitar errores de compatibilidad.
2. **Configuración de Serenity**: Es crucial definir el `webdriver.driver` correctamente en `serenity.conf` para evitar problemas con la ejecución.
3. **Reportes detallados**: Serenity BDD genera reportes claros y estructurados, facilitando la identificación de errores en la ejecución.
4. **Manejo de sesiones**: EdgeDriver puede fallar al iniciar sesiones si ya existen procesos previos en ejecución.

## ✅ Conclusiones
- La automatización con **Serenity BDD** permite escribir pruebas mantenibles y estructuradas siguiendo el patrón **Page Object Model (POM)**.
- La correcta configuración del entorno es clave para la ejecución exitosa de las pruebas.
- Serenity genera reportes detallados que facilitan la depuración y análisis de errores.
- La automatización de pruebas E2E en **Demoblaze** fue validada con éxito.

## 🚀 Recomendaciones
- Utilizar **Chrome** en lugar de Edge para evitar problemas con sesiones bloqueadas en WebDriver.
- Implementar **CI/CD con GitHub Actions o Jenkins** para integrar la ejecución de pruebas en el flujo de desarrollo.
- Mejorar la captura de errores en los reportes para facilitar la detección de fallos.

