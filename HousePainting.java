import java.util.Scanner;
public class HousePainting {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//Get all inputs
	System.out.print("Please enter the cost per square foot in dollars: ");
	double costPerSF = sc.nextDouble();
	System.out.print("Please enter the length of the house in feet: ");
	double houseLength = sc.nextDouble();
	System.out.print("PLease enter width of the house in feet: ");
	double houseWidth = sc.nextDouble();
	System.out.print("Please enter height of the house in feet: ");
	double houseHeight = sc.nextDouble();
	System.out.print("Please enter number of windows: ");
	double windowsNumber = sc.nextDouble();
	System.out.print("Please enter length of windows in feet: ");
	double windowsLength = sc.nextDouble();
	System.out.print("Please enter width of windows in feet: ");
	double windowsWidth = sc.nextDouble();
	System.out.print("Please enter number of doors: ");
	double doorsNumber = sc.nextDouble();
	System.out.print("Please enter length of doors in feet: ");
	double doorsLength = sc.nextDouble();
	System.out.print("Please enter width of doors in feet: ");
	double doorsWidth = sc.nextDouble();
	sc.close();
	//Calculate 
	double houseTrianSides = (houseLength*houseWidth) + 0.5*(houseLength*(houseHeight-houseWidth));
	houseTrianSides = houseTrianSides*2;
	double houseRecSides = houseLength*houseWidth;
	houseRecSides = houseRecSides*2;
	double houseTotalSurface = houseTrianSides + houseRecSides;
	double windowsSurface = windowsNumber*windowsLength*windowsWidth;
	double doorsSurface = doorsNumber*doorsLength*doorsWidth;
	double houseSurface = houseTotalSurface - (doorsSurface + windowsSurface);
	double finalCost = (houseSurface * costPerSF);
	//Final outputs
	String output1 = String.format("Your total printable surface area is %.0f square feet.", houseSurface);
	System.out.println(output1);
	String output2 = String.format("Your estimate is %.0f dollars.", finalCost);
	System.out.println(output2);
	}
}