interface CrudService<T> {
    fun add (thing: T): Int
    fun delete (id: Int): Boolean
    fun edit (thing: T): Boolean
    fun read (id: Int): T
}