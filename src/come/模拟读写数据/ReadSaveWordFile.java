package come.模拟读写数据;

public class ReadSaveWordFile implements IReadSaveDate{
    public void saveDate(String date){
        System.out.println("将数据保存到了word文件中");
    }
    public String getDate() {
        System.out.println("从word文件中读取了数据");
        return null;
    }
}
