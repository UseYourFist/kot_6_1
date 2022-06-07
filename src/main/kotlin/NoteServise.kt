object NoteServise: CrudService<Note> {

    private var notes = mutableListOf<Note>()
    private var nextId = 0

    override fun add(note: Note): Int {
        val noteWithId = note.copy(id = nextId)
        notes.add(noteWithId)
        nextId += 1
        return notes.lastIndex
    }

    override fun delete(id: Int): Boolean {
        notes.removeAt(id)
        return true
    }

    override fun edit(thing: Note): Boolean {
        for ((index, item) in notes.withIndex()) {
            if (item.id == thing.id)
        }
    }

    override fun read(id: Int) {
        TODO("Not yet implemented")
    }

}