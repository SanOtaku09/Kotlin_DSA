package string.BinaryTreePaths

import org.junit.Assert
import org.junit.Test
import tree.common.bst.TreeNode
import string.BinaryTreePaths.BinaryTreePaths.binaryTreePaths

class BinaryTreePathsTest {
    @Test
    fun test() {
        val node = TreeNode( 1 , TreeNode( 2 , left = TreeNode( 5 ) ) , TreeNode( 3 ) )
        Assert.assertArrayEquals(
            arrayOf( "1->2->3" , "1->3" ) ,
            binaryTreePaths( node ).toTypedArray()
        )
    }
}