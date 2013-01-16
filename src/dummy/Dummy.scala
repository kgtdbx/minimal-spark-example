package dummy

import spark.SparkContext
import SparkContext._

object Dummy {
  val dataFile = "fakedata.txt"

  def loadData(sc:SparkContext, file:String) = {
    sc.textFile(file).map(line =>{
        val parts = line.split(" ")
        (parts(0), parts(1))
      }
    )
  }
  
  def mapper(pair:(String, String)) = {
    (pair._1, (pair._2, 1))
  }
  
  def reducer(one:(String, Int), two:(String, Int)) = {
    ((one._1, 1))
  }
  
  def main(args:Array[String]) {
    val sc = new SparkContext("local[2]", getClass().getName)
    val data = loadData(sc, dataFile)
    val mapped = data.map(mapper)
    val reduced = mapped.reduceByKey(reducer)
    reduced.saveAsTextFile("reduced.txt")
  }
}
