package LaboratoriumLista11

/**
  * Created by Mateusz on 09.01.2017.
  */
class MutableMap[K,V] {
  class Entry(var _key: K, var _value: V){
    override def toString: String = _key.toString +" "+ _value.toString
  }

  var entriesList:List[Entry]=Nil

  def put(key: K, value: V): Unit ={
    var newEntry = new Entry(key,value)
    if(entriesList.find(_._key == newEntry._key)==null)
      entriesList = entriesList:+newEntry
    else {
      entriesList = entriesList.filterNot(_._key == newEntry._key)
      entriesList = entriesList:+newEntry
    }
  }

  def get(key: K):V = {
    entriesList.find(_._key==key).get._value
  }

}

