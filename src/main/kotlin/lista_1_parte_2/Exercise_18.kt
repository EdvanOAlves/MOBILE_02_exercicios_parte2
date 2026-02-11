package lista_1_parte_2
import lista_1_parte_2.model.Product

class Exercise_18 {
    //    18 -) Crie um array de objetos representando produtos (nome, preço) e mostre o nome do produto mais caro
    companion object {
        fun getMostExpensive(productArray: Array<Product>): Product {
            //Extraindo produto mais caro
            val mostExpensiveProduct: Product = productArray.reduce { mostExpensive, product ->
                if (product.price > mostExpensive.price) product
                else mostExpensive
            }
            return mostExpensiveProduct
        }
    }
}