object CommentService: CrudService<Comment> {

    private var comments = mutableListOf<Comment>()
    private var nextId = 0

    override fun add(comment: Comment): Int {
        if (NoteService.getToComment(comment.noteId!!)) {
            val commentWithId = comment.copy(id = nextId)
            comments.add(commentWithId)
            nextId += 1
            return comments.lastIndex
        }
        throw NoteNotFoundExcException("Note was deleted or not found ")
    }

    override fun delete(id: Int): Boolean {
        if (!comments[id].deleted) {
            var commentDeleted = comments[id].copy(deleted = true)
            comments[id] = commentDeleted
            return true
        }
        throw CommentAlreadyDeletedException("Comment Already Deleted")
    }

    override fun edit(thing: Comment): Boolean {
        for ((index, item) in comments.withIndex()) {
            if (item.id == thing.id) {
                comments[index] = thing
                return true
            }
        }
        return false
    }

    override fun read(id: Int): Comment {
        return comments[id]
    }

    fun getComments(idNote: Int): String {
        var commentToNote = mutableListOf<Comment>()
        for ((index, item) in comments.withIndex()) {
            if (item.noteId == idNote) {
                commentToNote.add(comments[index])
            }
        }
        return commentToNote.joinToString(", ")
    }

    fun restoreComment(id: Int): Boolean {
        if (comments[id].deleted) {
            var commentDeleted = comments[id].copy(deleted = false)
            comments[id] = commentDeleted
            return true
        }
        throw CommentNotDeletedException("Comment Not Deleted")
    }

    fun deleteCommentsToNote(idDelNote: Int) {
        for ((index, item) in comments.withIndex()) {
            if (item.noteId == idDelNote) {
                comments.removeAt(index)
            }
        }
    }

    fun clear() {
        comments = mutableListOf<Comment>()
        nextId = 0
    }

}