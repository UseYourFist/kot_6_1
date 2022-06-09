import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class CommentServiceTest {

    @Before
    fun setUp() {
        CommentService.clear()
        NoteService.clear()
    }

    @Test
    fun addCommentTrue() {
        val comment = Comment(
            id = 0,
            fromId = 0,
            noteId = 0,
            date = 555,
            text = "Hey",
            donut = null,
            replyToUser = 1,
            replyToComment = 1,
            attachment = null,
            parentsStack = null,
            thread = 1,
            deleted = false
        )
        val note = Note(
            id = 0,
            title = "new",
            text = "note",
            privacy = null,
            commentPrivacy = null,
            privacyView = null,
            privacyComment = null,
        )
        NoteService.add(note)
        assertEquals(CommentService.add(comment), 0)
    }

    @Test(expected = NoteNotFoundExcException::class)
    fun addCommentFalse() {
        val comment = Comment(
            id = 0,
            fromId = 0,
            noteId = 0,
            date = 555,
            text = "Hey",
            donut = null,
            replyToUser = 1,
            replyToComment = 1,
            attachment = null,
            parentsStack = null,
            thread = 1,
            deleted = false
        )
        CommentService.add(comment)
    }

    @Test
    fun deleteCommentTrue() {
        val comment = Comment(
            id = 0,
            fromId = 0,
            noteId = 0,
            date = 555,
            text = "Hey",
            donut = null,
            replyToUser = 1,
            replyToComment = 1,
            attachment = null,
            parentsStack = null,
            thread = 1,
            deleted = false
        )
        CommentService.add(comment)
        assertEquals(CommentService.delete(0), true)

    }

    @Test(expected = CommentAlreadyDeletedException::class)
    fun deleteCommentFalse() {
        val comment = Comment(
            id = 0,
            fromId = 0,
            noteId = 0,
            date = 555,
            text = "Hey",
            donut = null,
            replyToUser = 1,
            replyToComment = 1,
            attachment = null,
            parentsStack = null,
            thread = 1,
            deleted = true
        )
        CommentService.add(comment)
        CommentService.delete(0)
    }

    @Test
    fun editComment() {
        val comment = Comment(
            id = 0,
            fromId = 0,
            noteId = 0,
            date = 555,
            text = "Hey",
            donut = null,
            replyToUser = 1,
            replyToComment = 1,
            attachment = null,
            parentsStack = null,
            thread = 1,
            deleted = false
        )
        assertEquals(CommentService.edit(comment), true)
    }

    @Test
    fun readComment() {
        val comment = Comment(
            id = 0,
            fromId = 0,
            noteId = 0,
            date = 555,
            text = "Hey",
            donut = null,
            replyToUser = 1,
            replyToComment = 1,
            attachment = null,
            parentsStack = null,
            thread = 1,
            deleted = false
        )
        assertEquals(CommentService.read(0), comment.toString())
    }

    @Test
    fun getCommentsTest() {
        val comment = Comment(
            id = 0,
            fromId = 0,
            noteId = 0,
            date = 555,
            text = "Hey",
            donut = null,
            replyToUser = 1,
            replyToComment = 1,
            attachment = null,
            parentsStack = null,
            thread = 1,
            deleted = false
        )
        val note = Note(
            id = 0,
            title = "new",
            text = "note",
            privacy = null,
            commentPrivacy = null,
            privacyView = null,
            privacyComment = null,
        )
        NoteService.add(note)
        CommentService.add(comment)
        assertEquals(CommentService.getComments(0), comment.toString())
    }

    @Test
    fun restoreCommentTrue() {
        val comment = Comment(
            id = 0,
            fromId = 0,
            noteId = 0,
            date = 555,
            text = "Hey",
            donut = null,
            replyToUser = 1,
            replyToComment = 1,
            attachment = null,
            parentsStack = null,
            thread = 1,
            deleted = true
        )
        CommentService.add(comment)
        assertEquals(CommentService.restoreComment(0), true)
    }

    @Test(expected = CommentNotDeletedException::class)
    fun restoreCommentFalse() {
        val comment = Comment(
            id = 0,
            fromId = 0,
            noteId = 0,
            date = 555,
            text = "Hey",
            donut = null,
            replyToUser = 1,
            replyToComment = 1,
            attachment = null,
            parentsStack = null,
            thread = 1,
            deleted = false
        )
        CommentService.add(comment)
        CommentService.restoreComment(0)
    }
}