class PostNotFoundException(message: String): RuntimeException(message)
class NoteNotFoundExcException(message: String): RuntimeException(message)
class CommentAlreadyDeletedException(message: String): RuntimeException(message)
class CommentNotDeletedException(message: String): RuntimeException(message)