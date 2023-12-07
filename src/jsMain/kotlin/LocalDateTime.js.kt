import kotlin.js.Date

actual class LocalDateTime(
    val date: Date = Date(),
) {
    actual fun getSecond(): Int = date.getSeconds()

    actual fun getMinute(): Int = date.getMinutes()

    actual fun getHour(): Int = date.getHours()

    actual fun plusSeconds(seconds: Long): LocalDateTime =
        LocalDateTime(Date(date.getTime() + seconds * 1000))
}

actual fun now(): LocalDateTime = LocalDateTime()

actual fun parseLocalDateTime(str: String): LocalDateTime =
    LocalDateTime(Date(Date.parse(str)))
