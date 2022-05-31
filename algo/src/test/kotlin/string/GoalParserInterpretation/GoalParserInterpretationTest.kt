package string.GoalParserInterpretation
import org.junit.Assert
import org.junit.Test
import string.GoalParserInterpretation.GoalParserInterpretation.interpret
class GoalParserInterpretationTest {
    @Test
    fun test() {
        Assert.assertEquals( interpret( "G()(al)" ) , "Goal" )
        Assert.assertEquals( interpret( "G()()()()(al)" ) , "Gooooal" )
        Assert.assertEquals( interpret( "(al)G(al)()()G" ) , "alGalooG" )
    }
}