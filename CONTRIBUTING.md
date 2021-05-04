# Como contribuir com o projeto

- [Instalando o projeto](#instalando-o-projeto)
- [Reportando Issues](#reportando-issues)
- [Submetendo Pull Requests](#submetendo-pull-requests)

## Instalando o projeto

Para abrir um pull-request, primeiramente crie um fork do projeto para a sua conta, então clone o projeto em sua maquina:

```sh
git clone https://github.com/leonardofaria00/desafio-sulamerica.git
```

Vamos construir e executar o programa. Abra uma linha de comando (ou terminal) e navegue até a pasta onde você tem os arquivos do projeto. Podemos construir e executar o aplicativo emitindo o seguinte comando:

```sh
mvnw spring-boot:run
```

Agora pronto, você já pode começar a contribuir com o projeto!

## Reportando Issues

Você pode criar uma issue [aqui](https://github.com/leonardofaria00/desafio-sulamerica/issues), mas, lembre-se de ser claro e informar o máximo de detalhes possíveis.

## Submetendo Pull Requests

- Crie pull requests pequenos, para que a revisão seja feita mais facilmente.
- Inclua detalhes do que está sendo feito na descrição.
- Altere a documentação se for necessário.
- Verifique se todos os testes estão passando localmente.
- Não esqueça de verificar o build com as validações de teste coverage e build no travis-ci.

## Recursos

swagger: http://localhost:8080/swagger-ui.html

GET: http://localhost:8080/

GET: http://localhost:8080/exames

POST: http://localhost:8080/exames {"nomeExame": "Emograma", "descricaoExame": "Exame de sangue."}

GET: http://localhost:8080/exames/id

PUT: http://localhost:8080/exames/id {"nomeExame": "Emograma completo", "descricaoExame": "Exame de sangue."}

DELETE: http://localhost:8080/exames/id
