data class Comment (
    val id: Int,
    val noteId: Int?,
    val fromId: Int?,
    val date: Int?,
    val text: String,
    val donut: Any?,
    val replyToUser: Int?,
    val replyToComment: Int?,
    val attachment: Attachment?,
    val parentsStack: Array<Any>?,
    val thread: Any?,
    val deleted: Boolean
        ) {
}