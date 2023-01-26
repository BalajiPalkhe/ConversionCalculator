package conversionCalculator;

public interface LengthInterface {

	//km into m, mm and cm
	void kmeterToMeter(double km);
	
	void kmeterToMm(double km);
	
	void kmeterToCm(double km);
//---------------------------------------------------
	
	// meter into km,mm and cm
	void meterToKm(double meter);
	
	void meterToMm(double meter);
	
	void meterToCm(double meter);
//-----------------------------------------------------
	//mm to km, meter and cm
	void mmToKm(double mm);
	
	void mmToMeter(double mm);
	
	void mmToCm(double mm);
//-----------------------------------------------------
		//cm to km, meter and mm
	void cmToKm(double cm);
		
	void cmToMeter(double cm);
		
	void cmToMm(double cm);
}
