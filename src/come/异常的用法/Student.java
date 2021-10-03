package come.异常的用法;

public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeLTOException, AgeGT150Exception {
        if(age<0){
            throw new AgeLTOException();

        }else if(age>200){
            throw new AgeGT150Exception();
        }else
        this.age = age;
    }
}
