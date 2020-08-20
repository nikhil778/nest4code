public class day_2 {
	
	static float heightConvertor(int hightFeetPart,int heightInchPart)
	 {
		 double foot=12;
		 double inch=2.54;
		 
		 //Multiply the foot and inch
		 double totalHeightConvertor=foot*inch;
		 
		 double a=hightFeetPart*totalHeightConvertor;
		 double b=heightInchPart*inch;
		 
		 //add the a and b and store the value in c
		 double c=(a+b);
		 return (float) c;
	 }
	static float weightConvertor(int weight)
	 {
		double kg=2.2;
		double a=weight*kg;
		return (float) a;
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//heightConvertor(2,5);
		System.out.println("height in cm : "+heightConvertor(5,11));//180.34
		System.out.println( "Weight in pounds : "+weightConvertor(60));//132
		System.out.println("height in cm : "+heightConvertor(5,0));//152.4
		System.out.println( "Weight in pounds : "+weightConvertor(101));//222.2
	}

}
