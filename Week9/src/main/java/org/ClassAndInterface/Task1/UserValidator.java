package org.ClassAndInterface.Task1;

public class UserValidator {
    public String[] validateEmails(String email, String alternativeEmail) {
        class Email {
            private String email;

            public Email(String email) {
                if (email == null || email.isEmpty()) {
                    this.email = "unknown";
                }
                else {
                    this.email = email;
                }
            }
        }
        Email email1 = new Email(email);
        Email email2 = new Email(alternativeEmail);
        return new String[]{email1.email, email2.email};
    }
}
