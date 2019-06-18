name := "Spark_Studying"

version := "0.0.1"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq("org.apache.spark" % "spark-sql_2.11" % "2.4.0",
                            "org.apache.spark" % "spark-mllib_2.11" % "2.4.0",
                            "com.databricks" % "spark-csv_2.11" % "1.5.0",
                            "org.apache.spark" % "spark-core_2.11" % "2.4.0",             
                            "com.datastax.spark" %% "spark-cassandra-connector" % "2.0.10",
                            "org.apache.spark" %% "spark-hive" % "2.4.0",
                            "org.apache.spark" %% "spark-yarn" % "2.4.0"
                               )
