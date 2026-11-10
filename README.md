# Fábrica Abstrata em Java

Atividade de Análise e Projeto de Sistemas.

Código do livro *Use a Cabeça! Padrões de Projetos*, páginas 129 a 134: a pizzaria usando fábricas de ingredientes por região

## Arquivos

- `PizzaIngredientFactory`: interface da fábrica de ingredientes
- `NYPizzaIngredientFactory` e `ChicagoPizzaIngredientFactory`: fábricas de Nova York e de Chicago (a de Chicago é o exercício "Aponte seu lápis")
- `Ingredientes`: massas, molhos, queijos e demais ingredientes
- `Pizza`, `CheesePizza`, `ClamPizza`, `VeggiePizza` e `PepperoniPizza`: as pizzas, que pegam os ingredientes da fábrica
- `PizzaStore` e `NYStylePizzaStore`: a pizzaria de Nova York
- `PizzaTestDrive`: exemplo de uso

## Como rodar

```sh
javac *.java
java PizzaTestDrive
```
