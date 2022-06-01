package string.RobotReturnToOrigin

object RobotReturnToOrigin {
    fun judgeCircle(moves: String): Boolean {
        var array = IntArray( 26 ){ 0 }
        for ( i in moves ) array[i-'A']++
        return if ( array['U'-'A'] == array['D'-'A'] && array['L'-'A'] == array['R' - 'A'] ) true else false
    }
}