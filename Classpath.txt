For files or projects needing speacial or additional libraries imported or implemented,   
that are NOT within the normal scope of installed java libraries, you may need to  
install additional files, like the .jar file, or even add a 'classpath' or '-cp' to  
the compile and run execution statments, already built into your IDE.  

For Geany, the Java IDE used in our course, we may want to add those to the menu  
already built into the editor.  

You may simply tweak your terminal commands slightly, to compile and run the following commands:

* javac -cp ".:doodlepad.jar" "MyDoodlePadCode.java"  

  * In the example above, call the compiler using javac
  * then add -cp to identify the classpath
  * add ".:doodlepad.jar" to point the compiler to include the helper jar file
  * the above is for using on a MacOS, you may have to make a slight change and include
  * If you are using Windows Operating system use ".;doodlepad.jar" instead

* Repeat the same for running the file - use java instead
* java -cp ".:doodlepad.jar" "MyDoodlePadCode.java"  

  

