package service.impl;

import exceptions.BookNotFoundExceptions;
import exceptions.InvalidIdExceptions;
import exceptions.InvalidOptionExceptions;
import exceptions.InvalidParameterExceptions;

import service.LibraryManagementSystem;
import service.LibraryService;

import java.util.InputMismatchException;

import static util.MenuUtil.entry;
public class LibraryManagement implements LibraryManagementSystem {
    @Override
    public void management() throws InvalidOptionExceptions{
        LibraryService libraryService = new service.impl.LibraryService();
        while (true) {
            try {

                int option = entry();
                switch (option) {
                    case 1 -> libraryService.register();
                    case 2 -> libraryService.show();
                    case 3 -> libraryService.update();
                    case 4 -> libraryService.delete();
                    case 5 -> libraryService.search();
                    case 6 -> libraryService.storageToStock();
                    default -> throw new InvalidOptionExceptions();
                }
            }catch (BookNotFoundExceptions | InvalidIdExceptions |
                    InvalidOptionExceptions | InvalidParameterExceptions |
                    InputMismatchException exception){
                System.out.println(exception.getMessage());
            }
        }

    }
}
