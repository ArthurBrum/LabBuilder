package fullApp;

/* Old Version
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
*/
import java.util.Scanner;

public class CreateCharacterApp {

public static final String root_dir = "bin/textFiles/";

	/*Old version
	public static StringBuilder getFileContent(String file_path)
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
	*/

	public static void main(String[] args) 
	{
		String file_full_path = root_dir;
		CharacterBuilderInterface character;
		Director direc = new Director();
		
		Scanner teclado = new Scanner(System.in);		
		System.out.println("Ingresse o tipo de personagem: ");
		String tipo = teclado.nextLine();
		teclado.close();

		switch(tipo.toLowerCase())
		{
		case "soldier":
			file_full_path = file_full_path + "/" + tipo.toLowerCase() + "/";
			character = new SoldierBuilder(file_full_path);
			break;
		case "student":
			file_full_path = file_full_path + "/" + tipo.toLowerCase() + "/";
			character = new StudentBuilder(file_full_path);
			break;
		case "thief":
			file_full_path = file_full_path + "/" + tipo.toLowerCase() + "/";
			character = new SoldierBuilder(file_full_path);
			break;
		default:
			System.out.print("Tipo de personagem não suportado, por favor tente de novo");
			character = null;
			System.exit(1);
		}
		
		direc.construct(character);
		
		/* Old version 
		String file = file_full_path +  "head.txt";
		String file2 = file_full_path + "body.txt";
		String file3 = file_full_path + "legs.txt";

		character.append(getFileContent(file));
		character.append(getFileContent(file2));
		character.append(getFileContent(file3));
		*/
		
		System.out.print(character.getResult());
	}
}
