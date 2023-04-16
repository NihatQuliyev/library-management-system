package exceptions;

import enums.ExceptionEnum;

public class InvalidIdExceptions extends RuntimeException{
    public InvalidIdExceptions() {
        super("\n" + ExceptionEnum.INVALID_ID.name());
    }
}
