package CwiczeniaLista8i9

/**
  * Created by Mateusz on 17.12.2016.
  */
class Time2(private[this] var _hours: Int, private[this] var _minutes: Int) {

  this.hours = _hours
  this.minutes= _minutes

  def hours: Int = _hours

  def hours_=(x: Int) {
    if(x<0) throw new IllegalArgumentException("Niepoprawna liczba godzin!")
    _hours = x
  }

  def minutes: Int = _minutes

  def minutes_=(x: Int): Unit ={
    if(x<0) throw new IllegalArgumentException("Niepoprawna liczba minut!")
    _minutes= x
  }

  def before(other:Time2):Boolean = {
    (this.hours<other.hours) || (this.hours==other.hours && this.minutes < other.minutes )
  }

}
