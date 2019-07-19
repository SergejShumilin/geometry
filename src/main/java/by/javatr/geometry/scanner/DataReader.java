package by.javatr.geometry.scanner;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

//    private static final Logger LOG = Logger.getLogger(DataReader.class);

    public List<String> readFromFile(String path) throws IOException {
        List<String> list = new ArrayList<String>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
        } catch (FileNotFoundException e) {
//            LOG.error(e.getMessage(), e);
        }
        return list;
    }
}
