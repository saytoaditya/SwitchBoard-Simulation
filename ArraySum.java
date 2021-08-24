class ArraySum{
    public static void main(String[] args)
    {
        int num[]=new int[]{1,2,3,4};
        int temp=0;
        for(int i=0; i<num.length;i++)
        {
               temp=temp+num[i];
        }
        System.out.println(+temp);
    }
}