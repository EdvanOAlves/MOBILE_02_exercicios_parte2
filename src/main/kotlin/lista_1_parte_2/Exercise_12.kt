package lista_1_parte_2

//12 -) Escreva um programa que conte de 1 a 100 e:
//● Se for múltiplo de 3, mostre “Batata”
//● Se for múltiplo de 5, mostre “Quente”
//● Se for múltiplo de 3 e 5, mostre “BatataQuente”
class Exercise_12 {
    companion object {
        fun hotPotato() {
            var list = 1..100
            var trigger = false
            for (i in list) {
                print(i)
                if (i % 3 == 0) {
                    print("Batata")
                    trigger = true
                }
                if (i % 5 == 0) {
                    print("Quente")
                    trigger = true
                }
                if (trigger) {
                    print("\n")
                    trigger = false
                }
            }
            //O que foi feito acima, só que mais inteligente
//            for (numero in 1..100){
//                print(numero)
//                if(numero% 3 == 0) print("Batata ")
//                if(numero% 5 == 0) print("Quente")
//                println()
//            }
        }
    }
}