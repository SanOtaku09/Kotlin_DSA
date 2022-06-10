package string.CrawlerLogFolder

object CrawlerLogFolder {
    fun minOperations(logs: Array<String>): Int {
        var depth = 0
        for ( directoryPath in logs ) {
            if ( depth > 0 && directoryPath == "../" ) depth--
            else if ( directoryPath != "./" && directoryPath != "../" ) depth++
        }
        return depth
    }
}