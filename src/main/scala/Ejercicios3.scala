object Ejercicios3 {


  def sumarHastaN(n: Int):Int ={
    var acumulado =0
    for (x <- 1 to n){
      acumulado = acumulado + x
    }
    return acumulado
  }



  def contarParesEImpares(lst: List[Int]): List[Int]={
    var pares= 0
    var impares = 0
    for(i <- lst){
        if(i % 2 == 0 ){
            pares +=1
        }else{
          impares +=1
        }
    }
    List(pares,impares)
  }

  val lista = List(8, 3, 7, 2, 10, 1, 0, -5, 13)

  def tablaMultiplicar(x: Int): Unit={
    for (i <- 1 to 10) {
      println(s"Tabla de multiplicar: $x x $i = ${x * i}")
    }
  }



  def comparador[A](a: A, b: A): Boolean={
    if(a == b){
      true
    }else{
      false
    }
  }

  def aplicarDosVeces[A](valor: A, f: A => A): A = {
    f(f(valor))
  }

  def filtrarLista[A](lst: List[A], condicion: A=> Boolean):List[A]={
      lst.filter(condicion)
  }



  def convertirPalabras(lst: List[String]): List[String] ={
    lst.filter(palabra => palabra.length >5)
  }

  def main(args: Array[String]): Unit = {


  }
}
