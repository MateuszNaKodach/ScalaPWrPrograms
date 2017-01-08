package CwiczeniaLista8i9

/**
  * Created by Mateusz on 17.12.2016.
  */
class Time2B(h: Int, m: Int) {

  this.hours=h;
  //if(h<0||h>23) throw new IllegalArgumentException("Niepoprawna liczba godzin!")
  if(m<0||m>59) throw new IllegalArgumentException("Niepoprawna liczba minut!")

  private var _minutesAfterMidnight = h * 60 + m

  def hours: Int = _minutesAfterMidnight / 60

  def hours_=(newHours: Int) {
    //if(newHours<0||newHours>23) throw new IllegalArgumentException("Niepoprawna liczba godzin!")
    require(newHours<0||newHours>23,"Niepoprawna liczba godzin!")
    _minutesAfterMidnight = minutes + newHours * 60
  }

  def minutes: Int = _minutesAfterMidnight % 60

  def minutes_=(newMinutes: Int): Unit ={
    if(newMinutes<0||newMinutes>59) throw new IllegalArgumentException("Niepoprawna liczba minut!")
    _minutesAfterMidnight = hours + newMinutes
  }

  def before(other:Time2B):Boolean = {
    _minutesAfterMidnight < other._minutesAfterMidnight
  }

}
