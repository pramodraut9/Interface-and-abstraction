interface Construction{
    public void land();
    public void permssion();
    public void construction();
    public void interior();
    public void pooja();
    public void gotostay();
}
interface x{
    public void surrounding();
}
class House implements Construction,x{

    public void land(){
        System.out.println("Already land is there");
    }
    public void permssion(){
        System.out.println("Permission granted");

    }
    public void construction(){
        System.out.println("Construction completed");

    }
    public void interior(){
        System.out.println("Interior skipped");

    }
    public void pooja(){

        System.out.println("pooja done");
    }
    public void gotostay(){
        System.out.println("living now");

    }
    public void surrounding(){
        
    }

}

public class Interface {
  public static void main(String[] args) {
    House h=new House();
    h.land();
  }    
}
