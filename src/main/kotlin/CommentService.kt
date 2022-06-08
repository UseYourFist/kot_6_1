object CommentService: CrudService<Comment> {

    private var comments = mutableListOf<Comment>()
    private var nextId = 0

    override fun add(comment: Comment): Int {
        if (NoteServise.getToComment(comment.noteId)) {
            val noteWithId = comment.copy(id = nextId)
            comments.add(noteWithId)
            nextId += 1
            return comments.lastIndex
        }
        println("Note does not exist. Comment was not added")
        return 0
    }

    override fun delete(id: Int): Boolean {
        TODO("Not yet implemented")
    }

    override fun edit(comment: Comment): Boolean {
        TODO("Not yet implemented")
    }

    override fun read(id: Int) {
        TODO("Not yet implemented")
    }

}