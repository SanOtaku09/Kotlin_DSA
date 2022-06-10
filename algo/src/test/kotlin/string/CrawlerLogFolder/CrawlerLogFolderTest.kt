package string.CrawlerLogFolder

import org.junit.Assert
import org.junit.Test
import string.CrawlerLogFolder.CrawlerLogFolder.minOperations

class CrawlerLogFolderTest {
    @Test
    fun test() {
        Assert.assertEquals( minOperations( arrayOf( "./","../","./" ) ) , 0 )
        Assert.assertEquals( minOperations( arrayOf( "d1/","d2/","./","d3/","../","d31/" ) ) , 3 )
        Assert.assertEquals( minOperations( arrayOf( "d1/","../","../","../" ) ) , 0 )
    }
}