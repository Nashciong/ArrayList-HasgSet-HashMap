public class animeException extends Exception {

    public animeException(String message){
        super(message);
    }
    
    public String notNumber(){
        return "Your input is not a number.";
    }

}
