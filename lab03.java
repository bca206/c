class lab03{
    public static void main(String args[]) {
        long res=1;
        int i,n=args.length;
        for(i=0;i<n;i++){
                res=1;
                int num=Integer.parseInt(args[i]);
                for(int j=num;j>0;j--){
                        res=res*j;
                }
                System.out.println("factorial of "+num+"="+res);
        }
    }
}