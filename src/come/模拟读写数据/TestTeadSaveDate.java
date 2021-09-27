package come.模拟读写数据;

public class TestTeadSaveDate {
    public static void main(String[] args) {
        BusinessA businessA=new BusinessA(new ReadSaveTextFile());
        businessA.saveDate("保存到文本文件中");
        BusinessB businessB=new BusinessB(new ReadSaveTextFile());
        businessB.saveDate("保存到word文件中");
    }
}
