val stringList = listOf(1,2,3)
printArray(stringList.toTypedArray())
val stringList = listOf("zero","one","two")
printArray(stringList.toTypedArray())
fun printArray(array: Array<*>) {
    val copy = array.toCollection(mutableListOf())
    copy.forEach { Log.i("MyTag", "it:" + it) }
}