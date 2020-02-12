package Chapter9;
public class SubStringDemo3
{
    public static void main(String[] args) {
        String str = "Four score and seven years ago";
        int first, last;
        first = str.indexOf('r');
        last = str.lastIndexOf('r');
        System.out.println("The letter r first appears at "
                + "position " + first);
        System.out.println("The letter r last appears at "
                + "position " + last);


        String str2 = "and a one and a two and a three";
        int position;
        System.out.println("The word and appears at the "
                + "following locations.");

        position = str2.indexOf("and");
        while (position != -1) {
            System.out.println(position);
            position = str2.indexOf("and", position + 1);
        }
    }
}

