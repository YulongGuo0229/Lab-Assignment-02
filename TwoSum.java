import java.util.Arrays;


public class TwoSum {
    public int [] twoSum(int[] sums,int sum)
    {
        int s;
        int flag=0;

        int [] arr=new int[sums.length];
        for(int i = 0; i<sums.length; i++)
            arr[i] = sums[i];

        Arrays.sort(sums);

        int x=0,y=0;
        if(sums[0]+sums[1]<=sum && sums[sums.length-1]+sums[sums.length-2]>=sum)
            OuterLoop:for(int i=0;i<sums.length-1;i++)
            {
                for(int j=i+1;j<sums.length;j++)
                {
                    s=sums[i]+sums[j];
                    if(sum==s)
                    {
                        x=sums[i];
                        y=sums[j];
                        flag=1;
                        break OuterLoop;
                    }
                }
            }
        else
        {
            flag=2;
            System.out.println("The output should be -1. Because the smallest numbers are bigger than target or the biggest numbers are smaller than target.");
        }


        if(flag==0)
            System.out.println("The output should be -1. Because num is not allowed to be used twice.");



        if(flag==1)
        {

            int index1=0,index2=0;
            for(int p = 0;p<arr.length;p++){
                if(arr[p]==x){
                    index1=p;
                }
            }


            for(int q = 0;q<arr.length;q++){
                if(arr[q]==y){
                    index2=q;
                }
            }
            s=x+y;
            System.out.println("The output should be ["+index1+","+index2+"]. Because nums["+index1+"]+nums["+index2+"]="+x+"+"+y+"="+s);
        }
        return sums;
    }
}