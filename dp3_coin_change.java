public class dp3_coin_change{

    //Coin change problem (No. of ways)

    private static void coin(int c[], int s){

        int a[][]=new int[c.length+1][s+1];

        for(int i=0;i<=c.length;i++){
            for(int j=0;j<=s;j++){
                if(i==0)
                    a[i][j]=0;
                else if(j==0)
                    a[i][j]=1;
                else if(c[i-1]>j)
                    a[i][j] = a[i - 1][j];
                else
                    a[i][j] = a[i - 1][j] + a[i][j - c[i - 1]];
            }
        }

        System.out.println(a[c.length][s]);

    }

    public static void main(String[] args) {
        int c[]={2, 5, 3, 6};
        int s=10;
        coin(c,s);
    }
}
