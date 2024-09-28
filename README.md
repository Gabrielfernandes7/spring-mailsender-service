# 📧 Email Service com Spring Boot e Mailtrap

Este projeto demonstra como configurar um **serviço de envio de emails** utilizando **Spring Boot** e **Mailtrap**, uma ferramenta de sandbox para testar o envio de emails sem realmente enviá-los.

![Swagger](/docs/swagger.png)

![Mailtrap](/docs/mailtrap.png)

---

## 🚀 Início Rápido

Siga estas instruções para configurar e rodar o serviço de envio de email.

### 📋 Pré-requisitos

- **Java 17+**
- **Maven 3.6+**
- Conta no [Mailtrap](https://mailtrap.io/)

---

## ⚙️ Configuração do Spring Boot

### 1. Dependências Maven

No arquivo `pom.xml`, adicione a seguinte dependência para o **Spring Boot Starter Mail**:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-mail</artifactId>
</dependency>
