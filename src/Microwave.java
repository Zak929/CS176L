
public class Microwave {
	private final int TIME_INIT_VALUE=0;
	private final int POWER_INIT_VALUE=1;

	private int time;
	private int power;
	
	public Microwave()
	{
		this.time = this.TIME_INIT_VALUE;
		this.power = this.POWER_INIT_VALUE;
	}
	
	public void timeButton()
	{
		int timeAmt = 30;
		time = time + timeAmt;
		System.out.println("Time button was pressed. Time is "+time+" seconds");
	}
	
	public void powerButton()
	{
		int powerAmt = 1;
		if (this.power == powerAmt) {
			this.power = this.power + powerAmt;
		} else {
			this.power = this.power - powerAmt;
		}
		System.out.println("Power button was pressed. Power level is "+power+".");
	}
	
	public void reset()
	{
		this.time = TIME_INIT_VALUE;
		this.power = POWER_INIT_VALUE;
		System.out.println("Reset Button was pressed. Power level is "+POWER_INIT_VALUE+". Time is "+TIME_INIT_VALUE+" seconds.");
	}
	
	public void start()
	{
		System.out.println("Cooking for "+time+" seconds at level "+power+".");
	}
	
}
