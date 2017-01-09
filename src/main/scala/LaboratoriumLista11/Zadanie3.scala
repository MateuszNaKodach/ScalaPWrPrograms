package LaboratoriumLista11

/**
  * Created by Mateusz on 09.01.2017.
  */
object Zadanie3 {
  def main(args: Array[String]): Unit = {
    var mutableMap = new MutableMap[Int,String]
    mutableMap.put(5,"Mateusz")
    mutableMap.put(7,"Nowak")
    println(mutableMap.get(5))
    println(mutableMap.get(7))
    mutableMap.put(5,"Paradygmaty")
    println(mutableMap.get(5))
  }
}
