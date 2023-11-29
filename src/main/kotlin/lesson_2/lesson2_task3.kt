package lesson_2

fun main() {
    val trainDepartureHour = 9
    val trainDepartureMinute = 39
    val journeyTimeInMinutes = 457

    val arrivalHour  = (trainDepartureHour + (journeyTimeInMinutes / 60)) % 24
    val arrivalMinute = (trainDepartureMinute + (journeyTimeInMinutes % 60)) % 60

    println("Время прибытия поезда в $arrivalHour:$arrivalMinute")

}