package FileIO15;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIO15 {
	public static void main(String[] args) throws FileNotFoundException {
		
			Scanner scanner = new Scanner(new File("FileRead.txt"));
           while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
       scanner.close();

	}

}

