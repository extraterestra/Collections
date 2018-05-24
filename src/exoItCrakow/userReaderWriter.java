package exoItCrakow;

import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by 81x64mod7 on 19.05.2018.
 * https://github.com/extraterestra/itAcademyTestExercise.git
 */
public class userReaderWriter {
    public static void main(String[] args) throws IOException {

        boolean continueOrNot = true;
        do {
            System.out.print("Please enter NAME of user : ");
            Scanner scanner = new Scanner(System.in);
            String nameString = scanner.nextLine();
            System.out.print("Please enter AGE of user : ");
            int age = Integer.parseInt(scanner.nextLine());
            ListOfUsers listUsersToAdd = new ListOfUsers();
            User user = new User(nameString, age);
            listUsersToAdd.addNewUser(user);
            System.out.print("Do you want to add more users Y/N : ");
            String yOrNoAnswer = scanner.nextLine();

            if (yOrNoAnswer.equals("Y")) {
                continueOrNot = true;
            } else {
                continueOrNot = false;
            }
        } while (continueOrNot);

        boolean continueOrNotDelete = true;
        do {
            System.out.print("If you want to delete user type D or Q for quit : ");
            Scanner scannerForDelete = new Scanner(System.in);
            String deleteOrQuit = scannerForDelete.nextLine();

            if (deleteOrQuit.equals("D")) {

                System.out.print("Type name of the user to delete : ");
                String nameToDelete = scannerForDelete.nextLine();
                ListOfUsers listUsersToDelete = new ListOfUsers();
                listUsersToDelete.deleteUserFromList(nameToDelete);
                System.out.print("User with name <" + nameToDelete + "> was deleted");
                continueOrNotDelete = true;
            } else {
                continueOrNotDelete = false;
            }
        } while (continueOrNotDelete);
    }

}
