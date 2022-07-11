package string.BinaryTreePaths
import tree.common.bst.TreeNode
object BinaryTreePaths {

    val array = ArrayList<String>()

    fun binaryTreePaths(root: TreeNode?): List<String> {
        if ( root != null ) getPath( root , StringBuilder() )
        return array
    }

    fun getPath( node : TreeNode? , str : StringBuilder )  {
        node?.run {
            str.append( "->${`val`}" )
            if ( right != null && left != null ){
                getPath( right , StringBuilder( str ) )
                getPath( left , str )
            } else if ( right != null ) getPath( right , str )
            else getPath( left , str )
        } ?: str.run {
            if ( ! isEmpty() ) array.add( substring(2) )
        }
    }

}