package conversionCalculator;

public class WeightImplements implements WeightInterface {

	// Conversion of Tonne---------------------------------------
	public void tonneToKg(double tonne) {
		System.out.println(tonne+" Tonne = "+tonne*1000+" Kg");
	}

	public void tonneToGram(double tonne) {
		System.out.println(tonne+" Tonne = "+tonne*1000000+" Gram");
	}

	public void tonneToMg(double tonne) {
		System.out.println(tonne+" Tonne = "+tonne*1000000000+" Mg");
	}

	// Conversion of Kg---------------------------------------
	
	public void kgToTonne(double kg) {
		System.out.println(kg+" Kg = "+kg/1000+" Tonne");
	}

	public void kgToGram(double kg) {
		System.out.println(kg+" Kg = "+kg*1000+" Gram");
	}

	public void kgToMg(double kg) {
		System.out.println(kg+" Kg = "+kg*1000000+" Mg");
	}

	// Conversion of Gram---------------------------------------
	
	
	public void gramToTonne(double gram) {
		System.out.println(gram+" gram = "+gram/1000000+" Tonne");
	}

	public void gramToKg(double gram) {
		System.out.println(gram+" gram = "+gram/1000+" Kg");
	}

	public void gramToMg(double gram) {
		System.out.println(gram+" gram = "+gram*1000+" mg");
	}
	
	// Conversion of Mg---------------------------------------

	public void mgToTonne(double mg) {
		System.out.println(mg+" mg = "+mg/1000000000+" Tonne");
	}

	public void mgToKg(double mg) {
		System.out.println(mg+" mg = "+mg/1000000+" kg");
	}

	public void mgToGram(double mg) {
		System.out.println(mg+" mg = "+mg/1000+" gram");
	}

}
