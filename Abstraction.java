abstract class xyz{
    abstract void get();

}
 class abc extends xyz{
    void get(){
     System.out.println("This is abstract method overriden"); 
    }

}
public class Abstraction {
    public static void main(String[] args) {
        abc a=new abc();
        a.get();
        
    }
    
}
