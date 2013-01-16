#!/bin/bash

if [ ! -d bin ]
then
  mkdir bin
fi

scala-2.9.2/bin/scalac -cp jars/spark-*.jar -d bin $( find src -name "*.scala" )

scala-2.9.2/bin/scala -cp bin:jars/spark-core-assembly-0.6.1.jar dummy.Dummy

