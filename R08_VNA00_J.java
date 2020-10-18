
final class ControlledStop implements Runnable {
  private boolean done = false;
  
  @Override public void run() {
    while (!done) {
      try {
        // ...
        Thread.currentThread().sleep(1000); // Do something
      } catch(InterruptedException ie) {
        Thread.currentThread().interrupt(); // Reset interrupted status
      }
    }   
  }
 
  public void shutdown() {
    done = true;
  }
}

Link: https://wiki.sei.cmu.edu/confluence/display/java/VNA00-J.+Ensure+visibility+when+accessing+shared+primitive+variables
