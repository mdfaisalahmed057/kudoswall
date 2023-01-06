// Write a function to alternate the case of the characters in the string; 
// i.e., each lowercase letter becomes uppercase and each uppercase letter becomes lowercase. For example, altERnaTIng cAsE becomes ALTerNAtiNG CaSe



public class lowercaseanduppercase {
    public static void main(String[] args) {
        String str = "altERnaTIng cAsE";
        System.out.println(lowerupper(str));
    }

    public static String lowerupper(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // character class has several method one of which is used to check letter is
            // upper or lower
            if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));// addding the character in the stringbuilder

            } else if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();

    }

}
 
  