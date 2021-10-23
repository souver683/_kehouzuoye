import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 复制文本文件 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\itcast\\javaSE\\java.txt");
        FileOutputStream  fos=new FileOutputStream("D:\\itcast\\javaSEB\\html\\java.txt");
        int by;
        while((by=fis.read())!=-1){
            fos.write(by);
        }
        fis.close();
        fos.close();
    }
}
