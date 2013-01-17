minimal-spark-example
=====================
Repository for a minimal Spark (See http://www.spark-project.org/ ) example with no other dependencies than Java, Bash and wget.

### Note:
fakedata.txt contains text from: http://en.wikipedia.org/wiki/List_of_real-time_operating_systems

### Simple usage:

> git clone git://github.com/lagerspetz/minimal-spark-example.git  
> cd minimal-spark  
> ./get-scala.sh  
> ./get-spark.sh  
> ./compile-and-run.sh

If the above succeeds, you should see some output from Spark, and have a new folder called
reduced.txt. The folder should contain text files called part-00000 and part-00001, with content
like this:

> (free under T-License,(T-Kernel,1))  
> (modified Sleepycat license,(FunkOS,1))  
> (free,(Fusion RTOS,4))  
> (GPLv3,(Femto OS,3))  
> (Modified GNU GPL or proprietary,(ChibiOS/RT,1))  
> (BSD License,(Embox,2))  
> (Open Source and Commercial,(DSPnano RTOS,3))  
> (n/a,(OSEK,1))  
> (modified GNU GPL,(BeRTOS,4))  
> (varies,(ITRON, µITRON,1))

The content shows a license name appearing in the list, lists one example OS with that license, and counts the number of OSes with the same license.

### Notes
After get-spark.sh, you can safely delete spark-0.6.1\*. You will still be able to run the project.

