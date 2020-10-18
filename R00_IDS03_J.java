//Non-compliant code
if (loginSuccessful) {
  logger.severe("User login succeeded for: " + username);
} else {
  logger.severe("User login failed for: " + username);
}

//Compliant code
if (loginSuccessful) {
  logger.severe("User login succeeded for: " + sanitizeUser(username));
} else {
  logger.severe("User login failed for: " + sanitizeUser(username));
}

public String sanitizeUser(String username) {
  return Pattern.matches("[A-Za-z0-9_]+", username))
      ? username : "unauthorized user";
}

Link:  https://wiki.sei.cmu.edu/confluence/display/java/IDS03-J.+Do+not+log+unsanitized+user+input
