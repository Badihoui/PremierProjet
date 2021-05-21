import org.apache.spark.sql._
import org.apache.spark._

object SparkApp {


  def main(args: Array[String]): Unit = {
    sessionSpark()
  }
  
  def sessionSpark() : Unit = {

    System.setProperty("hadoop.home.dir", "C:\\Hadoop")

    // variable de type sparksession

    val ss = SparkSession.builder()
      .master("local[*]")
      .appName("Ma premiere application")
      //.enableHiveSupport()
      .getOrCreate()
    
    // Creation d'un RDD avec la fonction SparkContext
    
    val rdd1 = ss.sparkContext.parallelize(Seq("Ma première application Spark. Je suis un etudiant de l'INP heureux"))
    
    rdd1.foreach(l => println(l))

    val df_1 = ss.read
      .format("csv")
      .option("inferSchema", "true")
      .option("header", "true")
      .option("delimiter", ";")
      .csv("C:\\Spark\\spark-2.2.0-bin-hadoop2.7\\orders_csv.csv")
    df_1.show(10)

    df_1.printSchema

    df_1.createOrReplaceTempView("orders")

    ss.sql("SELECT * FROM orders WHERE city = 'NEWTON' ").show()

    // Voir le plan d'execution logique de l'Optimisateur
    ss.sql("SELECT * FROM orders WHERE city = 'NEWTON' ").explain


  }


}
