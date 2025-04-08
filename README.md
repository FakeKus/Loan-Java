# Loan-Java

## 📜 Descrição

O **Loan-Java** é uma aplicação desenvolvida em Java utilizando o framework Spring Boot. O objetivo do projeto é fornecer uma API para determinar os tipos de empréstimos disponíveis para clientes com base em critérios como idade, renda e localização.

## 🚀 Funcionalidades

- Determinação de tipos de empréstimos disponíveis:
  - **Empréstimo Pessoal** (Personal)
  - **Empréstimo Garantido** (Guaranteed)
  - **Empréstimo Consignado** (Consignment)
- API REST para envio de solicitações e retorno de resultados.

## 🛠️ Tecnologias Utilizadas

- **Java 17**: Linguagem de programação principal.
- **Spring Boot 3.4.4**: Framework para desenvolvimento rápido de aplicações Java.
- **Maven 3.9.9**: Gerenciador de dependências e build.

## 📋 Endpoints da API

### [POST] `{{host}}/customer-loans`

**Descrição:** Retorna os tipos de empréstimos disponíveis para um cliente com base nos dados fornecidos.

**Exemplo de Requisição:**

```json
{
  "age": 25,
  "cpf": "123.456.789-00",
  "name": "João Silva",
  "income": 4000,
  "location": "SP"
}
```

**Exemplo de Resposta:**

```json
{
  "client": "João Silva",
  "loansList": [
    {
      "type": "PERSONAL",
      "interestRate": 4
    },
    {
      "type": "GUARANTEED",
      "interestRate": 3
    }
  ]
}
```

**Alguns Outros Exemplos**

<div align="center">
<img src="https://github.com/user-attachments/assets/0426af09-cf2e-4eb3-99a5-cab7f481012f"/>
</div>

<div align="center">
<img src="https://github.com/user-attachments/assets/3570601f-3db3-4369-bbcf-5e6d88b386af"/>
</div>

<div align="center">
<img src="https://github.com/user-attachments/assets/ff0dff2b-52bd-4a80-9246-9ef62de68b3d"/>
</div>

## ⚙️ Instalação e Configuração

1. Certifique-se de ter o **Java 17** e o **Maven** instalados.

2. Clone este repositório:
   ```bash
   git clone https://github.com/FakeKus/Loan-Java.git
   ```

3. Importe o projeto em sua IDE preferida (Ex.: VisualStudio, IntelliJ IDEA).

4. Compile e execute os arquivos conforme necessário.

5. Acesse a aplicação em: [http://localhost:8080](http://localhost:8080)

## 📖 Referências

- [Spring Initializr](https://start.spring.io/)
- [Spring Guides](https://spring.io/guides)
- [Spring Web applications](https://spring.io/web-applications)

## 📋 Contribuições

Contribuições são bem-vindas! Para contribuir:
1. Faça um fork do projeto.

2. Crie uma branch com sua feature (`git checkout -b minha-feature`).

3. Faça o commit de suas alterações (`git commit -m 'Adiciona nova funcionalidade'`).

4. Envie para o branch principal (`git push origin minha-feature`).

5. Abra um Pull Request.

---

Sinta-se à vontade para abrir issues, sugerir melhorias e colaborar para expandir este projeto. 🚀 #Loan-Java


<p align="center">🌟 Obrigado por explorar o Loan-Java!</p>
