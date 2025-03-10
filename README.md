🌐 API REST - Teste Perinity

👨‍💻 Autor

Rômulo Evangelista de Oliveira

📌 Sobre o Projeto

Este projeto consiste no desenvolvimento de uma API REST seguindo o padrão MVC, criada com Spring Boot e integrada ao banco de dados PostgreSQL. A API permite o gerenciamento de pessoas e suas respectivas tarefas.

🛠️ Tecnologias Utilizadas

✅ Java - JDK 17

✅ Spring Boot - Versão 3.4.3

✅ Maven - Gerenciamento de dependências

✅ PostgreSQL - Versão 10

✅ Postman - Para testes e injeção de JSON



🚀 Funcionalidades

📌 Gerenciamento de Pessoas :

Cada pessoa possui um ID, Nome, Departamento e uma lista de tarefas.

📌 Gerenciamento de Tarefas :

Cada tarefa possui um ID, Título, Descrição, Prazo, Departamento, Duração, Pessoa alocada e um status de finalização.

✅ Testes unitários implementados com 100% de sucesso (zero erros).


🏗️ Configuração do Banco de Dados

Antes de rodar a aplicação, configure o banco de dados no arquivo application.properties:
# Configuração do Datasource
spring.datasource.url=jdbc:postgresql://localhost:5432/teste

spring.datasource.driverClassName=org.postgresql.Driver

spring.datasource.username=postgres

spring.datasource.password=1234



🔗 Endpoints da API, usar o Postman:

🏢 Criar um Cliente

POST http://localhost:8080/clientes
{
    "nome": "Rômulo Evangelista",
    "departamento": "TI"
}

📌 Criar uma Tarefa

POST http://localhost:8080/tarefas
{
    "titulo": "Implementar API REST",
    "descricao": "Desenvolver endpoints para o sistema",
    "prazo": "2025-03-10",
    "departamento": "TI",
    "duracao": 10,
    "pessoaAlocada": {
        "id": 1
    },
    "finalizado": false
}

🏆 Desenvolvido por Rômulo Evangelista de Oliveira 🚀
