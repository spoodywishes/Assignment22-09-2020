package Assignment3;

public class assq7 {

	public static void main(String[] args) {
		int paid=1;
		int cents=100*paid;
	    int dimes=10*cents;
	    int quarters=paid*25;
	    int nickles;
	    System.out.println(dimes); 
	    System.out.println("Hello sir. You have paid me " + paid*3 +" dolars");
	    System.out.println("And you have purchased 3 items worth "  + 2*paid +" dolars " + 3*quarters + " cents.");
	    System.out.println("So I will refund you " + 1*paid + " quarters " + 0*20 + " dimes " + 0*7 + " nickles");
		
	}

}
