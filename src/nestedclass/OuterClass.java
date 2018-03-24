package nestedclass;

public class OuterClass {

    int outerNum1 = 10;
    public InnerA innerA = new InnerA();
    public InnerB innerB = new InnerB();

    public OuterClass(){

    }
    public void outerMethodA(){
        System.out.println("Outer CLass method A");
        innerA.innerAmethodA();
        innerB.innerBmethodA();
    }
    //inner class 1
    public class InnerA{
        int innerAnum1 = 20;
        public InnerA(){

        }
        public void innerAmethodA(){
            System.out.println("Inner A method A");
        }


    }//InnerA ends

    //inner class 2
    public class InnerB{
        int innerBnum1 = 20;
        public InnerB(){

        }
        public void innerBmethodA(){
            System.out.println("Inner B method A");
        }


    }//InnerB ends

}//OuterClass ends
