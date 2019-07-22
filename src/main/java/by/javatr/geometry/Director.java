package by.javatr.geometry;

import by.javatr.geometry.creator.QuadrangleCreator;
import by.javatr.geometry.entity.Quadrangle;
import by.javatr.geometry.exception.DataMissingException;
import by.javatr.geometry.exception.IncorrectCoordinateException;
import by.javatr.geometry.scanner.DataReader;
import by.javatr.geometry.validator.DataParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Director {
    private DataReader dataReader;
    private DataParser parser;
    private QuadrangleCreator creator;

    public Director(DataReader dataReader, DataParser parser, QuadrangleCreator creator) {
        this.dataReader = dataReader;
        this.parser = parser;
        this.creator = creator;
    }

    public List<Quadrangle> createQuadrangle(String pathFile) throws IOException, DataMissingException {
        List<String> stringList = dataReader.readFromFile(pathFile);
        List<Quadrangle> listQuadrangle = new ArrayList<>();
        for (String line : stringList) {
            List<Integer> list = parser.parseString(line);
            Optional<Quadrangle> quadrangle = creator.createQuadrangle(list);
            quadrangle.ifPresent(listQuadrangle::add);
        }

        return listQuadrangle;
    }

}
