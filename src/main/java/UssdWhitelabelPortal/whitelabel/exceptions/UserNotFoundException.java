package UssdWhitelabelPortal.whitelabel.exceptions;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String userIdIsAlreadyTaken) {
        super(userIdIsAlreadyTaken);
    }
}