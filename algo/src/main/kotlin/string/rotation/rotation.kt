package string.rotation

object rotation {
    fun String.rotate( n : Int ) : String =
        if ( this.length == n ) this
        else this.substring( if ( n > this.length ) n%this.length else n ) + this.substring( 0 , if ( n > this.length ) n%this.length else n )
}