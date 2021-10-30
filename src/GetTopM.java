import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GetTopM {
    public static void main(String[] args) {
        Random rm=new Random();
        rm.setSeed(System.currentTimeMillis());
        int n=10000000,m=50;
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            list.add(rm.nextInt());
        }
        long start=System.currentTimeMillis();
//        List<Integer> ret=GetTopM(list,m);
        List<Integer> ret2=GetTopM2 (list , m);
        long end=System.currentTimeMillis();
        System.out.println("时间为："+(double)(end-start)/1000+"秒");
    }
//    public static List<Integer>  GetTopM(List<Integer> list,int m){
//        List<Integer> ret=new ArrayList<Integer>();
//        Collections.sort(list);
//        for(int i=list.size()-1;i>=0&&ret.size()<m;i--){
//            ret.add(list.get(i));
//        }
//        System.out.println(list.size());
//        return ret;
//    }
   private static List<Integer> GetTopM2(List<Integer> list ,int m){
        List<Integer> ret=new ArrayList();
        ret.add(list.get(0));
        for(int i=0;i<list.size();i++)
        {
            if (ret.size() > m && list.get(i) < ret.get(ret.size() - 1))
                continue;
            for (int j = 0; j < ret.size(); j++)
            {
                if (ret.get(j) < list.get(i))
                {
                    ret.add(j, list.get(i));
                    break;
                }
            }
            if (ret.size() > m)
                ret.remove(ret.size() - 1);
        }
            System.out.println(m+"-----"+list.size()+"-----"+ret.size());
        return ret;
    }
}





































