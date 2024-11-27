fun fibonacci(n: Int): Int {
    return if (n <= 1) n
    else {
        fibonacci(n-1) + fibonacci(n-2)
    }
}

fun sumaRecursiva(n: Int): Int {
    return if (n == 1) 1
    else {
        n + sumaRecursiva(n-1)
    }
}

fun sumaLista(lista: List<Int>): Int {
    return if (lista.isEmpty()) 0
    else {
        lista[0] + sumaLista(lista.drop(1))
    }
}

fun main(args: Array<String>) {
    //Ejemplo de fibonacci
    val numero = 5
    val listaNumeros = listOf(1, 2, 3, 4)
    println("Ejemplo 1:")
    println("El numero es: ${fibonacci(numero)}")
    println("Ejemplo 2:")
    println("La suma de 5 numeros es: ${sumaRecursiva(numero)}")
    println("Ejemplo 3:")
    println("La suma de la lista es: ${sumaLista(listaNumeros)}")
}
