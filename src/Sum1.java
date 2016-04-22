import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sum1 {
	public static void main(String[] args) throws IOException
	{
		
		int sum1=0;
		
	
		FileReader f=new FileReader("C:/Users/ashokvytla/Desktop/Add.txt");
		BufferedReader bu=new BufferedReader(f);
		String str=bu.readLine();
		if(str != null)
		{
			System.out.println(str);
			String[] s1=str.split(",");
			for(int i=0;i<s1.length;i++)
			{
				String s=s1[i];
				int num=Integer.parseInt(s);
				sum1=sum1+num;
				
				
				
			}System.out.println(sum1);
			
			
	}

}
}