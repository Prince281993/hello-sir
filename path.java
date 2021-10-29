import java.io.*;

// Main class
public class path {

	public static void main(String[] args) throws Exception
	{

		File file = new File("C:\\Users\\hp\\Desktop\\task.txt");

		
		
		BufferedReader br= new BufferedReader(new FileReader(file));

		
		String st;
	
		while ((st = br.readLine()) != null)
        {
            
         String replaceString=st.replace("consectetur adipiscing elit","########### ########## ####");

        System.out.println(replaceString);


        }
			
			
	}
}
