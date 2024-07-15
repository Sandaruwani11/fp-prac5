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

  def display(): Unit = {
    println("Current Library Collection:")
    library.foreach(book => println(s"${book._1} by ${book._2}, ISBN: ${book._3}"))
  }

  def searchByAuthor(author: String): Unit = {
    val books = library.filter(book => book._2 == author)
    if (books.nonEmpty) {
      println(s"Books by $author:")
      books.foreach { book =>
        println(s"${book._1}, ISBN: ${book._3}")
      }
    } else {
      println(s"No books found by $author")
    }
  }

  def main(args: Array[String]): Unit = {
  
    display()
    addBook("Book4", "Author1", "ISBN4")
    display()
    removeBook("ISBN2")
    display()
    searchByAuthor("Author1")
    
  }
}
