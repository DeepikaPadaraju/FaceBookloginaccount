package sanitytesting;

class Gfg implements Inter1 {
    // implementing the abstract method 
    // of building interface
    public void heightDisplay()
    {
        System.out.println("height is 5");
    }
    public static void main(String[] args)
    {
        Gfg gfg = new Gfg();
        gfg.heightDisplay();
    }
}
