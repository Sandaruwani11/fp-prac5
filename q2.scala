object LibraryManagement {
  
  var library: Set[(String, String, String)] = Set(
    ("Book1", "Author1", "ISBN1"),
    ("Book2", "Author2", "ISBN2"),
    ("Book3", "Author3", "ISBN3")
  )

  def addBook(title: String, author: String, isbn: String): Unit = {
    library += ((title, author, isbn))
    println(s"Added $title by $author to the library.")
  }

  def removeBook(isbn: String): Unit = {
    library.find(book => book._3 == isbn) match {
      case Some(book) =>
        library -= book
        println(s"Removed ${book._1} by ${book._2} from the library.")
      case None =>
        println(s"No book found with ISBN $isbn.")
    }
  }

  def displayLibrary(): Unit = {
    println("Current Library Collection:")
    library.foreach(book => println(s"${book._1} by ${book._2}, ISBN: ${book._3}"))
  }

  def main(args: Array[String]): Unit = {
  
    displayLibrary()
    addBook("Book4", "Author1", "ISBN4")
    displayLibrary()
    removeBook("ISBN2")
    displayLibrary()
  }
}
