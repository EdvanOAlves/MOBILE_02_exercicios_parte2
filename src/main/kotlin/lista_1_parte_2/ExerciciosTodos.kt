package lista_1_parte_2

import lista_1_parte_2.model.Product

class ExerciciosTodos {




//    18 -) Crie um array de objetos representando produtos (nome, preço) e mostre o nome do produto mais caro
fun exercise18(){
    //Criando array
    val product1 = (Product("Mesa digitalizadora", 287.23F))
    val product2 = (Product("Sketchbook", 35.00F))
    val product3 = (Product("Teclado", 45.00f))
    val productArray: Array<Product> = arrayOf(product1, product2, product3)

    //Extraindo produto mais caro
    val mostExpensiveProduct: Product = productArray.reduce { mostExpensive, product ->
        if (product.price > mostExpensive.price) product
        else mostExpensive}

    println(mostExpensiveProduct.name)
}

//    19 -) Crie uma classe “ContaBancaria” com os atributos “nomeTitular” e “saldo” (privado) e crie funções para depositar um valor, sacar um valor e para consultar o saldo
//Checar a Main

//    20 -) Crie uma classe “Funcionario” com “nome”, “salario” e uma função que retorne o salário, depois crie uma classe “Gerente” que herde “Funcionario” e sobrescreva a função que retorna o salário, retornando o salário com 20% de comissão (aumento)

}

