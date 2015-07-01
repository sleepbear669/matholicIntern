package findBuildingProject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class FileWrite {
	
	public void write(ArrayList<String> data) throws IOException{
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("outpub.txt"));
		Iterator<String> iterator = data.iterator();
		while(iterator.hasNext()){
			bufferedWriter.write(iterator.next());
			bufferedWriter.newLine();
		}
		bufferedWriter.close();
	}

}
