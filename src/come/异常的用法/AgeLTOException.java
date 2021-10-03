package come.异常的用法;

public class AgeLTOException extends Exception {
    public AgeLTOException() {
        this("年龄大于200异常");
    }

    public AgeLTOException(String message) {
        super(message);
    }
}
