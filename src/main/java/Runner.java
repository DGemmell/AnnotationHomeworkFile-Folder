import db.DBHelper;
import models.File;
import models.Folder;

public class Runner {

    public static void main(String[] args) {
        Folder folder = new Folder("Homework");
        DBHelper.save(folder);

        Folder folder2 = new Folder("ClassNotes");
        DBHelper.save(folder2);

        File file = new File("Day1", "txt",2, folder);

        File file2 = new File("Day2", "txt", 3, folder2);

//        would this update file2?
        File file2 = new File("Day2", "txt",5, folder2);

    }
}
