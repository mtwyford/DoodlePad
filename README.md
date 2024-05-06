# DoodlePad
Instructions and Starter Code for Using Doodlepad with Geany or terminal and classpath switches

DoodlePad is a great graphics library as an add-on for teaching Java classes
Not only drawing, but adding interactivity to help students convert board and grid-type games to an interactive project 

A couple key points - 
* You have to download the doodlepad.jar file and put it in the same folder as your java files.
* You'll need to think about setting up the IDE to help with running javac and java commands, as it is a little cumbersone
* Compiling:
  * Run the javac command from the terminal window within the project folder (folder with doodlepad.jar and .java files)
  * javac -cp doodlepad.jar Main.java
* If you are creating multiple class files, use the asterisk (*) wildcard in your javac command
  * javac -cp doodlepad.jar *.java
* When ready to run, follow a similar pattern, but not the addition of the dot (period) and colon or semicolon
  * java -cp .:doodlepad.jar Main  ((note the lack of .java or .class file - just like running java command,
  * as well, depending on the platform, use the semicolon ( ; ) for Windows machines
  * ...and for MAC and Linux use the colon - "java -cp .:doodlepad.jar Main"
