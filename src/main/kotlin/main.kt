fun main() {

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

    val lastPost = WallService.add(original)
    println(lastPost.id)
    println(WallService.update(lastPost))
    println(lastPost.id)
    println(WallService.createComment(0, commentToPost))
}