import org.junit.Test
import org.junit.Before

import org.junit.Assert.*


class WallServiceTest {

    @Before
    fun cleanService() {
        WallService.clear()
    }

    @Test
    fun addNewPost() {
        val original = Post(
            id = 0,
            ownerId = 321,
            fromId = 123,
            createdBy = 12,
            date = 555,
            text = "hello",
            replyOwnerId = 777,
            replyPostId = 888,
            friendsOnly = false,
            comments = Comment(),
            copyright = "C",
            likes = Like(),
            reposts = Repost(),
            views = 1,
            postType = "post",
            singerId = 333,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            postponedId = 0
        )
        val postInMassive = WallService.add(original)
        val result = 1
        assertEquals(postInMassive.id, result)
    }

    @Test
    fun updateTrue() {
        val original = Post(
            id = 0,
            ownerId = 321,
            fromId = 123,
            createdBy = 12,
            date = 555,
            text = "hello",
            replyOwnerId = 777,
            replyPostId = 888,
            friendsOnly = false,
            comments = Comment(),
            copyright = "C",
            likes = Like(),
            reposts = Repost(),
            views = 1,
            postType = "post",
            singerId = 333,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            postponedId = 0
        )
        WallService.add(original)
        val result = true
        assertEquals(WallService.update(original), result)
    }

    @Test
    fun updateFalse() {
        val original = Post(
            id = 1,
            ownerId = 321,
            fromId = 123,
            createdBy = 12,
            date = 555,
            text = "hello",
            replyOwnerId = 777,
            replyPostId = 888,
            friendsOnly = false,
            comments = Comment(),
            copyright = "C",
            likes = Like(),
            reposts = Repost(),
            views = 1,
            postType = "post",
            singerId = 333,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            postponedId = 0
        )
        WallService.add(original)
        val result = false
        assertEquals(WallService.update(original), result)
    }
}