package mar.frias.classwork_examscreen

import java.util.Date

data class NotificationItem(
    val id: Int,
    val title: String,
    val content: String,
    val icon: Int,
    val date: Date
)

private const val MINUTE = 60_000L
private const val HOUR = 60 * MINUTE
private const val DAY = 24 * HOUR
private fun ago(millis: Long) = Date(System.currentTimeMillis() - millis)

val notificationItems = listOf(
    NotificationItem(
        5,
        "Nueva convocatoria",
        "Conoce los requisitos y las fechas de solicitud. Conoce los requisitos y las fechas de solicitud. Conoce los requisitos y las fechas de solicitud. Conoce los requisitos y las fechas de solicitud. Conoce los requisitos y las fechas de solicitud. Conoce los requisitos y las fechas de solicitud.\"Conoce los requisitos y las fechas de solicitud. Conoce los requisitos y las fechas de solicitud.\"Conoce los requisitos y las fechas de solicitud. Conoce los requisitos y las fechas de solicitud.\"Conoce los requisitos y las fechas de solicitud. Conoce los requisitos y las fechas de solicitud.\"Conoce los requisitos y las fechas de solicitud. Conoce los requisitos y las fechas de solicitud.",
        4,
        ago(20 * DAY)
    ),
    NotificationItem(
        0,
        "Renovacion de becas",
        "Nueva informacion sobre renovacion de becas. Consulta los detalles en la aplicacion",
        0,
        ago(5 * MINUTE)
    ),
    NotificationItem(
        1,
        "Renovacion de becas",
        "Nueva informacion sobre renovacion de becas. Consulta los detalles en la aplicacion",
        0,
        ago(3 * HOUR)
    ),
    NotificationItem(
        2,
        "Recordatorio importante",
        "Revisa los documentos necesarios para tu proximo tramite.",
        2,
        ago(1 * DAY)
    ),
    NotificationItem(
        3,
        "Resultados disponibles",
        "Ya puedes consultar los resultados de la convocatoria 2026.",
        1,
        ago(4 * DAY)
    ),
    NotificationItem(
        4,
        "Nueva convocatoria",
        "Conoce los requisitos y las fechas de solicitud.",
        4,
        ago(20 * DAY)
    )
)
