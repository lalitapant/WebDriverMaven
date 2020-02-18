package NewMavenProject.NewMavenProject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutputStream {

	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\User\\Desktop\\Selenium\\Docs\\newfile.txt");
		FileWriter fw=new FileWriter(f,true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("My First File");
		bw.newLine();
		bw.write("I am not enjoying weather in Canada");
		bw.close();
		

	}

}
