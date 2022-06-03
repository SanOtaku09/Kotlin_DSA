package tree.RangeSumOfBST

import org.junit.Assert
import org.junit.Test
import tree.common.bst.TreeNode
import tree.RangeSumOfBST.RangeSumOfBST.rangeSumBST

class RangeSumOfBSTTest {
    @Test
    fun test() {
        Assert.assertEquals(
            rangeSumBST(
                TreeNode( 10 , TreeNode( 5 , TreeNode( 3 ) , TreeNode( 7 ) )
                    , TreeNode( 15 , right = TreeNode( 18 ) ) )
            , 7 , 15 ) ,
            32
        )
    }
}