package exoItCrakow;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by 81x64mod7 on 22.05.2018.
 */
public class ListOfUsers {

    final String fileName = "D:\\Sergey\\java\\JAVA KRAKOW\\test_file.txt";

    ListOfUsers() throws IOException {
    }

    public void addNewUser(User user) {
        List<String> list = new ArrayList<>();
        list = readFromFile();
        list.add(user.getName()+ " "+ user.getAge());

        writeListInFile(list);
    }

    public void writeListInFile(List<String> list){

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(
                fileName))) {

            for(int i=0; i<list.size();i++ ) {
                writer.write(list.get(i));
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> readFromFile() {
        List<String> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void deleteUserFromList(String name){
        List<String> list = new ArrayList<>();
        list =readFromFile();
        Iterator itr = list.iterator();
        String strElement = "";

        while (itr.hasNext()) {
            strElement = (String) itr.next();
            if (strElement.contains(name)) {
                itr.remove();
                break;
            }
        }
        writeListInFile(list);
    }
}
