import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Donations {
	private final int START_VAL = 0;
	private int numIndividual;
	private double amtIndividual;
	private int numBusiness;
	private double amtBusiness;
	private int numOther;
	private double amtOther;
	
	public Donations()
	{
		numIndividual = START_VAL;
		amtIndividual = START_VAL;
		numBusiness = START_VAL;
		amtBusiness = START_VAL;
		numOther = START_VAL;
		amtOther = START_VAL;
	}
	
	public void processDonation(String cat, double donation)
	{
		if (cat == "ind") {
			if (donation > 0) {
				numIndividual += 1;
			}
			else {
				numIndividual -= 1;
			}
			amtIndividual = amtIndividual + donation;
		}
		else if (cat == "bus") {
			if (donation > 0) {
				numBusiness += 1;
			}
			else {
				numBusiness-= 1;
			}
			amtBusiness = amtBusiness + donation;
		}
		else if (cat == "oth") {
			if (donation > 0) {
				numOther += 1;
			}
			else {
				numOther -= 1;
			}
			amtOther = amtOther + donation;
		}
	}
	
	public void getStatistics()
	{
		System.out.println("Individual: #:" + numIndividual + " $" + amtIndividual);
		System.out.println("Business: #:" + numBusiness + " $" + amtBusiness);
		System.out.println("Other: #:" + numOther + " $" + amtOther);
	
	}
	
}
