# Usa o JDK 21
FROM eclipse-temurin:21-jdk

WORKDIR /app

# Copia o projeto inteiro
COPY . .

# Compila com Maven Wrapper
RUN ./mvnw clean package -DskipTests

# Roda o jar gerado
CMD ["java", "-jar", "target/dslist-0.0.1-SNAPSHOT.jar"]
