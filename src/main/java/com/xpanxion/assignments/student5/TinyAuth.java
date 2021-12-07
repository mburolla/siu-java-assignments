package com.xpanxion.assignments.student5;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TinyAuth {
    Map<String, String> users;
    Scanner sc = new Scanner(System.in);

    public TinyAuth() {
        this.users = new HashMap<>();
    }
    public void run() {
        while (true) {
            System.out.print("Action [add|login|done]");
            var input = sc.nextLine();
            switch (input) {
                case "add" -> add();
                case "login" -> login();
            }
            if (input.equalsIgnoreCase("done")) {
                sc.close();
                break;
            }
        }
    }

    private void add() {

        String usrName;
        String sha1 = "";
        System.out.print("Enter your username: ");
        usrName = sc.nextLine();

        System.out.print("Enter your password: ");
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            digest.reset();
            digest.update(sc.nextLine().getBytes(StandardCharsets.UTF_8));
            sha1 = String.format("%040x", new BigInteger(1, digest.digest()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        users.put(usrName, sha1);
    }

    private void login() {
        String usrName;
        String sha1 = "";
        System.out.print("Enter your username: ");
        usrName = sc.nextLine();

        System.out.print("Enter your password: ");
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            digest.reset();
            digest.update(sc.nextLine().getBytes(StandardCharsets.UTF_8));
            sha1 = String.format("%040x", new BigInteger(1, digest.digest()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        var response = sha1.equals(users.get(usrName))?"OK":"Incorrect username or password";
        System.out.println(response);
    }
}
