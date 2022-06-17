package string.MultiplyStrings

object MultiplyStrings {
    fun multiply( num1: String, num2: String): String {
        if ( num1.replace( "0" , "" ).trim() == "" || num2.replace("0", "").trim() == "" ) return "0"
        val ans = StringBuilder()
        val reversedNum1 = StringBuilder( num1 ).reverse().toString()
        val reversedNum2 = StringBuilder( num2 ).reverse().toString()
        var index = 0
        var maxLen = 0
        val singleMultiples = Array( reversedNum2.length ){
            it.let {
                numOfZeroes ->
                val singleMutipliedNum = StringBuilder()
                repeat( numOfZeroes ) {
                    singleMutipliedNum.append( '0' )
                }
                singleMutipliedNum
            }
        }
        for ( i in reversedNum2 ) {
            var carryNum = 0
            for ( j in reversedNum1 ) {
                singleMultiples[index].append(
                    ((i-'0')*(j-'0')+carryNum).let {
                        carryNum = it/10
                        it%10
                    }
                )
            }
            if ( carryNum/10 == 0 && carryNum != 0 ) singleMultiples[index].append( carryNum )
            else if ( carryNum != 0 ) {
                singleMultiples[index].append( StringBuilder( carryNum ).reverse() )
            }
            if ( maxLen < singleMultiples[index].length ) maxLen = singleMultiples[index].length
            index++
        }
        var carry = 0
        for ( i in 0 until maxLen ) {
            var toAdd = carry
            for ( j in singleMultiples ) {
                if ( j.length > i ) toAdd += j[i]-'0'
            }
            ans.append( toAdd%10 )
            carry = toAdd/10
        }
        if (carry != 0 && carry /10 == 0 ) ans.append( carry )
        else if ( carry != 0 ) ans.append( StringBuilder(carry).reverse() )
        return ans.reverse().toString()
    }
}