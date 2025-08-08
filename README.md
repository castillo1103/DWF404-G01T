# 📌 Gestión de Tareas 

Este proyecto es un ejemplo práctico de **Arquitectura Limpia** implementada en **Spring Boot**, con base de datos en memoria **H2**.  
Su objetivo es **gestionar tareas básicas**, permitiendo registrar, consultar, editar y eliminar actividades, para que puedas llevar un control claro de lo que tienes pendiente, en progreso o ya completado.  
La aplicación es ideal para organizar actividades diarias o proyectos pequeños.

---

## 🚀 Tecnologías utilizadas

- **Java 17+**
- **Spring Boot 3**
- **Spring Data JPA**
- **H2 Database**
- **Postman** (para pruebas de API)

## 📂 Estructura del proyecto

├── controller # Controladores REST (manejo de solicitudes HTTP)

├── model # Entidades JPA (representación de datos)

├── repository # Repositorios JPA para acceso a datos

├── service # Lógica de negocio

└── GestionDeTareasApplication.java # Clase principal

## 📋 Funcionalidades

- **Listar todas las tareas**
- **Obtener tarea por ID**
- **Buscar tareas por título**
- **Crear nueva tarea**
- **Actualizar tarea existente**
- **Eliminar tarea**

Cada tarea tiene:
- `id` (Long)
- `titulo` (String)
- `descripcion` (String)
- `estado` (String) → Ej: `"Pendiente"`, `"En Progreso"`, `"Completada"`

## ⚙️ Instalación y ejecución

### 🔹 Ejecutar en IntelliJ IDEA
1. **Clonar el repositorio**
```bash
git clone https://github.com/castillo1103/DWF404-G01T

cd GestionDeTareas
```

2. **Abrir el proyecto en IntelliJ**

 - Abre IntelliJ IDEA.

 - Ve a File → Open y selecciona la carpeta del proyecto.

3. **Configurar el SDK**

  - Asegúrate de tener Java 17 configurado.

  - Ve a File → Project Structure → Project SDK y selecciona Java 17.

4. **Esperar la descarga de dependencias**

  - IntelliJ detectará el pom.xml y descargará las dependencias de Maven.
    
5. **Ejecutar la aplicación**

  - En el panel de IntelliJ, busca la clase:
```b
src/main/java/sv/edu/udb/GestionDeTareasApplication.java

```
  - Haz clic derecho sobre ella y selecciona Run 'GestionDeTareasApplication'.

  - Verificar que está corriendo. La consola debe mostrar:
```b
Tomcat started on port(s): 8080
```
  - Ya puedes acceder a la API y a la consola H2.

🌐 **Base de datos H2**

URL: http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:testdb

Usuario: sa

Contraseña: (vacío)

🧪 **Pruebas con Postman**

Puedes realizar las siguientes operaciones:

GET	http://localhost:8080/api/tareas	Listar todas las tareas

GET	http://localhost:8080/api/tareas/{id}	  Obtener tarea por ID

GET	http://localhost:8080/api/tareas/buscar?titulo=palabra	Buscar tareas por título

POST	http://localhost:8080/api/tareas	Crear nueva tarea

PUT	http://localhost:8080/api/tareas/{id}	Actualizar tarea existente

DELETE	http://localhost:8080/api/tareas/{id}	Eliminar tarea




