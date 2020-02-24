package io.createfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class CreateFileApplication {

    public static void main(String[] args) {

        SpringApplication.run(CreateFileApplication.class, args);

        try {
            File file = new File("C:\\Users\\Luke.Brannigan\\newfile.txt");
            boolean newFile = file.createNewFile();
            if (newFile) {
                System.out.println("File Created");

            } else {
                System.out.println("File already present, not created");
            }
        } catch (IOException e) {
            System.out.println("Exception Occurred");
            e.printStackTrace();
        }
    }

}
