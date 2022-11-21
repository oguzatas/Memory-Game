import java.awt.*;

import java.util.Random;
public class ArrayInitializer {

    private static int[][] game;

    public static int[][] getGame() {
        return game;
    }

    public static void setGame(int[][] game) {
        ArrayInitializer.game = game;
    }



    public static void InitializeArray()
    {
        Random rn = new Random();
        int[] array = {0,0,1,1,2,2,3,3,4,4,5,5,6,6,7,7};



        int[][] game = new int[4][4];
        for(int i=0; i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
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

        setGame(game);

        /* THIS CODE LINE IS HERE TO TEST THE ARRAY ALGORYTHM. UNCOMMENT IF NEEDED */
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
