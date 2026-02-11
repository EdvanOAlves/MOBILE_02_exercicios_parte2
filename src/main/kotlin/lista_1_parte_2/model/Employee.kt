package lista_1_parte_2.model

//    20 -) Crie uma classe “Funcionario” com “nome”, “salario” e uma função que retorne o salário, depois crie uma
//    classe “Gerente” que herde “Funcionario” e sobrescreva a função que retorna o salário, retornando o salário com 20% de comissão (aumento)
open class Employee(var name:String, salary:Float) {
    open var salary: Float = salary
}