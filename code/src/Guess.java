public class Guess {
    public static void main(String[] args) {
        int sum = 0;
       for(int i = 81297; i <= 100899; i+= 198)
       {
            sum += i;
       }
        System.out.println(sum);
    }
}
