package exceptions;

import enums.ExceptionEnum;

public class BookNotFoundExceptions extends RuntimeException{
    public BookNotFoundExceptions() {
        super("\n" + ExceptionEnum.BOOK_NOT_FOUND.name());
    }
}
