# Usa una imagen base con Java 17
FROM eclipse-temurin:17-jdk-alpine

# Directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el archivo .jar que generaste con Maven
COPY target/*.jar app.jar

# Expone el puerto donde corre tu backend (por defecto 8080)
EXPOSE 8080

# Comando que arranca tu app
ENTRYPOINT ["java", "-jar", "app.jar"]

