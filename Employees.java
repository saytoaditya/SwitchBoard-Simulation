import java.io.*;
import java.util.*;
import java.util.Scanner;  
public class Employees
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int n1=scn.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[n1];
        System.out.println("Enter the elements of the array: 1 ");  
        for(int i=0;i<n;i++)
        {
            arr1[i]=scn.nextInt(); 
        }
        System.out.println("Enter the elements of the array: 2 ");  
        for(int j=0;j<n1;j++)
        {
            arr2[j]=scn.nextInt(); 
        }
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> hm1=new HashMap<Integer,Integer>();
        for(int val:arr1)
        {
            if(hm.containsKey(val))
            {
                hm.put(val,hm.get(val)+1);
            }
            else 
            {
                hm.put(val,1);
            }
        }
        for(int val1 : arr2)
        {
           if(hm.containsKey(val1) && hm.get(val1)>0)
            {
                System.out.println(val1);
                hm.put(val1,hm.get(val1)-1);
            }
        }
        
    }
}