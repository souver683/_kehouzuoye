package come.异常的用法;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        try {
            s.setAge(520);
        } catch (AgeLTOException e) {
            e.printStackTrace();
        } catch (AgeGT150Exception e) {
            e.printStackTrace();
        }
        try {
            s.setAge(-520);
        } catch (AgeLTOException | AgeGT150Exception e) {
            e.printStackTrace();
        }
    }
}
