package string.operation;

public class NewString {
    public static void main(String[] args) {
        String st = "This is Sample Text";

        //total length
        System.out.println(st.length());
        //position of the 3rd character
        System.out.println(st.charAt(2));
        //from 5th character to last
        System.out.println(st.substring(5));
        //from 5th character to 9th
        System.out.println(st.substring(5,9));
        //to add
        System.out.println(st.concat(" for sstring operation"));
        //lower case
        System.out.println(st.toLowerCase());
        //upper case
        System.out.println(st.toUpperCase());
        //unicode that i dont understand
        System.out.println(st.codePointAt(1));
        //indexOf
        System.out.println(st.indexOf("Sample"));
        //does exist "a"
        System.out.println(st.contains("a"));
        //check if ends with "t"
        System.out.println(st.endsWith("t"));
        //if contains the exact same sequence of char
        System.out.println(st.contentEquals("Sample"));
        //
        System.out.println(st.trim()+" for deepcoding");
        //
        System.out.println(st.equals("chowdhury"));
        //
        System.out.println(st.equalsIgnoreCase("This is Sample Text"));
        //number of char before sepecified number of char
        System.out.println(st.codePointBefore(8));
        //to replace char
        System.out.println(st.replace('i','d'));
        //
        System.out.println(st.getBytes());
        //hashcode
        System.out.println(st.hashCode());
        //
        System.out.println(st.lastIndexOf("t"));
        //
        System.out.println(st.isEmpty());


    }
}
