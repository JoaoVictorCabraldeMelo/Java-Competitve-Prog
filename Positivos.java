import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

public class Positivos {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(in);
		int i;
		int positivos = 0;
		
		float nro;
		
		for(i = 0; i < 6;i++) {
			
			nro = scan.nextFloat();
			
			if(nro > 0) {
				positivos++;
			}
		}
		
		out.println(positivos + " valores positivos");
		
		scan.close();

	}

}
