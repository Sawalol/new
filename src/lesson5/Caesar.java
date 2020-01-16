package lesson5;

public class Caesar {
    public static void main(String[] args){

        String text = "some new text";
        int offset = 4;

        String decoded = "";
        String encoded = "";

        for (char c : text.toCharArray()){
            encoded = encoded + (char)(c + offset);
            
        }

        for (char c : text.toCharArray()){
            encoded = encoded + Character.toChars(c + offset)   ;
        }
        for (char c : text.toCharArray()){
            decoded = decoded + Character.toChars(c - offset)   ;
        }


        System.out.println(encoded.equals(text));
        System.out.println(decoded);
        System.out.println(encoded);

    }
}
