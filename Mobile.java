package week1.day2;

public class Mobile {
	String mobileBrandName="Lava";
	
	short noOfPouch=1;
	int noOfPiece=1;
	char firstLetter='S';
	double mobilePrice=2784.87;
	float mobileRange=23.3454F;
	long imeiNumber=9087625251423L;
	boolean isCharged=false;
	
public static void main(String[] args) {
	Mobile mobile=new  Mobile();
	System.out.println(mobile.mobileBrandName);
	System.out.println(mobile.mobilePrice);
	System.out.println(mobile.firstLetter);
	System.out.println(mobile.imeiNumber);
	System.out.println(mobile.isCharged);
}

}
	
	
