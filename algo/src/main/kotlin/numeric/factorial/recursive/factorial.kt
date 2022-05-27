package numeric.factorial.recursive
object factorial {
    tailrec fun getFactorial( num : Int , product : Long = 1.toLong() ) : Long = if ( num == 1 ) product else getFactorial( num - 1 , product * num.toLong() )
}