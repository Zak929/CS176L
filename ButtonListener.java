import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class ButtonListener implements ActionListener
{
   private Measurable[] numbers;
   private String type;

   public ButtonListener(Measurable[] numbers,String metric)
   {
      this.numbers = numbers;
      this.type = metric;
   }

   public void actionPerformed(ActionEvent event)
   {
	  double result = 0;
	  
	  if (type=="Maximum") {
		  result = Data.max(numbers);
	  }
	  if (type=="Minimum") {
		  result = Data.min(numbers);
	  }
	  if (type=="Average") {
		  result = Data.average(numbers);
	  }
      if (numbers[0].getClass().getName().equals("BankAccount")) {
    	  System.out.println(type + " Account Balance is "+ result);
      }
      if (numbers[0].getClass().getName().equals("Country")) {
    	  System.out.println(type + " Country Area is "+ result);
      }
      if (numbers[0].getClass().getName().equals("Quiz")) {
    	  System.out.println(type + " Quiz Score is "+ result);
      }
      
   }
}
