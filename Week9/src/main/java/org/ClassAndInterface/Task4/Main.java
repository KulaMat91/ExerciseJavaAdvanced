package org.ClassAndInterface.Task4;

public class Main {
    public static void main(String[] args) {

        Validator<String> nameValidator =
                input -> input != null && !input.isBlank() && Character.isUpperCase(input.charAt(0));

        Validator<String> surnameValidator =
                input -> input != null && !input.isBlank() && Character.isUpperCase(input.charAt(0));

        Validator<Integer> ageValidator =
                input -> input >= 0 && input <= 150;

        Validator<String> loginValidator =
                input -> input.length() == 10;

        Validator<String> passwordValidator =
                input -> input.contains("!");
    }
}