>####Alunos:
>* Joás Sousa Andrade
>* Luana Carvalho
>* Lucas Gomes
# Factory Method
### `Definição`
Esse padrão pode ser definido como uma classe ou função que possui 
dentro de si um método capaz de gerar objetos atráves de alguma lógica.


### `Composição do Projeto`
1. Crie uma _interface_ em comum para todos os objetos (por exemplo, 
   _interface_ `Produto`)


2. Crie classes que implementam a interface `Produto` 
   (por exemplo, `Alimento`, `Cosmetico`, `Informatica`...)


3. Crie uma classe criadora que implementa ou contem o
   método de fábrica — _Factory Method_ — Exemplo: `ProdutoFactory`.
   Esse metódo será responsável por criar objetos que 
   implementam a _interface_ `Produto`.

### `Benefícios`
> * Fácilita a instânciação de objetos.
> * O código fica mais flexivel.
> * Torna a classe que usa o objeto indepêndente, 
  pois agora ela não precisará saber como o objeto foi criado.
