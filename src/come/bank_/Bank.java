package come.bank_;

public class Bank {
    public static void main(String[] args) {
        Account zhangSan=new Account("001","张三",1000);//给张三开户
        Account liSi=new Account("002","李四",1000);
        zhangSan.deposite(2000);//张三存钱2000元
        liSi.withdraw(500);//李四取钱500元
        zhangSan.changeMoney(liSi,300);//张三给李四转账300元
        System.out.println("张三的余额是；"+zhangSan.getBalance());
        System.out.println("李四的余额是："+liSi.getBalance());

    }
}
