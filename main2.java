import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.*;
public class main2 {
	public static void main(String[] args) throws IOException
	{
		try {
			File Obj = new File("C:\\Users\\ASUS\\Documents\\MORNING.txt");
			Scanner Reader = new Scanner(Obj);
			while (Reader.hasNextLine()) {
				String data = Reader.next();
				String data1=Reader.next();
				//System.out.println(data);
				//System.out.println(data1);
			if(Pattern.matches("[7-9]{1}[0-9]{9}",data1))
					{
				
						//System.out.print(data);
						File obj1=new File(data+".txt");
						if(obj1.createNewFile());
						{
							System.out.println("file created");
						}
						FileWriter data2 = new FileWriter("data.txt");
						 Calendar c = Calendar.getInstance();
					        
					      data2.write(c.getTime().toString());
					      data2.close();
					}
					
			}
			Reader.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}
	}
}
