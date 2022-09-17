//checked --- checked during compile time (check where execion can come during runtime -- pre checked)
// Unchecked -- not checked during compile time

public class _1
{
// try and catch only handel exception -- JVM ke bole dilam that exception can occoued
	public static void main(String[] args) throws InterruptedException
	{
// who call main method or any method not take the responsiblity
		System.out.println("First Line");

		Thread.sleep(50000); // exception may occour \\ Ducking (not handeled)
// We can only duck checked exception bt throwing throws
		System.out.println("Second Line");

	}

}

// Ducking === > throws ()
// Uncheck --> not check during run time 

//exception thorw exception to caller
// If not handeled throw Defalt Exception Handeler

//////////////////////////////////////////////////////

//29 first 20 -  29 min -

//-> Throwing handeled exception to upper caller -- re throwing exception
