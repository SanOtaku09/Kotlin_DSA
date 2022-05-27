package sort

import org.junit.Test
import org.junit.Assert
import kotlin.random.Random
import java.util.Arrays
import sort.brick_sort.sort.brick_sort
import sort.bubble_sort.sort.bubble_sort
import sort.insertion_sort.sort.insertion_sort
import sort.merge_sort.sort.merge_sort
import sort.quick_sort.sort.quick_sort
import sort.selection_sort.sort.selection_sort

class sortTest {

    val array = Array<Int>( 100 ){ Random.nextInt() }
    val ans = array.clone()

    init {
        Arrays.sort( ans )
    }

    @Test
    fun brick_sort_test() {
        val clone = array.clone()
        clone.brick_sort()
        Assert.assertArrayEquals( clone , ans )
    }

    @Test
    fun insertion_sort_test() {
        val clone = array.clone()
        clone.insertion_sort()
        Assert.assertArrayEquals( clone , ans )
    }

    @Test
    fun selection_sort_test() {
        val clone = array.clone()
        clone.selection_sort()
        Assert.assertArrayEquals( clone , ans )
    }

    @Test
    fun bubble_sort_test() {
        val clone = array.clone()
        clone.bubble_sort()
        Assert.assertArrayEquals( clone , ans )
    }

    @Test
    fun merge_sort_test() {
        val clone = array.clone()
        clone.merge_sort()
        Assert.assertArrayEquals( clone , ans )
    }

    @Test
    fun quick_sort_test() {
        val clone = List(array.size){array[it]}.quick_sort()
        Assert.assertArrayEquals( Array<Int>( clone.size ){ clone[it] } , ans )
    }

}