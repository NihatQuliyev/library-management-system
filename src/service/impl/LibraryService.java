package service.impl;

import enums.SuccessMessageEnum;

import exceptions.BookNotFoundExceptions;
import exceptions.InvalidIdExceptions;
import exceptions.InvalidOptionExceptions;
import exceptions.InvalidParameterExceptions;

import model.Library;

import java.util.Arrays;
import java.util.List;

import static util.MenuUtil.*;
import static util.InputUtil.*;
import static helper.ServiceHelper.*;
import static globalData.GlobalData.libraries;
public class LibraryService implements service.LibraryService {
    @Override
    public void register()  {
        try {
            int count = intInput("Enter the count: ");
            for (int i = 0; i < count; i++) {
                System.out.println(i + 1 + " Book");
                libraries.add(fillLibrary());
            }
            System.out.println("\n" + SuccessMessageEnum.REGISTER_SUCCESSFULLY);
        }catch (InvalidParameterExceptions e){
            System.out.println(e.getMessage());

        }
    }
    @Override
    public void show() throws InvalidOptionExceptions {
        if (libraries != null && libraries.size() != 0) {
            int option = entryShow();
            if (option == 1) {
                int number = 1;
                for (Library library : libraries) {
                    System.out.println(number++ + " book \n" + library.info());
                }
                if (libraries != null) {
                    number = 1;
                    detailBook();
                }
            } else if (option == 2) {
                int number = 1;
                for (Library library : libraries) {
                    if (library.getStockStatus() == 1) {
                        System.out.println(number++ + " book \n" + library.info());
                    }
                }
                if (libraries != null) {
                    number = 1;
                    detailBook();
                }
            }
        }
        else {
            throw new InvalidOptionExceptions();
        }
    }
    public boolean update() throws BookNotFoundExceptions, InvalidParameterExceptions, InvalidIdExceptions {
        if (libraries == null || libraries.isEmpty()) {
            throw new BookNotFoundExceptions();
        }

        int id = intInput("Which book do you want to update: ");
        Library libraryToUpdate = null;
        for (Library library : libraries) {
            if (id == library.getId()) {
                libraryToUpdate = library;
                break;
            }
        }
        if (libraryToUpdate == null) {
            throw new InvalidIdExceptions();
        }

        String parameters = stringInput("Which parameter you want to change (comma-separated list): ");
        List<String> parametersList = Arrays.asList(parameters.split(","));
        boolean isUpdate = false;
        for (String parameter : parametersList) {
            switch (parameter.trim()) {
                case "name" -> {
                    libraryToUpdate.setName(stringInput("Update name: "));
                    isUpdate = true;
                }
                case "author" -> {
                    libraryToUpdate.setAuthor(stringInput("Update author: "));
                    isUpdate = true;
                }
                case "genre" -> {
                    libraryToUpdate.setGenre(stringInput("Update genre: "));
                    isUpdate = true;
                }
                case "page count" -> {
                    libraryToUpdate.setPageCount(intInput("Update page count: "));
                    isUpdate = true;
                }
                case "language" -> {
                    libraryToUpdate.setLanguage(stringInput("Update language: "));
                    isUpdate = true;
                }
                case "price" -> {
                    libraryToUpdate.setPrice(intInput("Update price: "));
                    isUpdate = true;
                }
                case "count" -> {
                    libraryToUpdate.setCount(intInput("Update count: "));
                    isUpdate = true;
                }
                default -> throw new InvalidParameterExceptions();
            }
        }
        if (isUpdate) {
            System.out.println("\n" + SuccessMessageEnum.UPDATE_SUCCESSFULLY);
        } else {
            throw new InvalidParameterExceptions();
        }

        return isUpdate;
    }

    @Override
    public boolean delete() throws InvalidIdExceptions , InvalidOptionExceptions{
        boolean isTrue = false;
        if (libraries != null && libraries.size() != 0) {
            int id = intInput("Enter the id :");
            for (Library library : libraries) {
                if (library.getId() == id) {
                    libraries.remove(library);
                    isTrue = true;
                }
            }
            if (isTrue) {
                System.out.println("\n" + SuccessMessageEnum.DELETE_SUCCESSFULLY);
            } else {
               throw  new InvalidIdExceptions();
            }
        }
        else {
            throw new InvalidOptionExceptions();
        }
        return isTrue;
    }
    public void search() throws InvalidOptionExceptions {
        if (libraries != null && libraries.size() != 0) {
            byte option = entrySearch();
            switch (option) {
                case 1 -> nameSearch();
                case 2 -> authorSearch();
                case 3 -> genreSearch();
                default -> throw new InvalidOptionExceptions();
            }
        }
        else {
            throw new InvalidOptionExceptions();
        }
    }
    @Override
    public void storageToStock() throws InvalidOptionExceptions {
        if (libraries != null && libraries.size() != 0) {
            String bookName = stringInput("Enter the book name : ");
            for (Library library : libraries) {
                if (library.getName().equals(bookName)) {
                    library.setStockStatus((byte) 1);
                }
            }
        }
        else {
            throw new InvalidOptionExceptions();
        }
    }
}