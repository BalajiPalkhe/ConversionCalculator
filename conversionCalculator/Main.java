package conversionCalculator;

import java.util.Scanner;

public class Main {

	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		
		
		LengthInterface l=new LengthImplements();
		
		WeightInterface w=new WeightImplements();
		
		while(true)
		{
			System.out.println("Choose Option:\n1.Length\n2.Weight\n3.Data");
			int input=scan.nextInt();
			
			if(input==1)
			{
				System.out.println("Choose Option:\n1.km --> m\n2.km --> mm\n3.km --> cm\n4.m --> km\n5.m --> mm\n6.m --> cm\n7.mm --> km\n8.mm --> m\n9.mm --> cm\n10.cm --> km\n11.cm --> m\n12.cm --> mm");
				int input1=scan.nextInt();
				if(input1==1)
				{
					double i=Scanner();
					l.kmeterToMeter(i);
					
				}
				else if(input1==2)
				{
					double i=Scanner();
					l.kmeterToMm(i);
				}
				else if(input1==3)
				{
					double i=Scanner();
					l.kmeterToCm(i);
				}
				else if(input1==4)
				{
					double i=Scanner();
					l.meterToKm(i);
				}
				else if(input1==5)
				{
					double i=Scanner();
					l.meterToMm(i);
				}
				else if(input1==6)
				{
					double i=Scanner();
					l.meterToCm(i);
				}
				else if(input1==7)
				{
					double i=Scanner();
					l.mmToKm(i);
				}
				else if(input1==8)
				{
					double i=Scanner();
					l.mmToMeter(i);
				}
				else if(input1==9)
				{
					double i=Scanner();
					l.mmToCm(i);
				}
				else if(input1==10)
				{
					double i=Scanner();
					l.cmToKm(i);
				}
				else if(input1==11)
				{
					double i=Scanner();
					l.cmToMeter(i);
				}
				else if(input1==12)
				{
					double i=Scanner();
					l.cmToMm(i);
				}
				else
				{
					System.out.println("Please Choose Valid Option");
				}
			}				
			else if(input==2)
			{
				System.out.println("Choose Option:\n1.Tonne  --> Kg\n2.Tonne --> Gram\n3.Tonne --> Mg\n4.Kg --> Tonne\n5.Kg --> Gram\n6.Kg --> Mg\n7.Gram --> Tonne\n8.Gram --> Kg\n9.Gram --> Mg\n10.Mg --> Tonne\n11.Mg --> Kg\n12.Mg --> Gram");
				int input2=scan.nextInt();
				if(input2==1)
				{
					double i=Scanner();
					w.tonneToKg(i);
	
				}
				else if(input2==2)
				{
					double i=Scanner();
					w.tonneToGram(i);
	
				}
				else if(input2==3)
				{
					double i=Scanner();
					w.tonneToMg(i);
	
				}
				else if(input2==4)
				{
					double i=Scanner();
					w.kgToTonne(i);
	
				}
				else if(input2==5)
				{
					double i=Scanner();
					w.kgToGram(i);
	
				}
				else if(input2==6)
				{
					double i=Scanner();
					w.kgToMg(i);
	
				}
				else if(input2==7)
				{
					double i=Scanner();
					w.gramToTonne(i);
	
				}
				else if(input2==8)
				{
					double i=Scanner();
					w.gramToKg(i);
	
				}
				else if(input2==9)
				{
					double i=Scanner();
					w.gramToMg(i);
	
				}
				else if(input2==10)
				{
					double i=Scanner();
					w.mgToTonne(i);
	
				}
				else if(input2==11)
				{
					double i=Scanner();
					w.mgToKg(i);
	
				}
				else if(input2==12)
				{
					double i=Scanner();
					w.mgToGram(i);
	
				}
				else
				{
					System.out.println("Please Choose Valid Option");
				}
					
					
			}
			else if(input==0)
			{
				System.exit(0);
				
			}
				
			else
			{
				System.out.println("Please Choose Valid Option");
				
			}
			
		}
		

	}
	
	private static double Scanner() 
	{
		System.out.println("Enter Value to convert : ");
		double i=scan.nextDouble();
		return i;
	}

}
