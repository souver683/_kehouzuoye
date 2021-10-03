package come.异常的用法;

public class AgeGT150Exception extends Exception {
    public AgeGT150Exception() {
        this("年龄大于200异常");
    }

    public AgeGT150Exception(String message) {
        super(message);
    }
}
