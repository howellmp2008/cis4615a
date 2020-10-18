
private void writeObject(final ObjectOutputStream stream)
    throws IOException {
  stream.defaultWriteObject();
}
 
private void readObject(final ObjectInputStream stream)
    throws IOException, ClassNotFoundException {
  stream.defaultReadObject();
}

Link: https://wiki.sei.cmu.edu/confluence/display/java/SER01-J.+Do+not+deviate+from+the+proper+signatures+of+serialization+methods
