public class CharacterDemo {
    public static void main(String[] args) {
        // How to use the following methods in
        //  Character class?
        // 1. isDigit()
        // 2. isLetter()

        // static method -->
        // ClassName.MethodName
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isDigit('c'));
        System.out.println(Character.isLetter('9'));
        System.out.println(Character.isLetter('c'));

        // 3. toLowerCase()
        // 4. toUpperCase()
        System.out.println(Character.toLowerCase('C'));
        System.out.println(Character.toUpperCase('c'));
    }
}
