abstract class Attachment (
    val type: String,
    val attached: Any
        )


class PhotoAttachment (
    type: String = "photo", photo: Photo): Attachment(type, photo)

class VideoAttachment (
    type: String = "video", video: Video): Attachment(type, video)

class AudioAttachment (
    type: String = "audio", audio: Audio): Attachment(type, audio)

class DocAttachment (
    type: String = "doc", doc: Doc): Attachment(type, doc)

class NoteAttachment (
    type: String = "note", note: Note): Attachment(type, note)


class Photo(
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

class Video(
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

class Audio(
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

class Doc(
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

class Note(
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