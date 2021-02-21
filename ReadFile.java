import java.io.File;
import java.io.IOException;

public class ReadFile {

    public static void main (String[] args) {

        try
            {
                File f = new File("Test.txt");
                if(f.createNewFile()){
                    System.out.println("File created! "+ f.getName());
                } else {
                    System.out.println("Fail!");
                }
            } catch (Exception e) {
            e.printStackTrace();
        }
                            
        
    }
}
