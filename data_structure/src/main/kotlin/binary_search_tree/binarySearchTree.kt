package binary_search_tree
import binary_search_tree.node
class binarySearchTree< T : Comparable<T> > {

    var root : node<T>? = null

    fun insert( data : T ) {
        root?.let{
            var node = root
            while ( true ) {
                if ( node!!.data > data ) {
                    if ( node.left == null ) {
                        node.left = node( data )
                        return
                    } else node = node.left
                } else if ( node.data < data ) {
                    if ( node.right == null ){
                        node.right = node( data )
                        return
                    } else node = node.right
                } else return
            }
        } ?: run {
            root = node( data )
        }
    }

    override fun toString() : String = root?.let{ it.toString() } ?: "null"

    fun orderedData( node : node<T>? = root , str : String = "" ) : String = when {
        node == null -> {
            str
        }
        else -> {
            orderedData( node.right , "$str${orderedData( node.left )}${node.data}\n" )
        }
    }

    fun insertAll( node : node<T>? ) {
        node?.let {
            insert( it.data )
            insertAll( it.left )
            insertAll( it.right )
        }
    }

    tailrec fun remove( data : T , node : node<T>? = root ) : Boolean {
        if ( node == null ) return false
        else if ( node == root && node.data == data ) {
            root = null
            insertAll( node.left )
            insertAll( node.right )
            return true
        } else if ( node.data < data && node.right != null ) {
            if ( node.right!!.data == data ) {
                val subtree = node.right
                node.right = null
                insertAll( subtree!!.left )
                insertAll( subtree.right )
                return true
            } else return remove( data , node.right )
        } else if ( node.data > data && node.left != null ) {
            if ( node.left!!.data == data ) {
                val subtree = node.left
                node.left = null
                insertAll( subtree!!.left )
                insertAll( subtree.right )
                return true
            } else return remove( data , node.left )
        }
        return false
    }

    fun search( data : T , node : node<T>? = root ) : node<T>? {
        node?.let {
            if ( node.data == data ) return node
            else if ( node.data < data ) return search( data , node.right )
            else return search( data , node.left )
        }
        return null
    }

}