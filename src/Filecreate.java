import java.io.File;

public class Filecreate {

    public static void main(String[] args) {
        
        File dir = new File("person");
        dir.mkdir();

        String diString = dir.getAbsolutePath();
        System.out.println(diString);
        System.out.println(dir.getName());

        String pathName = dir.getAbsolutePath();

        File file1 = new File(pathName +"/student.txt");
        File file2 = new File(pathName+"/teacher.txt");

        try {
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("folder is created ");
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }


        file2.delete();

        if(file2.exists()){
            System.out.println("File exists");
        }else{
            System.out.println("file not exists");
        }

    }
    
}
