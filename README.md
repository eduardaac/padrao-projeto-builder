## 📦 Gerenciamento de Produtos

Este projeto demonstra a aplicação do **Padrão de Projeto Builder**.

O objetivo principal do padrão Builder é **separar a construção de um objeto complexo de sua representação**, permitindo que o mesmo processo de construção crie diferentes representações. No nosso cenário de **Gerenciamento de Produtos**, ele resolve o problema de criar instâncias da classe `Produto` que possui muitos atributos opcionais.

Ao invés de usar um construtor com muitos parâmetros ou *setters* repetitivos, usamos a classe `ProdutoBuilder` para guiar a construção do objeto passo a passo.
-----

## 📌 Diagrama de Classes
![Diagrama UML](diagrama_de_classes.jpeg)
-----

## 👩‍💻 Autora

Eduarda Araujo Carvalho
