
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		
		ArrayList<String> temps = new ArrayList<String>();
		BufferedReader reader = new BufferedReader(new FileReader("dictionary.txt"));
		    String line = null;
		    while ((line = reader.readLine()) != null) {
		    	temps.add(line);
		       
		}
		    reader.close();
		    
		    for(int i=0;i<temps.size();i++){
		    	System.out.print(temps.get(i));
		    }
	}

	
}
