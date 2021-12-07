package com.xpanxion.assignments.student7;

import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaTwo {

    public void ex1() {
        var scanner = new Scanner(System.in);

        System.out.print("Enter Person: ");

        String userInput = scanner.nextLine();

        while (!userInput.equals("done")) {

            var tokenizer = new StringTokenizer(userInput, " ");
            String token = tokenizer.nextToken();

           //while(tokenizer.hasMoreTokens()) {

               int id = 0;
               String firstName = "";
               String lastName = "";

               System.out.println(tokenizer.countTokens());

               if (tokenizer.countTokens() == 2) {
                  id = Integer.parseInt(token);
               }
               if (tokenizer.countTokens() == 1) {
                   firstName = token;
               }
               if (tokenizer.countTokens() == 0) {
                   lastName = token;
               }
               else
                   tokenizer.nextToken();

              if(!(id==0) && !firstName.equals("") && !lastName.equals("")) {
                  Person person = new Person(id, firstName, lastName);
              }
          // }




        }
    }
}
