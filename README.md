# 📚 DashNotes Backend

¡Bienvenido al backend de **DashNotes**!  
Una API REST simple para crear, leer, actualizar y eliminar notas. ✍️

---

## ✨ Tecnologías utilizadas

![Java](https://img.shields.io/badge/Java-21-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.4-brightgreen)
![MySQL](https://img.shields.io/badge/Database-MySQL-blue)
![Status](https://img.shields.io/badge/Status-Working-success)

---

## 📂 Estructura del Proyect

dashnotes/
├── src/
│   └── main/
│       ├── java/
│       │   └── dev/
│       │       └── rosa/
│       │           └── dashnotes/
│       │               ├── DashnotesApplication.java
│       │               ├── StudyNote.java
│       │               ├── StudyNoteController.java
│       │               └── StudyNoteRepository.java
│       └── resources/
│           └── application.properties
├── target/        (ignorado por Git)
├── .gitignore
├── README.md
└── pom.xml


---

## 🚀 Cómo levantar el proyecto localmente

## 1. **Clona el repositorio**:
   git clone https://github.com/Angelica-2025/dashnotes-BE.git
### 2. Entra en la carpeta del proyecto
cd dashnotes-BE
### 3. Ejecuta la aplicación
mvn spring-boot:run

# 📬 API Endpoints

| Método | URL           | Descripción                     |
|--------|---------------|---------------------------------|
| POST   | `/notes`      | Crear una nueva nota            |
| GET    | `/notes`      | Listar todas las notas          |
| PUT    | `/notes/{id}` | Actualizar una nota existente   |
| DELETE | `/notes/{id}` | Eliminar una nota               |

## 🛠️ Estado actual
✅ Backend 100% funcional
✅ CRUD completo
✅ Conexión a base de datos MySQL
✅ Testeado exitosamente con Postman

👩‍💻 Autor
Desarrollado con ❤️ por Angélica.
