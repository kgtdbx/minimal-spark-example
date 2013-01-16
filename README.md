minimal-spark-example
=====================

# Repository for a minimal Spark example with no other dependencies than Java and Bash.

## Note:
fakedata.txt contains text from: http://en.wikipedia.org/wiki/List_of_real-time_operating_systems

## Simple usage:

> git clone git://github.com/lagerspetz/minimal-spark-example.git
> cd minimal-spark
> ./get-scala.sh
> ./get-spark.sh
> ./compile-and-run.sh

If the above succeeds, you should see some output from Spark, and have a new folder called
reduced.txt. The folder should contain text files called part-00000 and part-00001, with content
like:

> (SOOS,(Project,1))
> (ARM7/9/11/Cortex,(M1/3,,1))
> (AMX,(RTOS,1))
> (HeartOS,(proprietary,1))
> (KolibriOS,(GNU,1))
> (REAL/32,(Proprietaryetary,1))
> (RTLinux,(GNU,1))

## Notes
After get-spark.sh, you can safely delete spark-0.6.1\*. You will still be able to run the project.

