//Non-compliant Code
class MutableClass {
  private Date[] date;
 
  public MutableClass() {
    date = new Date[20];
    for (int i = 0; i < date.length; i++) {
      date[i] = new Date();
    }
  }
 
  public Date[] getDate() {
    return date; // Or return date.clone()
  }
}

//Compliant Code
class MutableClass {
  private Date[] date;
 
  public MutableClass() {
    date = new Date[20];
    for(int i = 0; i < date.length; i++) {
      date[i] = new Date();
    }
  }
 
  public Date[] getDate() {
    Date[] dates = new Date[date.length];
    for (int i = 0; i < date.length; i++) {
      dates[i] = (Date) date[i].clone();
    }
    return dates;
  }
}

Link: https://wiki.sei.cmu.edu/confluence/display/java/OBJ05-J.+Do+not+return+references+to+private+mutable+class+members
