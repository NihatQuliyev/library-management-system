package exceptions;

import enums.ExceptionEnum;

public class InvalidParameterExceptions extends RuntimeException{
    public InvalidParameterExceptions() {
        super("\n" + ExceptionEnum.INVALID_PARAMETER.name());
    }
}
