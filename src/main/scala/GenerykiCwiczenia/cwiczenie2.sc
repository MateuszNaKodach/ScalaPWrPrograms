class Paper {
  override def toString = "paper"
}
class ColorPaper(color: String) extends Paper {
  override def toString = color + " paper"
}

class Box[T](name: String, e: T) {
  def take: T = {
    println("Taking "+e+" from the "+this)
    e
  }
  override def toString = name
}

class WasteBin[T](name: String) {
  def throwAway(t: T) =
    println("Throwing away "+t+" into the "+this)
  override def toString = name
}

class DrawingChild(name: String,
                   box: Box[Paper],
                   wasteBin: WasteBin[Paper]){
  def draw = {
    val paper = box.take
    println("Drawing on "+paper)
    wasteBin.throwAway(paper)
  }
  override def toString = name
}

val paperBox = new Box[Paper]("paper box", new Paper);

val paperWasteBin = new WasteBin[Paper]("paper waste bin");

val child = new DrawingChild("Mateusz",paperBox,paperWasteBin)

child.draw

val yellowPaperBox = new Box[ColorPaper]("yellow box", new ColorPaper("Yellow"))

val child2 = new DrawingChild("Ania",yellowPaperBox,paperWasteBin);