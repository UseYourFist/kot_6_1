import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class NoteServiceTest {

    @Before
    fun setUp() {
        NoteService.clear()
    }

    @Test
    fun addNewNote() {
        val note = Note (
            id = 0,
            title = "new",
            text = "note",
            privacy = null,
            commentPrivacy = null,
            privacyView = null,
            privacyComment = null,
        )
        assertEquals(NoteService.add(note), 0)
    }

    @Test
    fun deleteNote() {
        val note = Note (
            id = 0,
            title = "new",
            text = "note",
            privacy = null,
            commentPrivacy = null,
            privacyView = null,
            privacyComment = null,
        )
        NoteService.add(note)
        assertEquals(NoteService.delete(0), true)
    }

    @Test
    fun editNote() {
        val note = Note (
            id = 0,
            title = "new",
            text = "note",
            privacy = null,
            commentPrivacy = null,
            privacyView = null,
            privacyComment = null,
        )
        NoteService.add(note)
        assertEquals(NoteService.edit(note), true)
    }

    @Test
    fun readNote() {
        val note = Note (
            id = 0,
            title = "new",
            text = "note",
            privacy = null,
            commentPrivacy = null,
            privacyView = null,
            privacyComment = null,
        )
        NoteService.add(note)
        assertEquals(NoteService.read(0), note)
    }

    @Test
    fun getNote() {
        val note = Note (
            id = 0,
            title = "new",
            text = "note",
            privacy = null,
            commentPrivacy = null,
            privacyView = null,
            privacyComment = null,
        )
        NoteService.add(note)
        assertEquals(NoteService.get(0), note.toString())
    }

    @Test
    fun getByIdNote() {
        val note = Note (
            id = 0,
            title = "new",
            text = "note",
            privacy = null,
            commentPrivacy = null,
            privacyView = null,
            privacyComment = null,
        )
        NoteService.add(note)
        assertEquals(NoteService.getById(0), note)
    }
}