package lista_1_parte_2.model
//    19 -) Crie uma classe “ContaBancaria” com os atributos “nomeTitular” e “saldo” (privado) e crie funções para depositar um valor, sacar um valor e para consultar o saldo
class BankAccount(ownerName: String, balance: Float = 0.0F) {
    var ownerName: String = "";
    private var balance:Float

    init{
        this.ownerName = ownerName
        this.balance = balance
    }

    fun makeDeposit(value:Float){
        balance+= value;
    }
    fun withdraw(value:Float){
        if(balance>value){
            balance-= value;
            println("Here's your money: $value")
        }
        else
            println("Not enough cash! Stranger")
    }
    fun checkBalance():Float{
        return balance;
    }
}