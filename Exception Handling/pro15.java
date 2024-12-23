class InvalidAgeException extends RuntimeException{
    InvalidAgeException(String message){
        super(message);
    }
}

class ValidateAge{
    public void voting(int age){
        if(age < 18){
            throw new InvalidAgeException("Invalid Age");
        }else{
            System.out.println("Welcome for Voting");
        }
    }
}

public class pro15 {
    public static void main(String[] args) {
        ValidateAge vage = new ValidateAge();
        try {
            vage.voting(16);
        }catch (InvalidAgeException err){
            System.out.println("Error is "+err);
        }
    }
}
