import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImagCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\itcast\\javaSE\\copy.jpg");
        FileOutputStream fos=new FileOutputStream("D:\\itcast\\copy.jpg");
        int by;
        while((by=fis.read())!=-1){
            fos.write(by);
        }fis.close();
        fos.close();
    }
}
