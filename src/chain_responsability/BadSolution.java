package chain_responsability;

public class BadSolution {

    public static boolean validateString(String input) {
        if (input.length() < 3)
            return false;
        else if (input.length() > 10)
            return false;
        else if (input.matches("[a-zA-Z]+"))
            return false;
        else if (input.matches("[0-9]+"))
            return false;
        else if (input.matches("[a-z]+"))
            return false;
        return true;
    }

    public static void main(String[] args) {
        String input = "Hola1123123123123"; 
        System.out.println("Input " + input + ": " + validateString(input));

    }

}
