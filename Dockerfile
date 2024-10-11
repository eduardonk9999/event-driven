# Usar uma imagem base do OpenJDK
FROM openjdk:17-jdk-slim

# Definir o diretório de trabalho no contêiner
WORKDIR /app

# Copiar o arquivo JAR gerado pelo Gradle para o contêiner
COPY build/libs/*.jar app.jar

# Definir o comando de entrada para executar o aplicativo Spring Boot
ENTRYPOINT ["java", "-jar", "app.jar"]