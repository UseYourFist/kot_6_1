data class Note (
    val id: Int,
    val title: String,
    val text: String,
    val privacy: Int,
    val commentPrivacy: Int,
    val privacyView: String?,
    val privacyComment: String?
) {
}