import org.junit.Test
import org.junit.Before

import org.junit.Assert.*


class WallServiceTest {

    @Before fun cleanService() {
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
            comments = null,
            copyright = "C",
            likes = Like(),
            reposts = null,
            views = 1,
            postType = "post",
            singerId = 333,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            postponedId = 0,
            attachment = null
        )
        val postInMassive = WallService.add(original)
        val result = 0
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
            comments = null,
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
            postponedId = 0,
            attachment = null
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
            comments = null,
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
            postponedId = 0,
            attachment = null
        )
        WallService.add(original)
        val result = false
        assertEquals(WallService.update(original), result)
    }

    @Test
    fun createCommentTrue() {

        val commentToPost = Comment(
            id = 0,
            fromId = 0,
            date = 555,
            text = "Hey",
            donut = null,
            replyToUser = 1,
            replyToComment = 1,
            attachment = null,
            parentsStack = null,
            thread = 1
        )
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
            comments = null,
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
            postponedId = 0,
            attachment = null
        )
        WallService.add(original)
        val commentInMassive = WallService.createComment(0, commentToPost)
        val result = 0
        assertEquals(commentInMassive.id, result)
    }

    @Test(expected = PostNotFoundException::class)
    fun createCommentFalse() {
        val commentToPost = Comment(
            id = 0,
            fromId = 0,
            date = 555,
            text = "Hey",
            donut = null,
            replyToUser = 1,
            replyToComment = 1,
            attachment = null,
            parentsStack = null,
            thread = 1
        )
        val commentInMassive = WallService.createComment(0, commentToPost)
    }
}