# Foro Hub API

API REST desarrollada con **Spring Boot** como parte del **Challenge Back-End de Alura**.
El objetivo del proyecto es implementar el **backend de un foro**, permitiendo la gestión de tópicos mediante operaciones CRUD.

---

# Descripción

Foro Hub es una API que permite a los usuarios crear, consultar, actualizar y eliminar tópicos dentro de un foro.
El proyecto utiliza **Spring Boot, Spring Data JPA y MySQL** para gestionar la persistencia de datos.

---

# Tecnologías utilizadas

* Java 17
* Spring Boot
* Spring Data JPA
* MySQL
* Maven
* Insomnia / Postman (para pruebas de API)

---

# Estructura del proyecto

```
com.alurachallenge.forohub
│
├── controller
│   └── TopicoController
│
├── domain
│   └── topico
│       ├── Topico
│       ├── DatosRegistroTopico
│       ├── DatosActualizarTopico
│       └── DatosRespuestaTopico
│
├── repository
│   └── TopicoRepository
│
├── service
│   └── TopicoService
│
└── ForohubApplication
```

---

# Funcionalidades

La API permite realizar las siguientes operaciones:

* Crear un nuevo tópico
* Listar todos los tópicos
* Obtener un tópico por ID
* Actualizar un tópico existente
* Eliminar un tópico

---

# Endpoints

## Crear tópico

POST `/topicos`

Ejemplo Body:

```
{
  "titulo": "Error en Spring Boot",
  "mensaje": "No conecta a MySQL",
  "autor": "Carlos",
  "curso": "Spring Boot"
}
```

---

## Listar tópicos

GET `/topicos`

---

## Obtener tópico por ID

GET `/topicos/{id}`

Ejemplo:

```
GET /topicos/1
```

---

## Actualizar tópico

PUT `/topicos/{id}`

Ejemplo Body:

```
{
  "titulo": "Problema actualizado",
  "mensaje": "Ahora funciona correctamente"
}
```

---

## Eliminar tópico

DELETE `/topicos/{id}`

---

# Base de datos

La aplicación utiliza **MySQL** para almacenar los datos.

Configuración en `application.properties`:

```
spring.datasource.url=jdbc:mysql://localhost/forohub
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

# Cómo ejecutar el proyecto

1. Clonar el repositorio

```
git clone https://github.com/tu-usuario/foro-hub.git
```

2. Abrir el proyecto en **IntelliJ o cualquier IDE compatible con Spring Boot**

3. Configurar la base de datos MySQL

4. Ejecutar la clase principal:

```
ForohubApplication
```

5. Probar los endpoints en **Insomnia o Postman**

---

Grecia Sanchez

Proyecto desarrollado como parte del **Challenge Back-End de Alura**.

---
