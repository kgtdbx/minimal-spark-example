#!/bin/bash

wget http://spark-project.org/download-spark-0.6.1-sources-tgz
tar xzf spark-0.6.1-sources.tgz
cd spark-0.6.1
sbt/sbt compile assembly
cp core/target/spark-*jars
cd ..
rm -rf spark-0.6.1

