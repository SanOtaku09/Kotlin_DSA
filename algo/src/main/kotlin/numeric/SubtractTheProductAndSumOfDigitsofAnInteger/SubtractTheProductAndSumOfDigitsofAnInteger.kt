package numeric.SubtractTheProductAndSumOfDigitsofAnInteger

object SubtractTheProductAndSumOfDigitsofAnInteger {
    fun subtractProductAndSum(n: Int): Int {
        if ( n == 0 ) return 0
        var sum = 0 ; var product = 1
        var i = n
        while ( i != 0 ) {
            ( i % 10 ).let {
                sum += it
                product *= it
            }
            i /= 10
        }
        return ( product - sum )
    }
}