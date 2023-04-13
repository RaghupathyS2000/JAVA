package learningjava;

public class InsufficientFundException extends Exception {
	// even user defined exception also need to extends exception 
	double amount;
	InsufficientFundException(double  amt){
		amount=amt;
	}

}
