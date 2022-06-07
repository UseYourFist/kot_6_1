object NoteServise: CrudService<Note> {
    private var notes = mutableListOf<Note>()

    override fun add(note: Note): Int {
        notes.add(note)
        return notes.lastIndex
    }

    override fun delete(id: Int): Boolean {
        notes.removeAt(id)
        return true
    }

    override fun edit(thing: Note): Boolean {
        for ((index, item) in notes.withIndex()) {
            if (item.noteId == thing.noteId)
        }
    }

    override fun read(id: Int) {
        TODO("Not yet implemented")
    }

}