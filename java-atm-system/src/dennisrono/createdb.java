package dennisrono;

import java.io.File;
import java.io.IOException;

public class createdb{
	public void createDatabase(){
		File db = new File("db.txt");   
		try{  
		db.createNewFile(); 
		}   
		catch (IOException e) {  
		e.printStackTrace(); 
		}         
	}
}