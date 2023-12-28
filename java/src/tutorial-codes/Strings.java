public class Strings {
    public static void main(String[] args) {
            StringBuffer sb= new StringBuffer("Ashutosh");
            System.out.println(sb.capacity());
            System.out.println(sb.length());
            System.out.println(sb.append(" Tiwari"));
            String h=sb.toString();
            System.out.println(h);
            System.out.println(sb.deleteCharAt(2));
            System.out.println(sb.insert(0,"Hello "));
            System.out.println(sb.substring(1, 3));



    }
}
