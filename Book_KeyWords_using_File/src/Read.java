import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Read {
	public static int count = 3;

	public static void main(String[] args) {
		Read rf = new Read();
		Scanner scan = new Scanner(System.in);
		String fn = "C:\\Users\\kishan\\Documents\\NetBeansProjects\\keywords.txt"; ///enter file path////
		int user_choice=0;
		
	    
	    while(user_choice!=3){
	    	System.out.println("Enter 1 to Readata");
			System.out.println("Enter 2 to Writedata");
			System.out.println("Enter 3 to exit the program");
		user_choice = scan.nextInt();
		switch(user_choice){
		case 1:
			rf.Readata(fn);
			break;
		
		case 2:
			rf.WriteData(fn);
			count++;
			break;
		
		case 3:
			System.out.println("you have exit the code");
			System.exit(0);
			
			default:
				System.out.println("invalid Selection ");
				break;
				 
	
	}
	    }
	}
	
	public void Readata(String fn){
		try{
			
			BufferedReader reader = new BufferedReader(new FileReader(fn));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
			
			}
			catch(Exception e){
		     	e.printStackTrace(System.out);
			}

		}

	public void WriteData(String fn){
		String number = "12.6.";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the content you want to write:" );
		String data = input.nextLine();
		
		
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(fn, true));
			writer.write("\r\n"+number+Read.count+" " + data);
			writer.close();
			
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}

		}
	}
		
	
		
	
