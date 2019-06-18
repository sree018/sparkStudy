package com.studyCassandra

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.cassandra._
object reader {
  def main(args: Array[String]) {
    val spark = SparkSession.builder().appName("studying cassandra").master("local[*]").getOrCreate()
       import spark.implicits._
    //val carData = spark.read.format("csv").option("header", "true")
      //.option("inferSchema", "true")
      //.load("/home/srinu/dataSources/cars.csv")
  //   val hivecardata= carData.withColumnRenamed("City mpg", "City_mpg")
        //                     .withColumnRenamed("Engine Type", "Engine_Type")
          //                   .withColumnRenamed("Fuel Type", "Fuel_Type")
            //                 .withColumnRenamed("Highway mpg", "Highway_Type")
              //               .withColumnRenamed("Model Year", "Model_Year")
                //             .withColumnRenamed("Number of Forward Gears", "Number_of_Forward_Gears").show()
     //hivecardata.write.saveAsTable("spark_course.carData")
     //val mysql_car_databases = spark.read.format("jdbc").option("url","jdbc:mysql://localhost:3306/dataSources")
       //                           .option("dbtable","CARSDATA")
         //                         .option("user","root").option("password","S@dama018")
           //                       .load()
    val d = spark.read.format("csv").option("header", "true").option("inferSchema", "true").load("/home/srinu/Downloads/date.csv")
    val c = d.filter(to_date($"DATE","MM/dd/yyyy").lt(lit(to_date(add_months(current_date(), -1))))
        && to_date($"DATE","MM/dd/yyyy").gt(lit(to_date(add_months(current_date(), -4)).show()

//   val avgmilageData = mysql_car_databases.select((mysql_car_databases("City_mpg")+ mysql_car_databases("Highway_mpg"))/2).alias("avag_mpg").show()
  }
}
