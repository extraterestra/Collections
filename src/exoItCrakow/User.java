package exoItCrakow;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 81x64mod7 on 19.05.2018.
 */
public class User implements Serializable{

    private String name;
    private int age;

    final String fileName = "D:\\Sergey\\java\\JAVA KRAKOW\\test_file2.txt";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
//    User() throws IOException {
//    }
}
