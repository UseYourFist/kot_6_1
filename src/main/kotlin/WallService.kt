object WallService {
    private var posts = emptyArray<Post>()
    private var nextId =0

    fun add(post: Post): Post {
        val postWithId = post.copy(id = nextId)
        nextId += 1
        posts += postWithId
        return posts.last()
    }

    fun update(post: Post): Boolean {
        return if (post.id < nextId) {
            val postWithNewText = post.copy(text = "new")
            posts[post.id] = postWithNewText
            true
        } else {
            false
        }
    }

    fun clear() {
        posts = emptyArray<Post>()
    }
}