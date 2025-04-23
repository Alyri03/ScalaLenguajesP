object Ejercicios2 {

  def sumaDeNNumeros(n:Int):Int={
    var acumulable =0
    for(x <- 1 to n){
      acumulable = acumulable + x
    }
    return acumulable
  }

  def recorrerListaEImprimir(x: List[Int]): List[Int] = {
    x.filter(x=> x%2 == 0)
  }

  def main(args: Array[String]): Unit = {
    println(s"${sumaDeNNumeros(3)}")
    println(s"${recorrerListaEImprimir(List(1,2,3,4,5,6,7,8))}")
  }
}
