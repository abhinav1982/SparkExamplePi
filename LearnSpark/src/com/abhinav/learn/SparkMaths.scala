package com.abhinav.learn

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.col


object SparkMaths {
  
  def example(spark: SparkSession) = {
    
   val df = spark.read.format("csv")
  .option("header", "true")
  .option("inferSchema", "true")
  .load("/C:/Users/abhinavgupta9/workspace/LearnSpark/2010-10-01.csv")
  //df.printSchema()
  df.createOrReplaceTempView("dfTable")
  spark.sql("""SELECT * FROM dfTable WHERE StockCode in ("DOT") AND (UnitPrice > 600 OR )""").show(5,false)
    
  }
  
  def main(args: Array[String]) = {
    
    val spark = SparkSession
      .builder
      .appName("Spark Pi")
      .config("spark.master", "local[2]")
      .getOrCreate()
    
    example(spark)
  }
}

