package codechallenge2018;

import java.io.FileNotFoundException;

public class Main {
	
	public static void main (String[] args) throws FileNotFoundException
	{
		String basePath = "src/";
		
		String fileName_1 = "input_1.txt";
		String fileName_2 = "";
		String fileName_3 = "";
		String fileName_4 = "";
		
		String inputFile_1 = basePath + fileName_1;
		String inputFile_2 = basePath + fileName_2;
		String inputFile_3 = basePath + fileName_3;
		String inputFile_4 = basePath + fileName_4;
		
		String outputFile_1 = basePath + "output_1.txt";
		String outputFile_2 = basePath + "output_2.txt";
		String outputFile_3 = basePath + "output_3.txt";
		String outputFile_4 = basePath + "output_4.txt";
		
		SingleProblemThread t1 = new SingleProblemThread(inputFile_1, outputFile_1);
		SingleProblemThread t2 = new SingleProblemThread(inputFile_2, outputFile_2);
		SingleProblemThread t3 = new SingleProblemThread(inputFile_3, outputFile_3);
		SingleProblemThread t4 = new SingleProblemThread(inputFile_4, outputFile_4);
		t1.run();
		t2.run();
		t3.run();
		t4.run();
	}
}
