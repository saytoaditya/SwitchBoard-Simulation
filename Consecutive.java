import java.io.*;
import java.util.*;
import java.util.Scanner; 
public class Consecutive 
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int len=scn.nextInt();
        int [] arr=new int[len];
        for(int i=0;i<len;i++)
        {
            arr[i]=scn.nextInt();
        }
        HashMap<Integer,Boolean> hm=new HashMap<Integer,Boolean>();
        for(int input:arr)
        {
            hm.put(input,true);
        }
        for(int input:arr)
        {
            if(hm.containsKey(input-1))
            hm.put(input,false);
        }
        int max=0;
        int start=0;
        for(int input:arr)
        {
            if(hm.get(input)==true)
            {
                int temp=input;
                int ml=1;
                while(hm.containsKey(temp+ml))
                {
                    ml++;
                }
                if(ml>max)
                {
                    max=ml;
                    start=temp;
                }
            }
        }
        for(int i=0;i<max;i++)
        {
            System.out.println(start+i);
        }
    }
}