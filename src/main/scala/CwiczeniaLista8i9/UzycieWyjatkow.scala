package CwiczeniaLista8i9

/**
  * Created by Mateusz on 18.12.2016.
  */
object UzycieWyjatkow {
  def main(args: Array[String]) {
    try {
      metoda1() //scala: 7
    } catch {
      case e: Exception =>
        System.err.println(e.getMessage + "\n")
        e.printStackTrace()
    }
  }

  def metoda1() {
    metoda2() //scala:16
  }

  def metoda2() {
    metoda3() //scala:20
  }

  def metoda3() {
    throw new Exception("Wyjatek zgloszony w metoda3") //Scala 24
  }
}
