package Chapter11;

import java.sql.SQLOutput;

public class ThrowExceptions {
    public static void main(String[] args) {
        int a = 0;
        try {
            if (a == 0)
                throw new NullPointerException("Condition is bad.");
        }
        catch (NullPointerException e)
        {
            System.out.println("........");
        }
    }
}
