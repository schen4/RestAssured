package test;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class CountRepeatedWord {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String line, word = "";    
        int count = 0; 
        int maxCount = 0;
       // HashMap<String, Integer> words = new HashMap<String, Integer>();   
        ArrayList<String> words = new ArrayList<String>();
            
        //Opens file in read mode    
        FileReader file = new FileReader("/Users/sharon/Documents/data.txt");    
        BufferedReader br = new BufferedReader(file);    
            
        //Reads each line    
        while((line = br.readLine()) != null) {    
            String string[] = line.toLowerCase().split("([,.\\s]+) ");    
            //Adding all words generated in previous step into words    
            for(String s : string){    
                words.add(s);    
            }    
        }
        
        //Determine the most repeated word in a file    
        for(int i = 0; i < words.size(); i++){    
            count = 1;    
            //Count each word in the file and store it in variable count    
            for(int j = i+1; j < words.size(); j++){    
                if(words.get(i).equals(words.get(j))){    
                    count++;    
                }     
            }    
            //If maxCount is less than count then store value of count in maxCount     
            //and corresponding word to variable word    
            if(count > maxCount){    
                maxCount = count;    
                word = words.get(i);    
            }    
        }    
            
        System.out.println("Most repeated word: " + word);    
        br.close();    
	}

}
