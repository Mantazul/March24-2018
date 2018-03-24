package keywords;

public class Father {

    int height = 10;
    int numberOfSports = 5;

    public Father(){

    }
    public Father(int height){
      this.height = height;
      System.out.println(height);
    }

    public void education(){
        System.out.println("Educated");
    }
}
