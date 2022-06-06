object NoteServise: CrudService<Note> {
    private var notes = mutableListOf<Note>()

    override fun add(note: Note): Int {
        notes.add(note)
        return notes.lastIndex
    }

    override fun delete(id: Int) {
        TODO("Not yet implemented")
    }

    override fun edit(thing: Note) {
        TODO("Not yet implemented")
    }

    override fun read(id: Int) {
        TODO("Not yet implemented")
    }

}