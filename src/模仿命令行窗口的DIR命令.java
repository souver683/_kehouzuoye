import java.io.File;
import  java.util.Date;


public class 模仿命令行窗口的DIR命令 {
    public static void main(String[] args) {
        int dirNum=0,fileNum=0;
        File file =new File("D:\\auto.txt");
        if(!file.exists()){try {
            file.createNewFile();
        }catch(Exception ex){
            System.out.println("出异常");
        }
        }
        System.out.println("文件是否存在："+file.exists());
        System.out.println("文件？"+file.isFile()+"\n"+"目录?"+file.isDirectory());
        System.out.println("文件名："+file.getName()+"\n"+"路径名:"+file.getPath()+"\n"+"绝对路径名字符串"+file.getAbsolutePath()+"文件长度："+file.length());
        File directory =new File("D:\\myJava\\chapter7\\1");
        System.out.println(directory.mkdirs());
        File dir =new File("D:\\myJava");
        String str[] =dir.list();
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }
        File[] fs =dir.listFiles();
        for(int i=0;i<fs.length;i++){
            System.out.println(fs[i]);
            System.out.println(fs[i].getName());
            System.out.print(new Date(fs[i].lastModified()+"\t"));
            if(fs[i].isDirectory()){
                dirNum++;
                System.out.println("<DIR>\t");
            }else{
                fileNum++;
                System.out.println(fs[i].length()+"\t");
            }
        }file.delete();
    }
}
