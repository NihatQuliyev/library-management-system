package service;

import exceptions.BookNotFoundExceptions;
import exceptions.InvalidIdExceptions;
import exceptions.InvalidOptionExceptions;
import exceptions.InvalidParameterExceptions;

public interface LibraryService {
    void register() throws InvalidParameterExceptions;
    void show();
    boolean update() throws BookNotFoundExceptions, InvalidParameterExceptions, InvalidIdExceptions;
    boolean delete() throws InvalidIdExceptions;
    void search() throws InvalidOptionExceptions;
    void storageToStock();
}
