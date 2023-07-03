

public class String_method {
    public static void main(String[] args) {
        String name = "Ashi";
        System.out.println(name);

        // // length();
        // int value = name.length();
        // System.out.println(value);

        // // .toLowerCase()
        // String lString = name.toLowerCase();
        // System.out.println(lString);

        // // .toUpperCase()
        // String uString = name.toUpperCase();
        // System.out.println(uString);

        // // .trim()
        // String nonTrimStr = "           Ashi           ";
        // System.out.println(nonTrimStr);
        // String trimStr = nonTrimStr.trim();
        // System.out.println(trimStr);

        // //substring();
        // System.out.println(name.substring(1)); // 1 to end 
        // System.out.println(name.substring(1,3)); // 1 to 3-1=2 (n-1)

        // //replace();
        // System.out.println(name.replace('i', 'u'));
        // System.out.println(name.replace("shi", "aru"));
        // System.out.println(name.replace("i", "ish"));

        // //String always returns boolean no. 
        // System.out.println(name.startsWith("As")); //startWith(); 
        // System.out.println(name.endsWith("u")); // endsWith();

        // System.out.println(name.charAt(2)); // charAT(); 
        // System.out.println(name.indexOf('s')); // indexOf();
        // System.out.println(name.indexOf('s',2)); // indexOf("s",2(starting index));
        // System.out.println(name.lastIndexOf('i')); // lastIndexOF()
        // System.out.println(name.lastIndexOf('h', 2)); // lastIndecOf('s',startindex)
        // //NOTE: it return -1 if not found

        // equals()
        System.out.println(name.equals("Ashi"));
        System.out.println(name.equalsIgnoreCase("asHi"));

        //spacesequence " \ "
        System.out.println("this is a \" double quote and \ttab");
    }
}
