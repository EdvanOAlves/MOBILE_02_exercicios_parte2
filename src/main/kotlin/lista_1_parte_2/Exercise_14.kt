package lista_1_parte_2

import lista_1_parte_2.model.Product

class Exercise_14 {
//    14 -) Dada uma lista de preços, calcule o total da compra
    companion object{
        fun calcTotal(productList: List<Float>): Float{
            return productList.reduce { total, price -> total + price}
        }

    }
}