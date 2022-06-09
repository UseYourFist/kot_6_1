object NoteService: CrudService<Note> {

    private var notes = mutableListOf<Note>()
    private var nextId = 0

    override fun add(note: Note): Int {
        val noteWithId = note.copy(id = nextId)
        notes.add(noteWithId)
        nextId += 1
        return notes.lastIndex
    }

    override fun delete(id: Int): Boolean {
        CommentService.deleteCommentsToNote(id)
        notes.removeAt(id)
        return true
    }

    override fun edit(thing: Note): Boolean {
        for ((index, item) in notes.withIndex()) {
            if (item.id == thing.id) {
                notes[index] = thing
                return true
            }
        }
        return false
    }

    override fun read(id: Int): Note {
        return notes[id]
    }

    fun get(id: Int): String {
        return notes.joinToString(", ")
    }

    fun getById(id: Int): Note {
        return notes[id]
    }

    fun getToComment (id: Int): Boolean {
        if (notes.getOrNull(id) != null) {
            return true
        }
        return false
    }

    fun clear() {
        notes = mutableListOf<Note>()
        nextId = 0
    }

}