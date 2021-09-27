package come.模拟读写数据;

public class BusinessB {
    private IReadSaveDate iReadSaveDate;

    public IReadSaveDate getiReadSaveDate() {
        return iReadSaveDate;
    }

    public void setiReadSaveDate(IReadSaveDate iReadSaveDate) {
        this.iReadSaveDate = iReadSaveDate;
    }

    public BusinessB(IReadSaveDate iReadSaveDate) {
        this.iReadSaveDate = iReadSaveDate;
    }
    //业务方法，保存数据，保存到哪里由实际的对象 iReadSaveDate决定
    public void saveDate(String date){
        iReadSaveDate.saveDate(date);
    }
    public String readDate(){
        return iReadSaveDate.getDate();
    }

}
