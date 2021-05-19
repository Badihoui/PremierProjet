//import scala.collection.immutable._
import scala.collection.mutable._

object Tp {
  def maSequence() : Unit = {
    val sequence : Seq[String] = Seq("Kamagate", "Badihoui", "Mohamed", "Junior", "Drame", "Mariam", "Azimy")
    val maSeq1 : Seq[Int] =  sequence.map(x => x.length() )
    val maSeq2 :  Seq[String] =  sequence.filter(_.length() > 6 )
    //maSeq2.foreach(x => println(x))
    maSeq2.foreach(println(_))
  }

  def main(args: Array[String]): Unit = {
   // maSequence()

    /*

    val monMap :  Map[String, String] = Map(
      "cc" -> "cocody",
      "yy" -> "Poy",
      "abo" -> "abobo"
    )

    monMap.keys.foreach(x => print("\t " + x))
    //val ConvMap  = monMap.toList
    //println(ConvMap)

     */


  }

}
