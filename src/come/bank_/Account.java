package come.bank_;
import java.util.Date;
public class Account {
    private String id,name;
    private double balance;
    private Date datetime;
    public String getId(){
        return id;
    }public void setId(String id){
        this.id=id;
    }public String getName(){
        return name;
    }public void setName(String name){
        this.name=name;
    }public double getBalance(){
        return balance;
    }public void setBalance(){
        this.balance=balance;
    }public Date getDatemtime(){
        return datetime;
    }public void setDatetime(){
        this.datetime=datetime;
    }
    public Account (String id,String name ,double balance){
        this.name=name;
        this.id=id;
        this.balance=balance;
        this.datetime=new Date();
    }public Account(){
        this.id="";
        this.name="";
        this.balance=0;
        this.datetime=new Date();
    }//存钱的方法。monet为要存入的钱数
    public void deposite(double money){
        this.balance=this.balance+money;
    }
    //取钱的方法。money为要取出的钱数
    public void withdraw(double money){
        if(this.balance<money){
            System.out.println("您的余额不足，不能取钱");
            return;
        }
        this.balance=this.balance-money;
    }
    //转账方法，当前账户对象转给其他（other）账户对象，这里的money是要转账的金额。
    public void changeMoney(Account other ,double money){
        if(this.balance<money){
            System.out.println("您的余额不足，不能转账");
         return;
        }this.balance=this.balance-money;
        other.balance=other.balance+money;
    }public void print(){
        System.out.println("账户："+id+" 户名： "+name+" 余额： "+balance);
    }
}
