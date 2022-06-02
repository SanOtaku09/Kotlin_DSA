package numeric.ReverseInteger

object ReverseInteger {
    fun reverse(x: Int): Int {
        var reversed = 0
        var normal = x
        val negative = if ( normal < 0 ) {
            normal *= -1
            true
        } else {
            false
        }
        while ( normal != 0 ) {
            reversed *= 10
            reversed += normal % 10
            normal /= 10
        }
        return if ( negative ) -1*reversed else reversed
    }
}