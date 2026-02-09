package lista_1_parte_2

import lista_1_parte_2.model.Product

/*
*

* */

//12 -) Escreva um programa que conte de 1 a 100 e:
//● Se for múltiplo de 3, mostre “Batata”
//● Se for múltiplo de 5, mostre “Quente”
//● Se for múltiplo de 3 e 5, mostre “BatataQuente”

class ExerciciosTodos {
    fun hotPotato(){
        var list = 1..100
        var trigger = false
        for (i in list) {
            if (i % 3 == 0){
                print("Batata")
                trigger = true
            }
            if (i % 5 == 0){
                print("Quente")
                trigger = true
            }
            if (trigger){
                print("\n")
                trigger = false
            }
        }
    }

//    13 -) Dada uma lista de números, crie uma nova lista apenas com os ímpares
fun extractOdds(numberList: List<Int>): List<Int> {
    return numberList.filter { it % 2 == 1 }

}
//    14 -) Dada uma lista de preços, calcule o total da compra
fun calcTotal(productPrices: List<Float>): Float{
    return productPrices.reduce { total, price -> total+price}
}

//    15 -) Dada uma lista de idades, calcule a média dos maiores de idade
fun averageAdultAges(ageList: List<Int>): Float{
    //Extraindo maiores de idade
    val adultAges = ageList.filter{it >=18}
    //Somando as idades
    val total = adultAges.reduce{total,age-> total+age}
    //Extraindo média
    return total.toFloat()/adultAges.size
}
//    16 -) Dada uma variável numérica, calcule o seu fatorial (ex: 5! = 5 * 4 * 3 * 2 * 1 = 120)

    fun calcFactorial(number: Int):Int{
        val numberRange = (number downTo 1).toList();
        return numberRange.reduce { total, number ->  total * number }
    }

//    17 -) Crie um objeto “pessoa” com nome, idade e cidade, depois exiba uma frase com os dados do objeto por meio de um método: “Maria tem 25 anos e mora em São Paulo.”
    class Pessoa(var name: String, var age: Int, var city: String){
        fun showDetails(){
            println("$name is $age years old and lives on $city")
        }
    }

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

