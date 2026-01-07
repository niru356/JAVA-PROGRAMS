public class array {
    public static void main(String args[])
    {
        int[] arr={10,20,30,40,50};
        int i,sum;
        for(i=0;i<=arr.length-1;i++);
        {
            sum=arr[i]+arr[i-1];
        }
        System.out.println(sum);
    }
}
