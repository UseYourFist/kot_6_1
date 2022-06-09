object CommentService: CrudService<Comment> {

    private var comments = mutableListOf<Comment>()
    private var nextId = 0

    override fun add(comment: Comment): Int {
        if (NoteServise.getToComment(comment.noteId!!)) {
            val commentWithId = comment.copy(id = nextId)
            comments.add(commentWithId)
            nextId += 1
            return comments.lastIndex
        }
        println("Note does not exist. Comment was not added")
        return 0
    }

    override fun delete(idDeleted: Int): Boolean {
        var commentDeleted = comments[idDeleted].copy(deleted = true)
        comments[idDeleted] = commentDeleted
        return true
    }

    override fun edit(comment: Comment): Boolean {
        TODO("Not yet implemented")
    }

    override fun read(id: Int) {
        TODO("Not yet implemented")
    }

}