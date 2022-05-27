package doubly_linked_list

import linked_list.linkedList
import org.junit.Assert
import org.junit.Test

class linkedListTest {
    var tree = linkedList<Int>()
    @Test
    fun add() {
        val previousSize = tree.size
        tree.add( 1 )
        Assert.assertEquals( previousSize+1 , tree.size )
    }

    @Test
    fun toStringTest() {
        tree.add( 2 ) ;
        Assert.assertNotEquals( tree.toString() , "" )
    }

    @Test
    fun removeTest() {
        tree.add( 99 )
        val previousSize = tree.size
        tree.remove(99)
        Assert.assertEquals( previousSize-1 , tree.size )
    }

    @Test
    fun removeAllTest() {
        for ( i in 1 .. 10 ) {
            tree.add( -1 )
            tree.add( 100 )
        }
        val prevousSize = tree.size
        tree.removeAll( 100 )
        Assert.assertEquals( prevousSize-10 , tree.size )
    }

    @Test
    fun addFirst() {
        tree.addFirst( -10 )
        tree.addFirst( 9 )
        Assert.assertEquals( tree.head!!.data , 9 )
    }
}