
public class ArrayExample {

	public static void main(String[] args){
		/*int month_days[];
		month_days=new int[12];
		month_days[0]=31;
		month_days[1]=28;
		month_days[2]=31;
		month_days[3]=30;
		month_days[4]=35;
		month_days[8]=31;
		month_days[10]=45;
		month_days[11]=78;
		//month_days[12]=65;
		System.out.println(month_days[3]);*/
		/*int month_days[]= {31,52,41,63,78,96,85,74,12,36};
		month_days[7]=45;
		System.out.println(month_days[3]);*/
		double nums[]= {10.2,11.3,12.5,14.8,78.4};
		double result=0.0;
		int i;
		for(i=0;i<nums.length;i=i+1)
			result=result+nums[i];
		System.out.println("Sum of results " +result);
		System.out.println("Average is " +result/nums.length);
		
	}

}
