package a;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverPropertyInfo;

public class A {

    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader fr=new FileReader("mythread1");
        char ch='a';
        while(fr.read()!=-1)
        {
            System.out.print(ch);
        }
        
    }
    
}
