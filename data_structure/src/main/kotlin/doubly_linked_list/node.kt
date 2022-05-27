package doubly_linked_list
data class node<T>( 
    var data : T ,
    var next : node<T>? = null ,
    var prev : node<T>? = null
)