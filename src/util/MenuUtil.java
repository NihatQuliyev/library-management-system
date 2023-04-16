package util;

import static util.InputUtil.*;

public class MenuUtil {
    public static byte entry(){
        System.out.println("""
                [1] -> Register
                [2] -> Show
                [3] -> Update
                [4] -> Delete
                [5] -> Search
                [6] -> Storage to Stock
                """);
        return byteInput("Enter the option: ");
    }

    public static byte entryShow(){
        System.out.println("""
                [1] -> Storage
                [2] -> Stocks
                """);
        return byteInput("Enter the option: ");
    }
    public static String entryDetail(){
        System.out.println("Detailed information book! ");
        return stringInput("Enter the book name: ");
    }

    public static byte entrySearch(){
        System.out.println("""
                [1] -> Name
                [2] -> Author
                [3] -> Genre
                """);

        return byteInput("Enter the option search : ");
    }
}
