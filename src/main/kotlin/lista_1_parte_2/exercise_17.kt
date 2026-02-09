package lista_1_parte_2

class exercise_17 {
//    17 -) Crie um objeto “pessoa” com nome, idade e cidade, depois exiba uma frase com os dados do objeto por meio de um método: “Maria tem 25 anos e mora em São Paulo.”
    companion object{
        class Pessoa(var name: String, var age: Int, var city: String){
            fun showDetails(){
                println("$name is $age years old and lives on $city")
            }
        }
    }
}