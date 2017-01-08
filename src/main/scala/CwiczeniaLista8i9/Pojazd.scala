package CwiczeniaLista8i9

/**
  * Created by Mateusz on 17.12.2016.
  */
class Pojazd(val producent: String, val model: String, val rokProdukcji: Int = -1, var rejestracja: String = "") {

  def this(p: String, m: String, rej: String)={
    this(p,m,-1,rej)
  }

  override def toString: String = {
    "Producent: " +producent+" Model: "+model+ " Rok Produkcji: " + rokProdukcji+ " Rejestracja: " + rejestracja;
  }
}
