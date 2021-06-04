/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Robert Uriarte
 */
import java.util.Scanner;
public class Exercise23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer;
        System.out.println("Please enter lower case y for yes and lower case n for no");
        System.out.print("Is the car silent when you turn the key?");
        answer = scan.nextLine();
        if(answer.compareTo("y") == 0){
            System.out.print("Are the battery terminals corroded?");
            answer = scan.nextLine();
            if(answer.compareTo("y") == 0){
                System.out.print("Clean terminals and try starting again");
                return;
            }
            else{
                System.out.print("Replace cables and try again");
                return;
            }
        }
        else{
            System.out.print("Does the car make a slicking noise?");
            answer = scan.nextLine();
            if(answer.compareTo("y") == 0){
                System.out.print("Replace the battery");
                return;
            }
            else{
                System.out.print("Does the car crank up but fail to start?");
                answer = scan.nextLine();
                if(answer.compareTo("y") == 0) {
                    System.out.print("Check spark plug connection");
                    return;
                }
                else{
                    System.out.print("Does the engine start then die?");
                    answer = scan.nextLine();
                    if(answer.compareTo("y") == 0){
                        System.out.print("Does Your car have fuel injection");
                        answer = scan.nextLine();
                        if(answer.compareTo("y") == 0){
                            System.out.print("Then get it in for service.");
                            return;
                        }
                        else{
                            System.out.print("Check to ensure the choke is opening and closing");
                            return;
                        }

                    }
                    else{
                        System.out.print("This should not be possible");
                        return;
                    }
                }

            }
        }

    }
}