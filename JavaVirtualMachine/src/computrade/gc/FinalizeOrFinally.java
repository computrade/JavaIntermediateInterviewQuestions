package computrade.gc;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FinalizeOrFinally {

	PrintWriter out = null;

	public static void main(String... args) throws InterruptedException {

		new FinalizeOrFinally().writeFile();
		System.gc();
		Thread.sleep(1000);

	}

	public void writeFile() {
		
		try{
			System.out.println("Entering try statement");
			out = new PrintWriter(new FileWriter("OutFile.txt"));

		} catch (IOException e) {

			System.err.println("Caught IOException: " + e.getMessage());

		} finally {
			if (out != null) {
				System.out.println("finally block: Closing PrintWriter");
				out.close();
				out=null;
			} else {
				System.out.println("finally block: PrintWriter not open");
			}
		}
	}

	@Override
	public void finalize() {

		// TODO implement your own finalize block.
		if (out != null) {
			System.out.println("finalize block: Closing PrintWriter");
			out.close();
		} else {
			System.out.println("finalize block: PrintWriter not open");
		}
	
	}

}
