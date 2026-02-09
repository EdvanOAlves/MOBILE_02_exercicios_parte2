package lista_1_parte_2

class Exercise_15 {
//    15 -) Dada uma lista de idades, calcule a média dos maiores de idade
    companion object{
        fun averageAdultAges(ageList: List<Int>): Float{
            //Extraindo maiores de idade
            val adultAges = ageList.filter{it >=18}
            //Somando as idades
            val total = adultAges.reduce{total,age-> total+age}
            //Extraindo média
            return total.toFloat()/adultAges.size
        }
    }
}