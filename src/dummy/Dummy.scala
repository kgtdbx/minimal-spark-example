package dummy

import spark.SparkContext
import SparkContext._

object Dummy {
  val dataFile = "fakedata.txt"

  def loadData(sc:SparkContext, file:String) = {
    sc.textFile(file).map(line =>{
        val parts = line.split("\t")
        (parts(0).trim, parts(1).trim)
      }
    )
  }
  
  def mapper(pair:(String, String)) = {
    (pair._2, (pair._1, 1))
  }
  
  def reducer(one:(String, Int), two:(String, Int)) = {
    ((one._1, one._2+two._2))
  }
  
  def main(args:Array[String]) {
    val sc = new SparkContext("local[2]", getClass().getName)
    val data = loadData(sc, dataFile)
    val mapped = data.map(mapper)
    val reduced = mapped.reduceByKey(reducer)
    reduced.saveAsTextFile("reduced.txt")
  }
}
