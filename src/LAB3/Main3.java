//package ro.ulbs.paradigme.lab3.util;

import java.security.SecureRandom;
import java.util.Random;

class StringRandomizer {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final Random RANDOM = new SecureRandom();

    public static String getRandomString(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(CHARACTERS.charAt(RANDOM.nextInt(CHARACTERS.length())));
        }
        return sb.toString();
    }
}

class PasswordMaker {
    private static final int MAGIC_NUMBER = new SecureRandom().nextInt(6) + 5; // între 5 și 10
    private final String magicString;
    private final String name;
    private static final Random RANDOM = new SecureRandom();

    public PasswordMaker(String name) {
        this.name = name;
        this.magicString = StringRandomizer.getRandomString(20); // Min 20 caractere
    }

    public String getPassword() {
        String randomPart = StringRandomizer.getRandomString(MAGIC_NUMBER);
        String magicSubstring = getRandomSubstring(magicString, 10);
        String nameLengthString = String.valueOf(name.length());
        int randomNumber = RANDOM.nextInt(51); // Între 0 și 50

        return randomPart + magicSubstring + nameLengthString + randomNumber;
    }

    private String getRandomSubstring(String str, int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(str.charAt(RANDOM.nextInt(str.length())));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        PasswordMaker passwordMaker = new PasswordMaker("JohnDoe");
        System.out.println("Generated Password: " + passwordMaker.getPassword());
    }
}
