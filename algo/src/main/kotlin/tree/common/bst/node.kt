package tree.common.bst
data class node<T>(
    var `val` : T ,
    var left : node<T>? = null ,
    var right : node<T>? = null
)