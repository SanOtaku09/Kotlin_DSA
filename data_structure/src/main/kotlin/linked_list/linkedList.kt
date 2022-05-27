package linked_list
import linked_list.node
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
            it.next = node( data )
            tail = it.next
        } ?: run {
            head = node( data )
            tail = head
        }
        size++
    }

    fun addFirst( data : T ) {
        head = node( data , head )
        size++
    }

    fun remove( data : T ) : Boolean {
        if ( size == 0 ) return false
        else if ( head!!.data == data ) {
            head?.let {
                head = it.next
                it.next = null
                size--
                return true
            }
        }
        var iterator = head
        while ( iterator!!.next != null ) {
            if ( iterator.next!!.data == data ) {
                val toRemove = iterator.next
                iterator.next = iterator.next!!.next
                toRemove!!.next = null
                size--
                return true
            }
            iterator = iterator.next
        }
        return false
    } 

    fun removeAll( data : T ) {
        if ( size == 0 ) return
        while ( size > 0 && head!!.data == data ) {
            val temp = head
            head = head!!.next
            temp!!.next = null
            size--
        }
        if ( size == 0 ) return
        var iterator = head
        while ( iterator!!.next != null ) {
            if ( iterator.next!!.data == data ) {
                val toRemove = iterator.next
                iterator.next = iterator.next!!.next
                toRemove!!.next = null
                size--
            } else iterator = iterator.next
        }
    }

    fun show() {
        var temp = head
        while ( temp != null ) {
            println( temp.data )
            temp = temp.next 
        }
    }

    override fun toString() : String = getString()

    private tailrec fun getString( node : node<T>? = head , string : String = "" ) : String {
        node?.let {
            return getString( it.next , "$string-> ${it.data} " )
        } ?: run {
            return string
        }
    }

}