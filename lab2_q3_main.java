/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
    Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
public class Main {
    public static void main(String [] args)
    {
       mother m = new mother();
       //to show compile time polymorphism
       m.show();
       m.show(10);
      
      //for runtime polymorphism
       mother m1 = new child();
       m1.show();
       //since the classes are not independent this doesnt give error and the show function of child is called.
}
}