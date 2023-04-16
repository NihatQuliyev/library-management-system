import service.LibraryManagementSystem;
import service.impl.LibraryManagement;

public class Main {
    public static void main(String[] args) {
        LibraryManagementSystem libraryManage = new LibraryManagement();
        libraryManage.management();
    }
}