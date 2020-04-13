package Chapter11;

public class Example1 {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        try {
            for (int i = 0; i <= a.length; i++) {
                System.out.println(a[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Whoops.... out of bounds....");
        }
        System.out.println("After for loop");
    }
}

