package conversionCalculator;


public class LengthImplements implements LengthInterface
{
	public void kmeterToMeter(double km) 
	{
		System.out.println(km+" km = "+km*1000+" m");
		
	}

	public void kmeterToMm(double km) 
	{
		
		System.out.println(km+" km = "+km*1000000+" mm");
		
	}
	public void kmeterToCm(double km) 
	{
		System.out.println(km+" km = "+km*100000+" cm");
		
	}
//--------------------------------------------------------------------
	
	public void meterToKm(double meter) 
	{
		System.out.println(meter+" meter = "+meter/1000+" km");
		
	}

	public void meterToMm(double meter) {
		System.out.println(meter+" meter = "+meter*1000+" mm");
	}

	public void meterToCm(double meter) {
		System.out.println(meter+" meter = "+meter*100+" cm");
	}
//-----------------------------------------------------------------------
	
	public void mmToKm(double mm) {
		System.out.println(mm+" mm = "+mm/1000000+" km");
	}

	public void mmToMeter(double mm) {
		System.out.println(mm+" mm = "+mm/1000+" m");
	}

	public void mmToCm(double mm) {
		System.out.println(mm+" mm = "+mm/10+" cm");
	}
//----------------------------------------------
	
	public void cmToKm(double cm) {
		System.out.println(cm+" mm = "+cm/100000+" km");
	}

	public void cmToMeter(double cm) {
		System.out.println(cm+" mm = "+cm/100+" m");
	}

	public void cmToMm(double cm) {
		System.out.println(cm+" mm = "+cm*10+" mm");
	}

}
