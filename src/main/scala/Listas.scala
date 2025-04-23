  object Listas {

    val listaPrecios = List(100.0, 250.0,80.0)

    val listaPreciosIGV = listaPrecios.map(n => n + n*0.18) // Mapeo cada instancia de la lista :v

    val listaEdades = List(20,30,40,50,60,70,80)

    val listaEdadesMayoresA60 = listaEdades.filter(n => n >=60) // Filtro las edades mayores a 60

    val listaNotas = List(20,10,12,15,16)

    val listaNotasAcumuladas = listaNotas.sum // Sumo todas los valores de la lista

    val listaNumeros = List(2,4,6)

    val listaNumerosMultiplicados = listaNumeros.reduce((a,b)=> a*b) // No Entendi bien que hace esto?

    val listaPalabras = List("Hola", "Saturno", "Tierra", "Marte")

    val listaPalabrasMasDe5Letras = listaPalabras.count(n => n.length > 5)

    val listaNombres = List("Neomi", "Luis", "Gen", "Eduardo")

    val listaSaludoNombres = listaNombres.foreach(n => println(s"Hola ${n}")) // No devuelve una lista para que devuelva la lista se usa MAP

    val lista = List(5,10,15,20)

    val listaSumada = lista.reduce((a,b) => a+b)

    val lista2 = List(2, 3, 4)
    val listaProducto = lista2.reduce((a,b) => a*b)

    val lista3= List(12, 43, 5, 78, 24)
    val listaMayor = lista3.reduce((a,b) => if(a >b )a else b )

    val lista4 = List(100, 20, 10)
    val listaDiferencia = lista4.reduce((a,b) => a-b)
    
    def main(args: Array[String]): Unit = {
        println(s"$listaPreciosIGV")
        println(s"$listaEdadesMayoresA60")
        println(s"$listaNotasAcumuladas")
        println(s"$listaNumerosMultiplicados")
        println(s"$listaPalabrasMasDe5Letras")
        println(s"$listaSaludoNombres")
        println(s"$listaSumada")
        println(s"$listaMayor")
        println(s"$listaDiferencia")
    }
  }
