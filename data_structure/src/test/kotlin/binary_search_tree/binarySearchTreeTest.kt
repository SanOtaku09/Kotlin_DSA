package binary_search_tree
import org.junit.Test
import org.junit.Assert
class binarySearchTreeTest {
    var tree = binarySearchTree<String>()
    @Test
    fun insertAnsSearch() {
        tree.insert( "hello" )
        Assert.assertEquals( tree.search("hello")!!.data , "hello" )
    }

    @Test
    fun insertAll() {
        val array = arrayOf( "hello" , "world" , "kotlin" ,  "are you there" , "in" , "tree" )
        val treeToAdd = binarySearchTree<String>()
        for ( i in array ) {
            treeToAdd.insert( i )
        }
        tree.insertAll( treeToAdd.root )
        for ( i in array ) {
            val searchedData = tree.search( i )
            Assert.assertNotEquals( searchedData , null )
            Assert.assertEquals( searchedData!!.data , i )
        }
    }

    @Test
    fun remove() {
        tree.insert( "toRemove" )
        Assert.assertEquals( tree.search( "toRemove" )!!.data , "toRemove" )
        tree.remove( "toRemove" )
        Assert.assertEquals( tree.search( "toRemove" ) , null )
    }

    @Test
    fun orderedData() {
        val str = tree.orderedData().split( "\n" )
        Assert.assertTrue( str.isNotEmpty() )
        for ( i in 0 until str.size-1 ) {
            Assert.assertTrue( str[i] > str[i+1] )
        }
    }

}