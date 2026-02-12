📄 README.md
# API REST - Registro de Estudiantes

Servicio web RESTful desarrollado con Spring Boot que permite registrar y listar estudiantes utilizando persistencia en memoria.

---

##  Instrucciones para ejecutar el proyecto

### Requisitos
- Java JDK 17 o superior
- Maven (o usar el wrapper incluido)

### Pasos

1. Clonar el repositorio:

```bash
git clone https://github.com/David-Pabon/Taller.git
cd taller-api-estudiantes


Ejecutar la aplicación:

Con Maven instalado:

mvn spring-boot:run


O usando el wrapper:

./mvnw spring-boot:run


(En Windows)

mvnw spring-boot:run


La API quedará disponible en:

http://localhost:8080

📌 Endpoints disponibles
Registrar estudiante

Método: POST

Ruta: /estudiantes

Body JSON:

{
  "id": "1",
  "nombre": "Juan Perez",
  "carrera": "Ingeniería de Sistemas"
}


Respuesta: 201 Created

Listar estudiantes

Método: GET

Ruta: /estudiantes

Respuesta: 200 OK con la lista de estudiantes.

Elegi Java con Spring Boot debido a que es un framework robusto y ampliamente utilizado para el desarrollo de APIs REST, permite una rápida configuración, manejo sencillo de rutas HTTP, validaciones integradas y una estructura organizada del código, lo cual facilita el desarrollo y mantenimiento del servicio web.

Además, Spring Boot reduce la configuración manual y permite enfocarse directamente en la lógica de la aplicación.

Cómo ejecutar (mvnw y/o mvn):

cd Taller
./mvnw spring-boot:run


en Windows:

cd Taller
mvnw.cmd spring-boot:run

## Estrategia de Git (Trunk-Based)
Se usó Trunk-Based Development:
- Desarrollo en ramas cortas `feature/*`.
- Integración a `main` únicamente por Pull Request y merge.
- Evita pushes directos a producción y mantiene `main` estable.

## CI/CD con GitHub Actions
Workflow en `.github/workflows/ci.yml`:
- Se ejecuta en cada push y Pull Request.
- Configura Java (Temurin 25) y usa caché de Maven.
- Compila el proyecto con Maven.
- Tras un merge exitoso a `main`, crea automáticamente un GitHub Release usando la versión del `pom.xml`.
