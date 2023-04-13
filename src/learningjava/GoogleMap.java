package learningjava;

public interface GoogleMap {
	// a interface which contains only one abstract method is known as SAM Interface
	// Single Abstract Method Interface SAM Interface
	// Also Called As Functional Interface 
	// we can us lambda expression only  in Functional Interface  
    public void map();
    int MAX_CITY=20;
    //in interface default it takes as Static variable
    //in interface default it takes as final variable 
    //we need to initialize here it self
    default void display() {// we can declare method in interface by using default
    	System.out.println("HELLO EVERYBODY");
    }
    	default void disp() {// we can declare method in interface by using default
        	System.out.println("HELLO ");
        	// we can override this default method also
    }
}
