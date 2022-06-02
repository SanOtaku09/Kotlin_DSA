package string.DetermineColorofAChessboardSquare

object DetermineColorofAChessboardSquare {
    fun squareIsWhite(coordinates: String): Boolean {
        if ( ((coordinates[0] - 'a') %2 == 0 && coordinates[1].toString().toInt()%2 == 1) || ((coordinates[0] - 'a') %2 == 1 && coordinates[1].toString().toInt()%2 == 0)  ) return false
        return true
    }
}