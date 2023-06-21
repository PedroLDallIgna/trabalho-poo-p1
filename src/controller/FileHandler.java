package controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileHandler<T> {
    public void save(String filename, T content) throws IOException {
        FileOutputStream outputFile = new FileOutputStream(filename);
        ObjectOutputStream writer = new ObjectOutputStream(outputFile);
        
        writer.writeObject(content);

        outputFile.close();
    }
    
    public T read(String filename) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream inputFile = new FileInputStream(filename);
        ObjectInputStream reader = new ObjectInputStream(inputFile);
        
        T content = (T) reader.readObject();
        
        inputFile.close();   
        
        return content;
    }
}
