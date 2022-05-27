package numeric.factorial.using_loop
object factoiral {
    fun getFactorial(num: Int): Long {
        var product: Long = 1
        for (i in 2..num) product *= i
        return product
    }
}