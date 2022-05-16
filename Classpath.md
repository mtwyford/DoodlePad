# Getting Started With DoodlePad and ClassPath

For files or projects needing speacial or additional libraries imported or implemented,   
that are NOT within the normal scope of installed java libraries, you may need to  
install additional files, like the .jar file, or even add a 'classpath' or '-cp' to  
the compile and run execution statments, already built into your IDE.  

For Geany, the Java IDE used in our course, we may want to add those to the menu  
already built into the editor.  

You may simply tweak your terminal commands slightly, to compile and run the following commands:

* javac -cp .:doodlepad.jar MyFirstDoodle.java  

  * In the example above, call the compiler using javac
  * then add -cp to identify the classpath
  * add ".:doodlepad.jar" to point the compiler to include the helper jar file
  * the above is for using on a MacOS, you may have to make a slight change and include
  * If you are using Windows Operating system use ".;doodlepad.jar" instead

* Repeat the same for running the file - use java instead  

* javac -cp .:doodlepad.jar MyFirstDoodle.java  
  
# DoodlePad, ClassPath and Geany

Using Geany ( https://geany.org/ ) the 'flyweight' Java Editor in class gives students a leg up without a handout.  

As students need to learn the syntax of Java well, my preference has always been  
to ask students to use a simple text editor like Notepap or TextEdit.  BlueJ is a  
powerful editor with visual blocking color cues and helpful structure, and is  
about as far as I am comfortable venturing with a full featured IDE / Editor.  

Geany has provided the right level of ease, with color formatting and font options,  
while still giving students no more that the simplest of tools to learn the  
language of Java.  In addition to plug-ins like split-screen, students can also  
modify the compile and execute menu commands a little, with some extra custom  
commands built into the IDE.

### Consider the menu editor for Geany and DoodlePad

From the "Build" option in the Geany Menu Bar, Select "Set Build Commands"

![image of Geany Menu](/img/Geany_Menu.jpeg)

Next, select the (empty) or 2nd and/or 3rd buttons under the Java Commands  
options, and enter or copy the javac command above.  Note, however that  
not every one of your projects are going to be named "MyFirstDoodle.java"  
so, consider instead the substitution phrase, %f, wrapped in quotes, that
suggest the compile chooses to comile the active file or tab in Geany.

* for clarity's sake, let's give you what you need to paste into your editor  
* for the Mac
  * javac -cp ".:doodlepad.jar" "%f"
  * NOTICE - the jar file and %f substitution are both wrapped in quotes
  * see image below for example

![image of Geany Build Config](/img/Geany_Build_Cmds.jpeg)

