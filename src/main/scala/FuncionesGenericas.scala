object FuncionesGenericas {

  def Identidad[A] (x: A): A ={ x}

  def primeroLista[A] (lst: List[A]): A = {
      lst.head
  }

  val lista= List(1,2,3,4,5,6,7,8,9)
  val lista2 = List("a","b","c")

  def main(args: Array[String]): Unit = {
      println(s"${Identidad(3)}")
      println(s"${Identidad(true)}")
      println(s"${Identidad(30.0)}")
      println(s"${primeroLista(lista)}")
    println(s"${primeroLista(lista2)}")
  }
}
