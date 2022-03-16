package exceptions;


    public class StaffExistException extends RuntimeException{

        String message ="";
        public StaffExistException(String message){this.message = message;}
    }
}
