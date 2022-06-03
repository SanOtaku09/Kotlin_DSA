package tree.RangeSumOfBST
import tree.common.bst.TreeNode
object RangeSumOfBST {
    var sum = 0
    fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
        getSum( root , low , high )
        return sum
    }
    private fun getSum( node: TreeNode? , low: Int , high: Int ) {
        node?.let {

            if ( it.`val` in low .. high ) sum += it.`val`

            getSum( node.left ,low, high)
            getSum( node.right , low , high )
        }
    }
}