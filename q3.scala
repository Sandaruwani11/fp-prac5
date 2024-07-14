object Fibonacci {

  def fibonacci(n: Int): Int = n match {
    case 0 => 0
    case 1 => 1
    case _ => fibonacci(n - 1) + fibonacci(n - 2)
  }

  def fibonacciSeq(n: Int, i: Int = 0): Unit = {
  if (i <= n) {
    println(fibonacci(i))
    fibonacciSeq(n, i + 1)
  }
}

  def main(args: Array[String]): Unit = {
    val n = 10
    println(s"The first $n Fibonacci numbers are:")
    fibonacciSeq(n - 1)
  }
}
