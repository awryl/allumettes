package allumettes;

// Levée quand une triche est détectée 

public class OperationInterditeException extends RuntimeException {
	
	
	public OperationInterditeException(String message) {
		super(message);
	}
}
