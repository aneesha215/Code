package com.example;

import com.example.FileHandler;
import java.util.Scanner;
public class FileOperation {
     public static void main(String args[])
     {

         System.out.println("Company Lockers Pvt. Ltd...");
         System.out.println("Aneesha Afra\n");
         Scanner sc=new Scanner(System.in);

         while(true)
         {
             String choice,FOchoice;

             System.out.println("------------------------------------\n");
             System.out.println("Please enter the action to perform..."+"\n"+"1.List all Files"+"\n"+"2.Sub File Handling Menu\n"+"0.Exit");
             System.out.println("------------------------------------\n");
             choice =sc.next();
             FileHandler fileHandler = new FileHandler();

             if (choice.equals("1")){
                     //get all file
                     fileHandler.listFiles();
                 }
             else if (choice.equals("2")) {
                     //add file
                     while (true) {
                         System.out.println("------------------------------------\n");
                         System.out.println("File Specific operations\n");
                         System.out.println("All options" + "\n" + "1.Add Files" + "\n" + "2.Delete File" + "\n" + "3.Search File" + "\n" + "0.Exit to Main Context\n");
                         System.out.println("------------------------------------\n");
                         FOchoice = sc.next();
                         if (FOchoice.equals("1")) {
                             System.out.println("Enter File Name:");
                             String FileName = sc.next();
                             fileHandler.createFile(FileName);
                         } else if (FOchoice.equals("2")) {
                             //delete
                             System.out.println("Enter File Name:");
                             String FileName = sc.next();
                             fileHandler.deleteFile(FileName);
                         } else if (FOchoice.equals("3")) {
                             //search
                             System.out.println("Enter File Name:");
                             String FileName = sc.next();
                             fileHandler.searchFile(FileName);
                         } else if (FOchoice.equals("0")) {
                             //exit
                             break;
                         }
                         else{
                             System.out.println("Please enter Options listed...");
                         }
                     }
                 }
             else if (choice.equals("0")) {
                     System.out.println("Exiting...");
                     break;
                 }

                 else {
                     System.out.println("Please enter Options listed...");
                 }


         }
     }

}
