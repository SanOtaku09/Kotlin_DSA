package numeric.FizzBuzz

import org.junit.Assert
import org.junit.Test
import numeric.FizzBuzz.FizzBuzz.fizzBuzz

class FizzBuzzTest {
    @Test
    fun test() {
        Assert.assertArrayEquals( fizzBuzz( 3 ).toTypedArray() , arrayOf( "1","2","Fizz" )  )
        Assert.assertArrayEquals( fizzBuzz( 5 ).toTypedArray() , arrayOf( "1","2","Fizz","4","Buzz" ) )
        Assert.assertArrayEquals( fizzBuzz( 15 ).toTypedArray() , arrayOf( "1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz" ) )
    }
}