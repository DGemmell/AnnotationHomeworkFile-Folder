import db.DBHelper;
import models.File;
import models.Folder;

public class Runner {

    public static void main(String[] args) {
        Folder folder = new Folder("Homework");
        DBHelper.save(folder);

        Folder folder2 = new Folder("ClassNotes");
        DBHelper.save(folder2);

//        File file = new File("Day1", "txt",2, folder);
//        DBHelper.save(file);
//
//        File file2 = new File("Day2", "txt", 3, folder2);
//        DBHelper.save(file2);

//       would this update file2?
//        file2 = new File("Day2", "txt", 5, folder2);
//        file2.setSize(5);
//        DBHelper.save(file2);

//        would this delete file2?
//        DBHelper.delete(file2);

    }
}
