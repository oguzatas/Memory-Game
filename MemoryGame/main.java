import java.awt.*;

import java.util.Random;
public class main {
    public static void main( String args[] ) {

        Random rn = new Random();
        int[] array = {0,0,1,1,2,2,3,3,4,4,5,5,6,6,7,7};


        //List<int> list=new ArrayList<int>();
        int[][] game = new int[4][4];
        for(int i=0; i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                //int q = rn.nextInt(15);
               // System.out.println(q);
                //System.out.println(array[q]);
                //array[q] != 9
                int m = 1;
               while(m==1)
               {
                   int q = rn.nextInt(16);

                   if(array[q] == 9)
                   {

                   }
                   else
                   {
                       game[i][j] = array[q];
                       array[q] = 9;
                       m=3;
                   }
               }

            }
        }

        for(int i=0; i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(game[i][j]);

            }
            System.out.println("");
        }

    }

}
