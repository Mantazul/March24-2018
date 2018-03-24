package exception;

public class Math {
    public static void main(String[] args) {
        int num = 10;
        try {
            int result = num / 0;
            System.out.println(result);
        }catch(Exception ex){
            System.out.println("Hey ! learn some basic math before you try !");
        }
    }
}
