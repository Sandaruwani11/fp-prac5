import scala.io.StdIn.readLine

object InventoryManagementSystem {

  def getProductList(): List[String] = {
    var products = List[String]()
    var input = ""

    println("Enter product names (type 'done' when finished):")
    input = readLine()
    while (input != "done") {
      products = products :+ input
      input = readLine()
    }

    products
  }

  def printProductList(products: List[String]): Unit = {
  for (i <- products.indices) {
    println(s"${i + 1}. ${products(i)}")
  }
}

  def getTotalProducts(products: List[String]): Int = products.length

  def main(args: Array[String]): Unit = {
    val productList = getProductList()
    println("\nProduct List:")
    printProductList(productList)
    println(s"\nTotal number of products: ${getTotalProducts(productList)}")
  }
}
