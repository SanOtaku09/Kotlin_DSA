package string.MinimumNumberOfOperationsToConvertTime

object MinimumNumberOfOperationsToConvertTime {

    fun convertTime(current: String, correct: String): Int {
        var steps = 0
        var mins = 0
        val current_min = current.substring( 0 , 2 ).toInt()*60 + current.substring( 3 ).toInt()
        val correct_min = correct.substring( 0 ,2 ).toInt()*60 + correct.substring( 3 ).toInt()
        mins = if ( current_min < correct_min ) correct_min - current_min else current_min - correct_min
        steps += mins / 60
        mins %= 60
        steps += mins / 15
        mins %= 15
        steps += mins / 5
        mins %= 5
        steps += mins
        return steps
    }

}