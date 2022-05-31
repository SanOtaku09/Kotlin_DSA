@file : JvmName( "main" )
import java.awt.Desktop
import java.net.URI
fun main() {
    Runtime.getRuntime().exec( "gradle test" ).waitFor()
    "${System.getProperty( "user.dir" )}/build/reports/tests/test/index.html".let { url ->
        val osName = System.getProperty("os.name").lowercase()
        if ( osName.contains( "mac" ) ) {
            Runtime.getRuntime().exec( "open $url" )
        } else if ( osName.contains( "nix" ) || osName.contains("nux") ) {
            Runtime.getRuntime().exec("xdg-open $url")
        } else {
            try {
                Desktop.getDesktop().browse( URI( url ) )
            } catch ( notRecognised : Exception ){
                println( " $osName : unknown os" )
            }
        }
    }
}
