package GenerykiCwiczenia

/**
  * Created by Mateusz on 07.01.2017.
  */


abstract class Person(val name: String)
class Man(name: String) extends Person(name){
  override def toString: String = "Mr. "+name;
}
class Woman(name: String) extends Person(name){
  override def toString: String = "Mrs. "+name;
}

class Greetings(greeting: String){
  def apply(person: Person) = println("Greeting " + person.name);
}

class Greetings2[T<:Person](greeting: String){
  def apply(person: T) = println("Greeting " + person.name);
}


object Main {

  def longerString[A,B >: A](a:A,b:B):B = {
      if(a.toString.length>=b.toString.length) a else b
  }

  def main(args: Array[String]):Unit = {
    println("Siema!")
    val hello = new Greetings("Hello!")
    hello(new Man("Mateusz"))

    var czesc = new Greetings2[Woman]("Czesc!")
    //czesc(new Man("Mateusz"))

    val man = new Man("Mateusz")
    val woman = new Woman("Ania")

    println(longerString(man,woman))

    println(longerString(12,2.0));

    var a = longerString(12,2.0)
    var b = longerString(1234,2.0)
    println(longerString(12,2.0));

  }
}
