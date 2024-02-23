fun main() {
    val pares = intArrayOf(0, 2, 4, 6)
    val impares = intArrayOf(1, 3, 5, 7)

    val soma = IntArray(pares.size)

    for (i in pares.indices) {
        soma[i] = pares[i] + impares[i]
        println("Soma de ${pares[i]} + ${impares[i]} = ${soma[i]}")
    }
}