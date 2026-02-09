import lista_1_parte_2.ExerciciosTodos
import lista_1_parte_2.Exercise_12
import lista_1_parte_2.Exercise_13
import lista_1_parte_2.Exercise_16
import lista_1_parte_2.model.BankAccount

fun main() {

    //12
    Exercise_12.hotPotato()

    //13
    val numberList = (1..25).toList()
    println(Exercise_13.extractOdds(numberList))

    //14


    //15


    //16
    println(Exercise_16.calcFactorial(6))

    //17

    //18
    var exercicios = ExerciciosTodos()
    exercicios.exercise18()

    val bankAccount = BankAccount("Riquinho", 1000.00F)

    //Teste exercicio 19
    println(bankAccount.checkBalance())
    bankAccount.makeDeposit(200.00F)
    println(bankAccount.checkBalance())
    bankAccount.withdraw(150.00F)
    println(bankAccount.checkBalance())

    //20
}