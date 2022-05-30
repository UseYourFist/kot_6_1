abstract class Attachment (
    open val type: String,
        )


data class PhotoAttachment (
    override val type: String = "photo", val photo: Photo): Attachment(type)

data class VideoAttachment (
    override val type: String = "video", val video: Video): Attachment(type)

data class AudioAttachment (
    override val type: String = "audio", val audio: Audio): Attachment(type)

data class DocAttachment (
    override val type: String = "doc", val doc: Doc): Attachment(type)

data class NoteAttachment (
    override val type: String = "note", val note: Note): Attachment(type)


data class Photo(
    val id: Int,
    val albumId: Int,
    val ownerId: Int,
    val userId: Int,
    val text: String,
    val date: Int,
    val sizes: Array<Any>,
    val width: Int,
    val height: Int
        )

data class Video(
    val id: Int,
    val ownerId: Int,
    val title: String,
    val description: String,
    val duration: Int,
    val image: Array<Any>,
    val firstFrame: Array<Any>,
    val date: Int,
    val addingDate: Int,
    val views: Int,
    val localViews: Int,
    val comments: Int,
    val player: String,
    val platform: String,
    val canAdd: Boolean,
    val isPrivate: Int,
    val accessKey: String,
    val processing: Int,
    val isFavorite: Boolean,
    val canComment: Boolean,
    val canEdit: Boolean,
    val canLike: Boolean,
    val canRepost: Boolean,
    val canSubscribe: Boolean,
    val canAttachLink: Boolean,
    val width: Int,
    val height: Int,
    val userId: Int,
    val converting: Boolean,
    val added: Boolean,
    val isSubscribed: Boolean,
    val repeat: Int,
    val type: String,
    val balance: Int,
    val liveStatus: String,
    val live: Int,
    val upcoming: Int,
    val spectators: Int,
    val likes: Like,
    val repost: Repost
        )

data class Audio(
    val id: Int,
    val ownerId: Int,
    val artist: String,
    val title: String,
    val duration: Int,
    val url: String,
    val lyricsId: Int,
    val albumId: Int,
    val genreId: Int,
    val date: Int,
    val noSearch: Int,
    val isHq: Int
        )

data class Doc(
    val id: Int,
    val ownerId: Int,
    val title: String,
    val size: Int,
    val ext: String,
    val url: String,
    val date: Int,
    val type: Int,
    val preview: Any
        )

data class Note(
    val id: Int,
    val ownerId: Int,
    val title: String,
    val text: String,
    val date: Int,
    val comments: Int,
    val readComments: Int,
    val viewUrl: String,
    val privacyView: String,
    val canComment: Int,
    val textWiki: String
        )