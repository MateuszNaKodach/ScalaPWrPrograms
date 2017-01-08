package CwiczeniaLista8i9

/**
  * Created by Mateusz on 17.12.2016.
  */
//ZADANIE 1

//_hour - konwencja nazwewnictwa w Scala

//class CwiczeniaLista8i9.Time(private[this] var _hour: Int) {
//if (_hour < 0) _hour = 0
//Dlaczego to nie sprawdza warunku? A bez this tak?

class Time(private[this] var _hour: Int) {

  //wywoalnie settera i sprawdzenie warunku
  this.hour = _hour

  //metoda bezargumentowa - wyliczana za kazdym razem
  def hour = _hour

  def hour_=(newHour: Int) {
    if (newHour < 0) _hour = 0
    else _hour = newHour
  }

}

object Time{
  def apply(hour: Int ) = new Time(hour)
}
