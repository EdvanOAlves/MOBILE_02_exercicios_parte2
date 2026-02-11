import lista_1_parte_2.Exercise_12
import lista_1_parte_2.Exercise_13
import lista_1_parte_2.Exercise_14
import lista_1_parte_2.Exercise_15
import lista_1_parte_2.Exercise_16
import lista_1_parte_2.Exercise_18
import lista_1_parte_2.model.BankAccount
import lista_1_parte_2.model.Employee
import lista_1_parte_2.model.Manager
import lista_1_parte_2.model.Person
import lista_1_parte_2.model.Product

fun main() {

//    12 -) Escreva um programa que conte de 1 a 100 e:
//    ● Se for múltiplo de 3, mostre “Batata”
//    ● Se for múltiplo de 5, mostre “Quente”
//    ● Se for múltiplo de 3 e 5, mostre “BatataQuente”
    Exercise_12.hotPotato()

//    13 -) Dada uma lista de números, crie uma nova lista apenas com os ímpares
    val numberList = (1..25).toList()
    println(Exercise_13.extractOdds(numberList))

//    14 -) Dada uma lista de preços, calcule o total da compra
    val priceList = listOf(0.7F, 1.20F, 22.4F, 33.45F, 36.45F, 10.50F)

    println("CurrentTest")
    val total = Exercise_14.calcTotal(priceList)
    println("O total da compra foi de: R$" + String.format("%.2f",total))


//    15 -) Dada uma lista de idades, calcule a média dos maiores de idade
    val ageList = listOf(65, 12, 16, 25, 22, 45)
    println(Exercise_15.averageAdultAges(ageList))


//    16 -) Dada uma variável numérica, calcule o seu fatorial (ex: 5! = 5 * 4 * 3 * 2 * 1 = 120)
    println(Exercise_16.calcFactorial(6))

//    17 -) Crie um objeto “pessoa” com nome, idade e cidade, depois exiba uma frase com os dados do objeto por meio de um método: “Maria tem 25 anos e mora em São Paulo.”
    val person1 = Person("Maria", 25, "São Paulo")
    person1.showDetails()

//    18 -) Crie um array de objetos representando produtos (nome, preço) e mostre o nome do produto mais caro
    //Criando array
    val productArray: Array<Product> = arrayOf(
        (Product("Drawing tablet", 287.23F)),
        (Product("Sketchbook", 35.00F)),
        (Product("Keyboard", 45.00f))
    )

    val mostExpensive: Product = Exercise_18.getMostExpensive(productArray)
    println("${mostExpensive.name} is the most expensive product on the list, costing R$${mostExpensive.price}")

//    19 -) Crie uma classe “ContaBancaria” com os atributos “nomeTitular” e “saldo” (privado) e crie funções para depositar um valor, sacar um valor e para consultar o saldo
    val bankAccount = BankAccount("Riquinho", 1000.00F)
    println(bankAccount.checkBalance())
    bankAccount.makeDeposit(200.00F)
    println(bankAccount.checkBalance())
    bankAccount.withdraw(150.00F)
    println(bankAccount.checkBalance())

//    20 -) Crie uma classe “Funcionario” com “nome”, “salario” e uma função que retorne o salário, depois crie uma classe “Gerente” que herde “Funcionario” e sobrescreva a função que retorna o salário, retornando o salário com 20% de comissão (aumento)
    val estagiario = Employee("Junior", 1700.00F)
    val donoTodo = Manager("Chefe Chef", 1700.00F)
    println(estagiario.salary)
    println(donoTodo.salary)
}