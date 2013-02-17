Download the zip as a quick-start Maven 2 project

        https://github.com/tonybaines/java-m2-tdd-template/archive/master.zip

Rename the 'java-m2-tdd-template' folder to the project name (the directory name is used to build the packaged zip)

Edit pom.xml and fix the 'CHANGE-ME' values to something appropriate, and you're ready to go

Some useful Maven goals
* The usual ones

        mvn clean
        mvn test

* Generate IDE project files (if you don;t want to just import the Maven project)

        mvn eclipse:eclipse
        mvn idea:idea


---

To prepare a ready-to-go project e.g. for tutorials run the packaging script

        $ ./package

Which will (re)create a zip file with the source, pom.xml and libraries for emergency offline use in 'libs',
along with project files for IDEA and Eclipse. 

N.B. If working offline, the libraries will need to be manually switched to use the ones in 'libs'
