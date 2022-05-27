package sort.quick_sort
object sort {
    fun < T : Comparable<T>> List<T>.quick_sort() : List<T> {
        if ( this.size < 2 ) return this
        val pivot = this[this.size/2]
        val smaller = this.filter { it < pivot }
        val equal = this.filter { it == pivot }
        val greater = this.filter { it > pivot }
        return smaller.quick_sort() + equal + greater.quick_sort()
    }
}