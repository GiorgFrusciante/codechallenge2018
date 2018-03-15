package codechallenge2018;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SingleProblemThread implements Runnable
{
	private FileHandler fileH;
	
	public SingleProblemThread(String inputFile, String outputFile) throws FileNotFoundException 
	{
		fileH = new FileHandler(inputFile, outputFile);
	}

	@Override
	public void run() 
	{
		//implementazione algoritmo e scrittura
		String finalText = "";
		String currentLine = "";
		try 
		{
			while ((finalText = fileH.readLine()) != null) 
			{
				fileH.writeLine(finalText);
			}
			fileH.closeInput();
			fileH.closeOutput();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
