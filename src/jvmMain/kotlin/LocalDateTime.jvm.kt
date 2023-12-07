import java.time.LocalDateTime as JavaLocalDateTime

actual typealias LocalDateTime = java.time.LocalDateTime

actual fun now(): LocalDateTime = JavaLocalDateTime.now()

actual fun parseLocalDateTime(str: String): LocalDateTime =
    JavaLocalDateTime.parse(str)
