package helper;

import model.Library;

import static globalData.GlobalData.libraries;
import static util.InputUtil.*;
import static util.MenuUtil.entryDetail;
import static util.MenuUtil.entryShow;

public class ServiceHelper {
    static int id = 0;
    public static Library fillLibrary(){
        String bookName = stringInput("Enter the name: ");
        String bookAuthor = stringInput("Enter the author: ");
        String bookGenre = stringInput("Enter the genre: ");
        int bookPageCount = intInput("Enter the count page : ");
        String bookLanguage = stringInput("Enter the language: ");
        int bookPrize = intInput("Enter the prize: ");
        int bookCount = intInput("Enter the count: ");
        byte bookStockStatus = byteInput("Enter the stock Status: ");
        return new Library(++id,bookName,bookAuthor,bookGenre,bookPageCount,bookLanguage,bookPrize,bookCount,bookStockStatus);
    }
    public static void detailBook(){
        String detailBook = entryDetail();
        for (Library library:libraries) {
            if (library.getName().equals(detailBook)) {
                System.out.println(library);
            }
        }
    }
    public  static void nameSearch(){
        byte option = entryShow();
        String str = stringInput("Enter the search: ");
        for (Library library:libraries) {
            if (option == 1 && library.getName().equals(str)) {
                System.out.println(library);
            } else if (option == 2 && library.getName().equals(str) && library.getStockStatus() == 1) {
                System.out.println(library);
            }
        }
    }
    public  static void authorSearch(){
        byte option = entryShow();
        String str = stringInput("Enter the search: ");
        for (Library library:libraries) {
            if (option == 1 && library.getAuthor().equals(str)) {
                System.out.println(library);
            } else if (option == 2 && library.getAuthor().equals(str) && library.getStockStatus() == 1) {
                System.out.println(library);
            }
        }
    }
    public  static void genreSearch(){
        byte option = entryShow();
        String str = stringInput("Enter the search: ");
        for (Library library:libraries) {
            if (option == 1 && library.getGenre().equals(str)) {
                System.out.println(library);
            } else if (option == 2 && library.getGenre().equals(str) && library.getStockStatus() == 1) {
                System.out.println(library);
            }
        }
    }
}
