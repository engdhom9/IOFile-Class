package Library;
import java.io.*;
import java.util.ArrayList;

public class IOFile {
	private String path;
	private BufferedWriter BW;
	private BufferedReader BR;
	
	public IOFile(String path) {
		this.setPath(path);
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public String getPath() {
		return this.path;
	}
	
	public void addNewLine(String input) {
		try {
			this.BW = new BufferedWriter( new FileWriter( this.path , true) );
			BW.write(input + "\n");
			BW.close();
		}catch(Exception e) {
			System.out.println("\t ERROR: " + e);
		}
	}
	
	public void addNewLine(int input) {
		try {
			this.BW = new BufferedWriter( new FileWriter( this.path , true) );
			BW.write(input + "\n");
			BW.close();
		}catch(Exception e) {
			System.out.println("\t ERROR: " + e);
		}
	}
	
	public void addNewLine(char input) {
		try {
			this.BW = new BufferedWriter( new FileWriter( this.path , true));
			BW.write(input + "\n");
			BW.close();
		}catch(Exception e) {
			System.out.println("\t ERROR: " + e);
		}
	}
	
	public void clear() {
		try {
			this.BW = new BufferedWriter( new FileWriter( this.path));
			BW.write("");
			BW.close();
		}catch(Exception e) {
			System.out.println("\t ERROR: " + e);
		}
	}
	
	public void addNewStringLines(ArrayList<String> inputList) {
		try {
			this.BW = new BufferedWriter( new FileWriter( this.path , true) );
			for(String row : inputList) {
				BW.write(row + "\n");
			}
			BW.close();
		}catch(Exception e) {
			System.out.println("\t ERROR: " + e);
		}
	}
	
	public void addNewIntegerLines(ArrayList<Integer> inputList) {
		try {
			this.BW = new BufferedWriter( new FileWriter( this.path , true) );
			for(Integer row : inputList) {
				BW.write(row + "\n");
			}
			BW.close();
		}catch(Exception e) {
			System.out.println("\t ERROR: " + e);
		}
	}
	
	public String getFirstLine() {
		String line = "";
		try {
			this.BR = new BufferedReader( new FileReader( this.path ) );
			line = BR.readLine();
			BR.close();
		}catch(Exception e) {
			System.out.println("\t ERROR: " + e);
		}
		return line;
	}
	
	public ArrayList<String> getLines() {
		ArrayList<String> list = new ArrayList<>();
		try {
			this.BR = new BufferedReader( new FileReader( this.path ) );
			String line = "null";
			do {
				line = BR.readLine();
				if(!line.equalsIgnoreCase("null")) {
					list.add(line);
				}
			}while(!line.equalsIgnoreCase("null"));
			
			BR.close();
		}catch(Exception e) {
			System.out.println("\t ERROR: " + e);
		}
		
		return list;
	}
	
	public String getLastLine() {
		String lineReturned = "";
		String line = "null";
		try {
			this.BR = new BufferedReader( new FileReader( this.path ) );
			do {
				line = BR.readLine();
				if(!line.equalsIgnoreCase("null")) {
					lineReturned = line;
				}
			}while(!line.equalsIgnoreCase("null"));
			
			BR.close();
		}catch(Exception e) {
			System.out.println("\t ERROR: " + e);
		}
		return lineReturned;
	}
}
