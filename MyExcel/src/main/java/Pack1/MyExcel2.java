package Pack1;

import java.io.IOException;

public class MyExcel2 {  

		public static void main(String[] args) throws IOException {
			Excel2 ob= new Excel2();
	        String a=ob.readData(1,1);
			System.out.println("Value of a is "+a);
			
			String b=ob.readData(0,1);
			System.out.println("Value of b is "+b); 

		}
}
