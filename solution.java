class solution {
    
    public static void main(int[] arr, int n) {
        int a=0,c=0;
        for(int i=0;i<n;i++)
        {
            a=arr[i];
            if(a==0)
            c++;
        }
        System.out .println(c);
        
    }

}