import scala.collection.immutable._
import scala.Console
import scala.collection.mutable.HashMap
import java.text._ // Importation de la classe immutable Personne
import java.util.Calendar
import java.util.Date
import java.lang.Thread
import java.lang.Runnable

object HelloWorld {
  /*
  val french = new Thread {
    override def run { for (_ <- 1 to 10) println("bonjour") }
  }
  val anglais = new Thread {
    override def run { for (_ <- 1 to 10) println("hello") }
  }

   */

  val variable2 : String = ""

  def main(args: Array[String]): Unit = {

    val text : String = "Hello World, mon premier programme en scala"

    val text2 : String = text + variable2

    val test = println(text2)
    test

    val Kam =   Personne(Some("KAMAGATE"), "Badihoui", 25, "Côte d'ivoire", 20.250)
    val etudiant =   Personne(null, "Badihoui", 25, "Côte d'ivoire", 20.250)
    val age_personne = Kam.age

    println("L'age de la personne est de :" + age_personne)
    /* println("Hello, world !\n" + " Je suis Kamagate Mohamed\n" + "Etudiant en Data Science. \n")
    val tab = new Array[String] ("a", "b", "c")
    for (i <- 0 to 3) {
      print(tab(i))
    }
  }
  */

   /* Console.print('a' + "\n") // affiche a
    Console.print(3 + 5)
    Console.println()
    */

    /*
    val s = Console.readLine;
    println("Vous avez ecrit: " + s);

     */

    /*
    val tabHachage = new HashMap[Int, String]
    tabHachage += 1 -> "Salut"
    tabHachage += 2 -> "Bonjour"
    tabHachage += 3 -> "Bonsoir"
    println(tabHachage(2))

     */

    /*println("Entrer votre choix : ")
    var choix = Console.readLine
    choix match {
        case 0 => "Je suis perdu au fond de moi-même"
        case 1 => "Mais je sais que c'est une épreuve d'Allah"
        case_ => "Accroche toi,c'est la phase ultime"

    }

     */

   /* def shadow() {
      val a = 1;
      {
        val a = 2;
        println("a à l'interieur du bloc :" + a); // affichera
      }
      println("a déclaré avant le bloc ci-dessus: "+a); // affichera 1
    }

    */

    /*(1 to 100) filter (_%2 ==0) foreach(println)
    List(1, 2, 3).map(_*2).foreach(println)

     */

 /* def affichePersonne(nom : String, prenoms : String, date : String , nationalite : Option[String], salaire : Double): Personne = {
    var formater = new SimpleDateFormat("dd-MM-yyyy")
    var dataNaissance : Date = formater.parse(date)
    var c : Calendar = Calendar.getInstance()

    val year1 = c.getWeekYear
    c.setTime(dataNaissance)
    val year2 = c.getWeekYear
    val age  = year1 - year2
    return Personne(nom, prenoms, age, nationalite, salaire)

    }
  */


    // french.start ; anglais.start

  maCollection();
  }
  // Les listes
  def maCollection() : Unit = {
    val maliste = List("Jvc", "jjj", "ecole", "pays")
    val maliste2 : List[String] = List("Julien" , "jvc")

    maliste.foreach(l => println(l.toUpperCase))

    val maliste3 : List[Int] = List(10, 20, 30, 70)

  }


}
