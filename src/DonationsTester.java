import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class DonationsTester {
	public static void main(String[] args) {
		Donations giveToMe = new Donations();
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to process donations now? (enter ‘Yes’ to continue): ");
		String answer = sc.nextLine();
		sc.close();
		if (Objects.equals("Yes", answer)) {
		} else {
			System.out.println("Ending now without processing donations");
			System.exit(0);
		}
		try {
			File donationsFile = new File("Donations.txt");
			Scanner donationIn = new Scanner(donationsFile);
			while (donationIn.hasNextLine()) {
				String donation = donationIn.nextLine();
				String cat = " ";
				if (donation.startsWith("<ind")) {
					cat = "ind";
				}
				else if (donation.startsWith("<busi")) {
					cat = "bus";
				}
				else if (donation.startsWith("<oth")) {
					cat = "oth";
				}
				else if (donation.startsWith("<EOF")) {
					break;
				}
				donation= donation.replaceAll("[^0-9,-]", "");
				double Values = Double.parseDouble(donation);
				giveToMe.processDonation(cat, Values);
			}
			donationIn.close();
			} catch (FileNotFoundException e) {
				System.out.println("An error occurred.");
		        e.printStackTrace();
			}
		giveToMe.getStatistics();
	}
}

