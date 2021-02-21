class ASCII {

    public static void main (String[] args) {

        for (int i=40;i<=176;i++)
        {

            System.out.print("n: "+ i +" "+ Character.toString(i)+" ");
            if (i%10==0){
                System.out.print("\n");
            }
        }
    }
}
