package numeric.FizzBuzz

object FizzBuzz {
    fun fizzBuzz( n : Int ) : List<String> {
        val list = ArrayList< String > ( n )
        for ( i in 1 .. n ) {
            if ( i % 3 == 0 && i % 5 == 0 ) list.add( "FizzBuzz" )
            else if ( i % 3 == 0 ) list.add( "Fizz" )
            else if ( i % 5 == 0 ) list.add( "Buzz" )
            else list.add( i.toString() )
        }
        return list
    }
}