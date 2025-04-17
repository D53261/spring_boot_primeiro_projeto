# Meu Primeiro Projeto com Spring Boot

Este é o meu primeiro projeto utilizando o framework **Spring Boot**. O objetivo deste projeto foi aprender os conceitos básicos de desenvolvimento de aplicações web com Java, utilizando o Spring Boot para criar uma API REST simples para compreender conceitos básicos do desenvolvimento de aplicações.

## Tecnologias Utilizadas
* **Java 23.0.1**: Linguagem de programação principal do projeto.
* **Spring Boot 3.4.4**: Framework para simplificar o desenvolvimento de aplicações Java.
* **Spring Data JPA**: Para integração com o banco de dados e manipulação de entidades.
* **H2 Database**: Banco de dados em memória utilizado para testes.
* **Maven**: Gerenciador de dependências e build do projeto.
* **Postman**: Ferramenta para testar os endpoints da API.

## Aprendizados
Durante o desenvolvimento deste projeto, aprendi:
1. Como configurar um projeto Spring Boot do zero.
2. A criar entidades JPA e mapeá-las para tabelas no banco de dados.
3. A utilizar o Spring Data JPA para realizar operações CRUD.
4. A criar controladores REST com mapeamento de endpoints (`@GetMapping`, `@PostMapping`, `@PutMapping`, etc.).
5. A configurar e acessar o console do banco de dados H2.
6. A utilizar o arquivo `application.properties` para configurar a aplicação.
7. A testar endpoints utilizando ferramentas como Postman.

## Funcionalidades
- **Listar Usuários**: Endpoint para listar todos os usuários cadastrados.
- **Buscar Usuário por ID**: Endpoint para buscar um usuário específico pelo ID.
- **Adicionar Usuário**: Endpoint para adicionar um novo usuário.
- **Atualizar Usuário**: Endpoint para atualizar os dados de um usuário existente.
- **Banco de Dados em Memória**: Utilização do H2 para armazenar os dados temporariamente sem necessidade de instalação.

## Como Executar
1. Certifique-se de ter o **Java** e o **Maven** instalados no seu computador.
2. Clone este repositório.
3. No terminal, navegue até a pasta do projeto e execute:
   ```bash
   mvn spring-boot:run

## Feito por:
### Danilo Ribeiro 
### Linkedin: https://www.linkedin.com/in/danilo-ribeiro-catroli-da-silva/
### Email: danilo051007@gmail.com


