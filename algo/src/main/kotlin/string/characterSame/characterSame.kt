package string.characterSame

object characterSame {
    //method one using loop
    fun String.isAllCharacterSame() : Boolean {
        for ( i in 0 until  this.length-1 )
            if ( this[i] != this[i+1] ) return false
        return true
    }

    //method two
    fun String.isAllCharacterSame2() : Boolean =
        this.replace( this[0].toString() , "" ).trim().equals( "" )

}