package fullApp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public interface CharacterBuilderInterface {
	
	public default StringBuilder getFileContent(String file_path)
	{
		StringBuilder contents = new StringBuilder();

		try {
			BufferedReader input =  new BufferedReader(new FileReader(file_path));
			try {
				String line = null;
				while (( line = input.readLine()) != null){
					contents.append(line);
					contents.append(System.getProperty("line.separator"));
				}
			}
			finally {
				input.close();
			}
		}
		catch (IOException ex){
			ex.printStackTrace();
		}

		return contents;
	}
	
	public void createHead();
	public void createBody();
	public void createLegs();
	public String getResult();
}
