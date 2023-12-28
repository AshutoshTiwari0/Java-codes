public class array3d {
    public static void main(String[] args) {
        int i,j,k;
    int a[][][]= new int [5][5][5];
    for(i=0;i<5;i++)
    {
        for(j=0;j<5;j++)
        {
for(k=0;k<5;k++)
        {
         a[i][j][k]=0;
        }
        }
    }
for(int h=0;h<5;h++)
{
    for(int g=0;g<5;g++)
    {
        for(int u=0;u<5;u++)
        {
            System.out.print(a[h][g][u]);
            System.out.println();
        }
        System.out.println();
    }
}




    }
}
