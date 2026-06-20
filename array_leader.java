public class array_leader
{
    public static void main(String args[])
    {
        int arr[] = {10,22,12,3,0,6};
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            boolean flag = false;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]<=arr[j])
                {
                    flag = true;
                    break;
                }
            }
            if(flag==false)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}