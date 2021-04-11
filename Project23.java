import java.util.Scanner;

public class Project23 {

	public static void main(String[] args) {
		String Capitals[][] = {
	    {"Saudi Arabia","Riyadh"},
   	    {"Qatar","Doha"}, 
		{"Bahrain","Manama"},
		{"Kuwait","Kuwait"}, 
		{"Oman","Masqat"},
	};
		
		
		Scanner r = new Scanner(System.in);
		
		System.out.print("Enter the capitals: ");
		String w = (r.next());

		for(int i = 0; i < Capitals.length; i++) 
		{
			if(w.equals(Capitals[i][0])); 
			System.out.println(Capitals[i][1] );
			break;
		}

		r.close();

		}

	}
