interface CrudService<T> {
    fun add (thing: T): Int
    fun delete (id: Int)
    fun edit (thing: T)
    fun read (id: Int)
}