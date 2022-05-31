package string.GoalParserInterpretation

object GoalParserInterpretation {
    fun interpret(command: String): String {
        return command.replace( "()" , "o" ).replace( "(al)" , "al" )
    }
}