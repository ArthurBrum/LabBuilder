package fullApp;

public class ThiefBuilder implements CharacterBuilderInterface {
	private StringBuilder drawing;
	private String headFile = "head.txt";
	private String bodyFile = "body.txt";
	private String legsFile = "legs.txt";
	private String rootPath = "";

	public ThiefBuilder(String rootOfFiles){
		drawing = new StringBuilder();
		rootPath = rootOfFiles;
	}
	
	public void createHead(){
		drawing.append(getFileContent(rootPath + headFile));
	}
	
	public void createBody(){
		drawing.append(getFileContent(rootPath + bodyFile));
	}
	
	public void createLegs(){
		drawing.append(getFileContent(rootPath + legsFile));
	}
	
	public String getResult(){
		return drawing.toString();
	}
}
