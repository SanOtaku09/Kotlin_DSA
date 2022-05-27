package doubly_linked_list
import doubly_linked_list.node
class linkedList<T> {

    var head : node<T>? = null
    var tail : node<T>? = null
    var size : Int = 0

    constructor()
    constructor( data : T ) {
        head = node( data )
        tail = head
        size++
    }

    fun add( data : T ) {
        tail?.let {
            it.next = node( data , prev = it )
            tail = it.next
        } ?: run {
            head = node( data )
            tail = head
        }
        size++
    }

    fun addFirst( data : T ) {
        head?.let {
            val newNode = node( data , next = it )
            it.prev = newNode
            head = newNode
            size++
        } ?: add( data )
    }

    fun remove( data : T ) : Boolean {
        if ( size == 0 ) return false
        else if ( head!!.data == data ) {
            head?.let{ toRemove ->
                head = toRemove.next
                toRemove.next = null
                head!!.prev = null
                size--
                return true
            }
        } else if ( tail!!.data == data ) {
            tail?.let { toRemove ->
                tail = toRemove.prev
                toRemove.prev = null
                tail!!.next = null
                size--
                return true
            }
        }
        var iterator = head
        while ( iterator != null ) {
            if ( iterator.data == data ) {
                iterator.let{ toRemove ->
                    toRemove.prev!!.next = toRemove.next
                    toRemove.next!!.prev = toRemove.prev
                    toRemove.next = null
                    toRemove.prev = null
                    size--
                    return true
                }
            }
            iterator = iterator.next
        }
        return false
    }

    fun removeAll( data : T ) {
        if ( size == 0 ) return
        while ( size != 0 && head!!.data == data ) {
            head?.let{ toRemove ->
                head = toRemove.next
                toRemove.let{
                    it.prev = null
                    it.next = null
                }
                size--
            }
        }
        while ( size != 0 && tail!!.data == data ) {
            tail?.let { toRemove ->
                tail = toRemove.prev
                toRemove.prev = null
                tail!!.next = null
                size--
            }
        }
        if ( size == 0 ) return
        var iterator = head
        while ( iterator != null ) {
            if ( iterator.data == data ) {
                iterator.let{ toRemove ->
                    toRemove.prev!!.next = toRemove.next
                    toRemove.next!!.prev = toRemove.prev
                    toRemove.next = null
                    toRemove.prev = null
                    size--
                    return
                }
            } else iterator = iterator.next
        }
    }

    fun show(){
        var iterator = head
        while ( iterator != null ) {
            println( iterator.data )
            iterator = iterator.next
        }
    }

    override fun toString() : String = getString()

    private fun getString( node : node<T>? = head , string : String = "null " ) : String {
        node?.let{
            return getString( it.next , "$string<-> ${it.data} " )
        } ?: return string
    }

}