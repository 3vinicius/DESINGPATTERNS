# Resumo Grasp

## Especialista
- O metodo a realizar uma tarefa é aquele que tem todo o conhecimento necessário para realiza-la
- MUITO TRIVIAL, por isso tudo sera resumido aqui

```java
// Especialista da Informação: Cada classe sabe calcular o próprio imposto
abstract class Produto {
    protected double preco;

    public Produto(double preco) {
        this.preco = preco;
    }

    public abstract double calcularImposto();
}

class Eletronico extends Produto {
    public Eletronico(double preco) {
        super(preco);
    }

    @Override
    public double calcularImposto() {
        return preco * 0.15;
    }
}

class Alimento extends Produto {
    public Alimento(double preco) {
        super(preco);
    }

    @Override
    public double calcularImposto() {
        return preco * 0.05;
    }
}

// Visitor: Permite adicionar novos comportamentos sem alterar as classes de produtos
interface Visitor {
    void visitar(Eletronico eletronico);
    void visitar(Alimento alimento);
}

class ExibirDetalhesVisitor implements Visitor {
    @Override
    public void visitar(Eletronico eletronico) {
        System.out.println("Eletrônico: Preço = " + eletronico.preco + ", Imposto = " + eletronico.calcularImposto());
    }

    @Override
    public void visitar(Aliment aliment) {
    }
}


```
---

## Criador 
- Vem de um problema do acoplamento forte entre as classes
- Criar objetos dentro de outros objetos deixa o codigo menos flexivel 
- Deve CRIAR instanciar os objetos na classes que dependa diretamente
- que contenha uma associação ou composição

```java
class Pedido {
    private List<Item> itens = new ArrayList<>();

    public Item adicionarItem(String nome, int quantidade) {
        // O Pedido cria os itens porque possui a associação com eles
        Item item = new Item(nome, quantidade);
        itens.add(item);
        return item;
    }

    public List<Item> getItens() {
        return itens;
    }
}

class Item {
    private String nome;
    private int quantidade;

    public Item(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Item: " + nome + ", Quantidade: " + quantidade;
    }
}

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.adicionarItem("Livro", 2);
        pedido.adicionarItem("Caneta", 10);

        pedido.getItens().forEach(System.out::println);
    }
}

```

---


### Controlador

-  Uma classe que serve como um orquestrador 
- Pegando requisições e passando para o service



--- 

## Coesão

- Buscar ter modulos e classes com propositos bem definidos

### Críterios de coesão

- Metodos, classes, pacotes, subsistema


### Coesão Baixa
- Modulos e classes com coesão baixa realização muitas operaçoes pouuco correlacionadas

### Coesão Alta
- Quando as opeção são relacionada entre as classes e pacotes

### Coesão coninsidente
- Quando é cnveniente reunir em um unico lugar mesmo que seja arbitrario
- por exemplo a classe utils

### Coesão lógica
- Quando há uma logica, finalidade entre metodos e classes
- Geralmente tem tarefas similares de natureza comum

### Coesão temporal
- Quando os metodos e classes estão sendo agrupador por conveniencia de tempo de execução

### Coesão procedural
-  Quando são agrupados por executar em determinada sequencia um conjunto de dados 
- difere da coesão logica, pois aqui não há uma logica definida nas tarefas executadas
- Geralmente tem uma oredem, um fluxo a ser seguido
-  Geralmente tem um processo maior

### Coesão de comunicação 
- são agrupados em uma classe ou modulo tarefas com natureza diferente
- Mas esse modulo ou classe tem a responsabilidade de comunicar as diferentes tarefas

### coesão Sequencial
- Uma etapa depende da outra 
- Não algo maior 


### Coesão funcional
- reune elementos que cumprem um unico proposito bem definido 
- Exemplo java.io




