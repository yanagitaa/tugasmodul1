package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option;
        String username , password ;
        Scanner input = new Scanner(System.in);

        System.out.print("=== Liberary System ===\n");
        System.out.print(" 1. Login as Student\n 2. Login as Admin\n 3. Exit");
        System.out.print("\nChoose Option: ");
        option = input.nextInt();
        input.nextLine();


        switch (option){
            case 1:
                System.out.print("Enter your NIM: ");
                long nim = input.nextLong();
                if (String.valueOf(nim).length() == 15) {
                    System.out.println("Successfull login in as Student.");
                } else {
                    System.out.println("User not found.");
                }
                break;
            case 2:
                System.out.print("Enter your username: ");
                username = input.nextLine();
                System.out.print("Enter your password: ");
                password = input.nextLine();
                if (username.equals("admin")) {
                    if (password.equals("adm1n")) {
                        System.out.println("Successfull login  as Admin.");
                    }
                } else {
                    System.out.println("Admin user not found!!");
                }
                break;
            case 3:
                System.out.print("adios <3 ");
                break;

            default:
                System.out.println("Invalid Option");
                break;
        }


    }
}