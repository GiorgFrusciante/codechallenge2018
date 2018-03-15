package codechallenge2018;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandler 
{
	BufferedReader in = null;
    PrintWriter out = null;
	
    public FileHandler (String inputFile, String outputFile) throws FileNotFoundException 
    {
    	in = new BufferedReader(new FileReader(inputFile));
    	out = new PrintWriter(outputFile);
    }
    
    public void setInputFile(String inputFile) throws FileNotFoundException { in = new BufferedReader(new FileReader(inputFile)); }
    
    public void setOutputFile(String outputFile) throws IOException { out = new PrintWriter(outputFile,"UTF-8"); }
    
	public String readLine() throws IOException { return in.readLine(); }
	
	public void writeLine(String s) { out.println(s); }

	public void closeInput() throws IOException {in.close();}
	public void closeOutput() throws IOException {out.close();}
}
