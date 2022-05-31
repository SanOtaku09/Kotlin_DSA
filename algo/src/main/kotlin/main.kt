@file : JvmName( "main" )
fun main() {
    Runtime.getRuntime().exec( "gradle test" ).waitFor()
    Runtime.getRuntime().exec( "xdg-open ${System.getProperty( "user.dir" )}/build/reports/tests/test/index.html")
}