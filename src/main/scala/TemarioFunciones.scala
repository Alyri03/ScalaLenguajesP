object TemarioFunciones {
  def multiplicar(a: Int, b: Int): Int = {
    a * b
  }

  def esPar(a:Int): Boolean ={
    if( a % 2 == 0){
      return true
    }else{
      return false
    }
  }

  def areaTriangulo(base: Double, altura:Double): Double={
      (base*altura)/2
  }

  def convertirAFahrenheit(c: Double): Double = {
    c*1.8+32
  }

  def mayor(a: Int, b:Int):Int={
    if(a>b){
      return a
    } else {
      return b
    }
  }

  val xd1 = (x:Int, y: Int) => x+y



  val numeros = List(2,4,6,8,10)

  val numerosEntre2 = numeros.map(n => n/2)

  def saludar(nombre: String): String ={
    s"Hola $nombre"
  }

  def sumarHasta(n: Int): Int ={
    var acumulable = 0;

    for (x <- 1 to n){
      acumulable = acumulable+x
    }
    return acumulable
  }

  // Funciones como parametros

  def AplicarOperacion (a: Int, b: Int, operacion: (Int, Int ) => Int ): Int ={
      operacion(a,b)
  }


  val sumaAnonima = (a: Int, b: Int) => a+b

  def main(args: Array[String]): Unit = {

    val multiplicado = multiplicar(3, 2);
    val xd = esPar(9)
    val xd2 = esPar(8)



    println(sumaAnonima(2,3))
    println(s"El valor multiplicado es de $multiplicado")
    println(s"El primer valor es par? $xd")
    println(s"El segundo valor es par? $xd2")
    println(s"Area del triangulo ${areaTriangulo(3,2)}")
    println(s"Convertido a Fahrenheit ${convertirAFahrenheit(23)}")
    println(s"El mayor es ${mayor(3,5)}")
    println(s"${saludar("Luis")}")
    println(s"${sumarHasta(3)}")
    println(s"${numerosEntre2}")
    println(s"${AplicarOperacion(2, 3, (a: Int, b: Int) => a + b)}")
    println(s"${xd1(1,3)}")
  }
}

