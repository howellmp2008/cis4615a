//Rule 02: Expressions (EXP)
//EXP00-J. Do not ignore values returned by methods
//Non-compliant code
public void deleteFile(){
 
  File someFile = new File("someFileName.txt");
  // Do something with someFile
  someFile.delete();
 
}

//Compliant code

public void deleteFile(){
 
  File someFile = new File("someFileName.txt");
  // Do something with someFile
  if (!someFile.delete()) {
    // Handle failure to delete the file
  }
 
}

Link: https://wiki.sei.cmu.edu/confluence/display/java/EXP00-J.+Do+not+ignore+values+returned+by+methods
