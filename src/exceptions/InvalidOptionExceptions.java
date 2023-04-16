package exceptions;

import enums.ExceptionEnum;

public class InvalidOptionExceptions extends RuntimeException{
    public InvalidOptionExceptions() {
        super("\n" + ExceptionEnum.INVALID_OPTION.name());
    }
}
