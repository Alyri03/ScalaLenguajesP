object Ejercicios {
  def esMultiploDe3(a: Int): Boolean  ={
    if(a % 3==0){
      true
    }else {
      false
    }
  }

  val listaAlCuadrado = List(1, 2, 3, 4).map(x=>x*x)
  val listaMayoresA10 = List(5, 12, 7, 18, 3, 20).filter(_ >10)
  val listaSumada = List(4,5,6).reduce((a,b) => a+b)

  val listaNombre = List("Luis", "Leonardo", "Saul").foreach(x=> println(s"Hola ${x}"))

  def aplicar2Veces(n:Int, aplicar:Int => Int): Int ={
      aplicar(aplicar(n))
  }

  def crearSaludo(nombre: String): () => String = {
    () => s"Hola, $nombre"
  }

  def identidad[A] (x: A): A ={ x }

  def dobleLista[A] (lst: List[A]): List[A] = {
    lst++lst
  }

  def main(args: Array[String]): Unit = {
    println(esMultiploDe3(6))
    println(esMultiploDe3(5))
    println(listaAlCuadrado)
    println(listaSumada)
    println(s"${aplicar2Veces(2, (x:Int)=> x+1 )}")
    println(s"${crearSaludo("Luis")}")
    println(s"${identidad(3)}")
    println(s"${dobleLista(List(1,2))}")


  }
}
