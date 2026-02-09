package lista_1_parte_2

class Exercise_14 {
//    14 -) Dada uma lista de preços, calcule o total da compra
    companion object{
        fun calcTotal(productPrices: List<Float>): Float{
            return productPrices.reduce { total, price -> total+price}
        }

    }
}