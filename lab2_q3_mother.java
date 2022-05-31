class mother{
    int x;
    public void show()
    {
        System.out.println("Mother here");
    }
    //to show compile time polymorphism
    public void show (int n)
    {
        System.out.println("Mother with argument");
    }
}