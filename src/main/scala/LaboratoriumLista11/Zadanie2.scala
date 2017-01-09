package LaboratoriumLista11

/**
  * Created by Mateusz on 09.01.2017.
  */

class Roslina(var _gatunek: String){
  override def toString: String = {
    _gatunek
  }
}
class Drzewo(gatunek: String) extends Roslina(gatunek)
class Kwiatek(gatunek: String) extends Roslina(gatunek)

class DrukujGatunek[-T]{
  def drukuj(x: T):Unit = println(x)
}


object Zadanie2 {
  def main(args: Array[String]): Unit = {
    var roslina = new Roslina("Paprotka");
    var drzewo = new Drzewo("Dąb");
    var kwiatek = new Kwiatek("Róża");

    var drukujKwiatek = new DrukujGatunek[Roslina];
    drukujKwiatek.drukuj(kwiatek)
    drukujKwiatek.drukuj(drzewo)
    drukujKwiatek.drukuj(roslina)
  }
}
