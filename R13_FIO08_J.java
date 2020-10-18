//Non-compliant Code
FileInputStream in;
// Initialize stream
byte data;
while ((data = (byte) in.read()) != -1) {
  // ...
}

//Compliant Code
FileInputStream in;
// Initialize stream
int inbuff;
byte data;
while ((inbuff = in.read()) != -1) {
  data = (byte) inbuff;
  // ... 
}

Link: https://wiki.sei.cmu.edu/confluence/display/java/FIO08-J.+Distinguish+between+characters+or+bytes+read+from+a+stream+and+-1
