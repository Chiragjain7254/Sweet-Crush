/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
    Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
public class Main {
    public static void main(String [] args)
    {
       mother m = new mother();
       m.show();
       //overriding done. so now the funtion in the child class is called here.
       child ch = new child();
       ch.show();
}
}