package lista_1_parte_2

class Exercise_16 {
//    16 -) Dada uma variável numérica, calcule o seu fatorial (ex: 5! = 5 * 4 * 3 * 2 * 1 = 120)
    companion object{
        fun calcFactorial(number: Int):Int{
            val numberRange = (number downTo 1).toList();
            return numberRange.reduce { total, number ->  total * number }
        }
    }
}