
public class ArrayAssignment1 {

	public static void main(String[] args) {
		int numNeg = 0;
		double[] values = {25.3, 100, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146};
		double largestNum = values[0];
		for (double element : values)
		{
			System.out.print(element + " ");
			if (element > largestNum) {
				largestNum = element;
			}
			if (element < 0) {
				numNeg++;
			}
		}
		System.out.println();
		System.out.println("The largest element in the array is " + largestNum);
		System.out.println("There are " + numNeg + " negative numbers in the array");

	}

}
