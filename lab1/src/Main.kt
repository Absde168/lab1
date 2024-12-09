fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val a = 3
    val b = 5

    val sumOdd = numbers.filter { it % 2 != 0 }.sum()
    println("Сумма нечетных элементов: $sumOdd")

    val sumMultiplesOfA = numbers.filter { it % a == 0 }.sum()
    println("Сумма элементов, кратных $a: $sumMultiplesOfA")


    val sumMultiplesOfEither = numbers.filter { it % a == 0 || it % b == 0 }.sum()
    println("Сумма элементов, кратных $a или $b: $sumMultiplesOfEither")
}
