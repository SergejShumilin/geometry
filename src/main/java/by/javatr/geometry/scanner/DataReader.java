package by.javatr.geometry.scanner;

import by.javatr.geometry.exception.DataMissingException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

    public List<String> readFromFile(String path) throws DataMissingException, IOException {
        List<String> list = new ArrayList<String>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new DataMissingException();
        }  finally {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }
        return list;
    }
}
