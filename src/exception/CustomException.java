package exception;


public class CustomException extends Exception {
    private String message;
    private String path;
    public CustomException() {
		
    }

    public CustomException(String message,String path) {
	super(message);
	this.message = message;
	this.path=path;
    }

    @Override
	public String getMessage() {
	return message;
    }

    public void setMessage(String message) {
	this.message = message;
    }

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
    
    
    
    
    
    
    
    
}