package lista_1_parte_2

class Exercise_13 {
//    13 -) Dada uma lista de números, crie uma nova lista apenas com os ímpares
    companion object{
        fun extractOdds(numberList: List<Int>): List<Int> {
            return numberList.filter { it % 2 == 1 }
        }
    }
}