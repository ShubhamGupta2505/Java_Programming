package Stream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.io.IOException;
public class MoveFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        Path sourcepath = Paths.get("C:/oop/hi.txt");
		
		
		Path destinationpath = Paths.get("C:/octave/hi.txt");
		Files.move(sourcepath, destinationpath,StandardCopyOption.REPLACE_EXISTING);

	}

}
