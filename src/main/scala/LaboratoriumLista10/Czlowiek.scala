package LaboratoriumLista10

/**
  * Created by Mateusz on 19.12.2016.
  */
class Czlowiek {
  private[this] var _wiek: Int = _

  def wiek = _wiek

  def wiek_=(newAge: Int): Unit ={
    require(newAge>1&&newAge<150)
    _wiek=newAge
  }
}
