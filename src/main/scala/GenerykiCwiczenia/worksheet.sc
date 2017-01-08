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

def longerString[A,B >: A](a:A,b:B):B = {
  if(a.toString.length>=b.toString.length) a else b
}

longerString(12,2.0)

longerString(1234,2.0)

longerString(2.3,2.55)

