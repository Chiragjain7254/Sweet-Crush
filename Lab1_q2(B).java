/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main {
    public static void main(String [] args)
    {
        for (int i=5;i>0; i--)
        {
            for (int k=i; k>0; k--)
            {
            System.out.print(" ");
            }
        for (int j=0;j<=5-i;j++){
            System.out.print("*" + " ");
        }
        System.out.println("\n");
    }
}
}
