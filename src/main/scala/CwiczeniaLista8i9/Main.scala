package CwiczeniaLista8i9

/**
  * Created by Mateusz on 17.12.2016.
  */
object Main {
  def main(args: Array[String]):Unit = {

    //ZADANIE 1 - TEST
    val time = new Time(10)
    println(time.hour)
    time.hour = -4
    println(time.hour)

    val time2 = Time(5)
    val time3 = Time.apply(-19)
    println(time2.hour)
    println(time3.hour)


    //ZADANIE 2 - TEST
    val time4 = new Time2(11,22)
    println(time4.hours)
    //time4.hours=2
    println(time4.hours)
    //time4.hours=(-10)
    println(time4.hours)
    val time5 = new Time2(10,21)
    println(time4.before(time5))

    //Zadanie 2B - Test:

    val time2b = new Time2B(33,33)
    time2b.hours = 22
    println(time2b.hours)
    time2b.minutes = 22
    //ZADANIE 3 - TEST
    var pojazd1 = new Pojazd("Fiat", "Uno")
    pojazd1 = new Pojazd("Fiat", "Uno", 2012)
    pojazd1 = new Pojazd("Fiat", "Uno", 2012, "DW-589DW")
    pojazd1 = new Pojazd("Fiat", "Uno", "DW-223")
    //pojazd1 = new Pojazd("Fiat", "Uno", 2012, "DW-589DW")
    println(pojazd1);
    println(pojazd1.producent)
    pojazd1.rejestracja="DW-000AS"

  }
}
