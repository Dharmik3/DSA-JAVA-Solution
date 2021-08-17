public class Reverse_string {
    public static void main(String[] args) {
        String name="Namste India";
        char temp[]=name.toCharArray();
        for(int i=temp.length-1;i>=0;i--)
        {
            System.out.print(temp[i]);
        }
    }
}
