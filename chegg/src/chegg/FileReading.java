package chegg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FileReading {

	/*Variable declaration  */
	private BufferedReader br;
	private FileReader fr;
	private Map<String, Integer> map=new HashMap<String,Integer>();
	String line="";
	/*Default constructor*/
	public FileReading(){
		/*Initializing map with key and initial value is 0 */
		for(int i=97;i<123;i++){
			String key=(char)i+"";
			map.put(key, 0);
		}
	}
	/*countWords() method implementation 
	 * path -- file Path*/
	public void countWords(){
		try{
			fr=new FileReader("/home/lalchand/Desktop/word.dat");
			br=new BufferedReader(fr);

			line=br.readLine();
			/*Reading file line by line and then
			 * Splitting line with space to getting words
			 * and then getting first character from words
			 * then we will check that character present in map or not*/
			while(line!=null){
				String words[]=line.split(" ");
				for(int j=0;j<words.length;j++){
					/*Getting first character from word*/
					char c=words[j].charAt(0);
					/*Getting value from map*/
					int cnt=map.get(c+"");
					if(cnt>=0){
						map.put(c+"", ++cnt);
					}
				}
				line=br.readLine();
			} 

			/*Iterator instance for iterating
			 * Getting keys from map through keySet*/
			Iterator<String> itr=map.keySet().iterator();	
			/*Printing count with Key*/
			while(itr.hasNext()){
				String key=itr.next();
				System.out.println(key+":"+map.get(key));
			}
			/*Exception handling
			 * exception can be FileNotoundException 
			 * or NullPointer Exception*/	
		}catch(Exception exception){
			System.out.println(exception.getMessage());
		}
	}


	/*Main method start*/
	public static void main(String args[]){
		/*Creating instance of FileReading Class*/
		FileReading fileReading=new FileReading();
		/*alling countWords method*/
		fileReading.countWords();

	}
}
