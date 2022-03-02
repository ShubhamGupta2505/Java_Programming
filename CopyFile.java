package Stream;
import java.io.IOException;
import java.io.*;
import java.nio.file.*;
import java.nio.file.Paths;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path sourcepath = Paths.get("C:/oop/hi.txt");
		
		
		Path destinationpath = Paths.get("C:/octave/hii.txt");
		Files.copy(sourcepath, destinationpath,StandardCopyOption.REPLACE_EXISTING);
		

	}

}
