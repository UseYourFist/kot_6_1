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

    val lastPost = WallService.add(original)
    println(lastPost)
    println(WallService.update(lastPost))
}