import java.util.*;
public class AppleandOranges{
    public static void main(String[] args)
    {
        int a=4,b=12,s=7,t=10,count=0,count1=0,i;
        List<Integer> apples=new ArrayList<Integer>(){2,3,-4};
        List<Integer> aoranges=new ArrayList<Integer>(){3,-2,-4};
       
        List<Integer> applesnew=new ArrayList<Integer>();
        List<Integer> orangesnew=new ArrayList<Integer>();
        for(i=0;i<apples.size();i++)
        {
            applesnew.add(apples.get(i)+a);
            orangesnew.add(oranges.get(i)+b);
        }
        for(i=0;i<applesnew.size();i++)
        {
            if(applesnew.get(i)>=s && applesnew.get(i)<=t)
            {
                count1++;
            }
        }
        for(i=0;i<orangesnew.size();i++)
        {
            if(orangesnew.get(i)>=s && orangesnew.get(i)<=t)
            {
                count++;
            }
        }
        System.out.println(+count1);
        System.out.println(+count);
    
    }
}