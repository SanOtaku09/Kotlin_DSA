package numeric.NumberOf1Bits

object NumberOf1Bits {
    fun hammingWeight(n:Int):Int {
        var num = n
        var count = 0
        for ( i in 0 until 32 ) {
            count += num and 1
            num = num shr 1
        }
        return count
    }
}