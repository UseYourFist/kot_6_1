object WallService {

    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()
    private var nextId = 0

    fun add(post: Post): Post {
        val postWithId = post.copy(id = nextId)
        nextId += 1
        posts += postWithId
        return posts.last()
    }

    fun update(post: Post): Boolean {
        return if (posts.getOrNull(post.id) != null) {
            val postWithNewText = post.copy(text = "new")
            posts[post.id] = postWithNewText
            true
        } else {
            false
        }
    }

    fun createComment(postId: Int, comment: Comment): Comment {
        if (posts.getOrNull(postId) != null) {
            comments += comment
            return comments.last()
        } else {
            throw PostNotFoundException("no post with id $postId")
        }
    }

    fun clear() {
        posts = emptyArray<Post>()
        nextId = 0
    }
}