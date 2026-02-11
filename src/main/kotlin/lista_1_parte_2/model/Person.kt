package lista_1_parte_2.model

class Person (var name: String, var age: Int, var city: String){
    fun showDetails(){
        println("$name is $age years old and lives on $city")
    }
}