package pairmatching.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static pairmatching.utils.constants.ErrorConstants.ERROR_FILE_NOT_FOUND;

public class FileReader {
    private static final String fileLocation = "./src/main/resources/";
    private String filename;

    public FileReader(String filename) {
        this.filename = filename;
    }

    public List<String> getNameList() {
        List<String> names = new ArrayList<>();
        Scanner scanner;
        try {
            scanner = new Scanner(new File(fileLocation + filename));
            while (scanner.hasNext()) {
                names.add(scanner.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println(ERROR_FILE_NOT_FOUND);
        }
        return names;
    }
}