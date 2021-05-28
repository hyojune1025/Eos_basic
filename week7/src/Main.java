import java.util.Scanner;

class IndexOutOfBoundsException extends Exception{
    public IndexOutOfBoundsException(){
        super("에러 발생.");
    }
}

public class Main {
    static int[] arr = {1,2,3,4};
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        try{
            int a = call(c);
            System.out.println("call value : "+a);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("해당 문장은 무조건 수행");
        }
    }

    public static int call(int n) throws IndexOutOfBoundsException{
        if(n < 0 || n > 3){
            throw new IndexOutOfBoundsException();
        }
        return arr[n];
    }

}
