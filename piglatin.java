// 2. Write a function that translates a text to Pig Latin and back. English is translated to Pig Latin by taking the first letter of every word, moving it to the end of the word, and adding "ay".  For example, "hello to kudoswall" becomes "ellohay otay udoswallkay"

public class piglatin {
    public static void main(String[] args) {
        String s = "hello kudoswall";
        System.out.println(pigl(s));

    }

    public static String pigl(String s) {
        StringBuilder sb = new StringBuilder();
        String[] res = s.split("\\s+");
        for (String i : res) {
            String firstchar = i.substring(0, 1);
            String later = i.substring(1);
            sb.append(later).append(firstchar).append("ay").append(" ");
        }
        return sb.toString();
    }
}
// taking   first character in the firstchar variable ("h") then
// in later variable stroing the remaining value 
// then simply adding the remaining values in the stringbuilder