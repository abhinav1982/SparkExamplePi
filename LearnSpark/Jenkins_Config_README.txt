Setting up git
Create a repository in Git Hub and copy the https url
Goto Quick Access in Eclipse and type Git Repositories
Select Tab - Clone a Git Repository and add the clone to this view
Paste the url in URL and setup the Project
Create a project in Eclipse -> right click on the project -> select Team -> Git -> select repository and Finish.
Right Click on Project again -> Team -> Commit.
Drag and Drop the project files from Unstaged Changes to Stages Changes, add comments and click Commit and Push.


Setting up Jenkins
Jenkins -> Manage Jenkins -> Global Tool Configuration
Add JDK -> Name -> JAVA_HOME (eg C:\Program Files\Java\jdk1.8.0_181)
Git -> Git installations -> Name (eg Git Executable) -> Path to Git executable (eg C:\Program Files\Git\bin\git.exe)
Maven -> Maven installations -> Add Maven -> Name (eg Maven_Home) -> MAVEN_HOME (eg C:\Program Files\Devtools\apache-maven-3.5.4)
Select Project (eg SparkExample) -> Configure -> Source Code Management -> Git -> Repositories -> Repositories URL (eg https://github.com/AsutoshPradhan/sonarjnkin.git)
Build -> Root POM (eg LearnSpark\pom.xml)
Save

run Spark Project
spark-submit --class spPi.spPiexample.SparkPi --master local[2] /C:/Users/abhinavgupta9/workspace/spPi/target/spPi-0.0.1-SNAPSHOT.jar
