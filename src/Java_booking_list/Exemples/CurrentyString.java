package Java_booking_list.Exemples;

public class CurrentyString {

    public  static  void convertStrings(StringBuffer str){
        int len = str.length();
//
////        for (int i = 0; i<len; i++){
////            Character c = str.charAt(i);
////
////            if (Character.isLowerCase(c)){
////                str.setCharAt(i, Character.toUpperCase(c));
////            }else {
////                str.setCharAt(i, Character.toLowerCase(c));
////            }
////
////
//        }

        System.out.println(str);

    }
    public static void main(String[] args) {
//
//        String s2 = "shagor";
//        String s3 = "nasir";
//        s2 = "shagor";

       StringBuffer str = new StringBuffer("nasir");
       convertStrings(str);
//        System.out.println(str.toLowerCase());
//        System.out.println(str.toUpperCase());








//        String n = new String();
//        s1.toLowerCase();
//        System.out.println(  String.valueOf(s1));

    }
}
