fun main() {
    val numbers = IntArray(4)
    
    for (i in 0 until 4) {
        while (true) {
            try {
                println("Ingresa el número ${i + 1}:")
                val input = readLine() ?: throw IllegalArgumentException("Entrada no válida.")
                numbers[i] = input.toInt()
                break
            } catch (e: NumberFormatException) {
                println("Por favor, ingresa un número entero válido.")
            } catch (e: IllegalArgumentException) {
                println(e.message)
            }
        }
    }
    
    val maxNumber = numbers.maxOrNull()
    println("El número mayor del array es: $maxNumber")
}
