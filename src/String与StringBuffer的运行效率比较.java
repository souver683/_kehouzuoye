public class String与StringBuffer的运行效率比较 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        long start=System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            sb.append(i);
        }long end=System.currentTimeMillis();
        System.out.println("StringBuffer的运行时间为："+(end-start)+"ms");
        String s="";
        long start1=System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            s+=i;
        }
        long end1=System.currentTimeMillis();
        System.out.println("String的运行时间为："+(end1-start1)+"ms");

    }
}
