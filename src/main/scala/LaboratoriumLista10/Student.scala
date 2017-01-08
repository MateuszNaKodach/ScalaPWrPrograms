package LaboratoriumLista10

/**
  * Created by Mateusz on 19.12.2016.
  */
class Student(var _ocenyStudenta:List[Double],
              var _ocenaKoncowa:Double) {

  def this(koncowa: Double)={
    this(Nil,koncowa)
  }

  def this(oceny: List[Double])={
    this(oceny,0)
    _ocenaKoncowa = obliczOceneKoncowa()
  }

   private def obliczOceneKoncowa()={
    def helper(koncowa : Double, lista: List[Double]): Double ={
      lista match{
        case h::t => helper(Math.max(koncowa, h),t)
        case Nil => koncowa
      }
    }
    helper(0,_ocenyStudenta)
  }

}

object Student{
  def apply(koncowa: Double) = new Student(Nil,koncowa)
  def apply(oceny: List[Double]) = new Student(oceny)
  def apply(oceny: List[Double],koncowa: Double) = new Student(oceny,koncowa)
}
