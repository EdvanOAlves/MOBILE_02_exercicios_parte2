import lista_1_parte_2.ExerciciosTodos
import lista_1_parte_2.model.BankAccount

fun main() {
    var exercicios = ExerciciosTodos()
    exercicios.hotPotato()

    val numberList = (1..25).toList()
    println(exercicios.extractOdds(numberList))

    println(exercicios.calcFactorial(6))

    exercicios.exercise18()

    val bankAccount = BankAccount("Riquinho", 1000.00F)

    //Teste exercicio 19
    println(bankAccount.checkBalance())
    bankAccount.makeDeposit(200.00F)
    println(bankAccount.checkBalance())
    bankAccount.withdraw(150.00F)
    println(bankAccount.checkBalance())
}