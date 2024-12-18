import kotlin.math.sqrt

fun afficherNombresPairsOuImpairs(x: Int, pairs: Boolean) {
    var count = 0
    var num = if (pairs) 0 else 1
    while (count < x) {
        println(num)
        num += 2
        count++
    }
}

fun afficherFibonacci(x: Int) {
    var a = 0
    var b = 1
    for (i in 1..x) {
        println(a)
        val temp = a
        a = b
        b += temp
    }
}

fun calculerFactoriel(x: Int = 10): Long {
    return if (x == 0) 1 else x * calculerFactoriel(x - 1)
}

fun afficherNombresPremiers(x: Int) {
    var count = 0
    var num = 2
    while (count < x) {
        if (estPremier(num)) {
            println(num)
            count++
        }
        num++
    }
}

fun estPremier(num: Int): Boolean {
    if (num <= 1) return false
    for (i in 2..sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }
    return true
}

fun main() {
    println("Les 5 premiers nombres pairs:")
    afficherNombresPairsOuImpairs(5, true)

    println("\nLes 5 premiers nombres impairs:")
    afficherNombresPairsOuImpairs(5, false)

    println("\nLes 5 premiers nombres de la suite Fibonacci:")
    afficherFibonacci(5)

    println("\nFactoriel de 5:")
    println(calculerFactoriel(5))

    println("\nLes 5 premiers nombres premiers:")
    afficherNombresPremiers(5)
}