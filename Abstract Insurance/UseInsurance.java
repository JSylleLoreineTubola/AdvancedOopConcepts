import java.util.Scanner;

public class UseInsurance {

	public UseInsurance() {
	}

	public static void main(String[] args) {
		
		Scanner choose = new Scanner (System.in);
		System.out.println ("Insurance: " + "\n1: Health \n" + "2: Life");
		
		while (choose.hasNext()) {
			int a= 0;
			if (choose.hasNextInt()) {
				a= choose.nextInt();
			

		switch (a){
		
		case 1:
			
			Health HealthInsurance = new Health(null, 0);
			HealthInsurance.display();
			break;
			
			
		case 2:
			Life LifeInsurance = new Life(null, 0);
			LifeInsurance.display();
			break;		
			
		}		
}
	}
}
}