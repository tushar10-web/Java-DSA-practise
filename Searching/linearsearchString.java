public class linearsearchString {
    public static void main(String[] args) {
        String name="Tushar";
        char tar='q';
        boolean a=search(name, tar);
        System.out.println(a);
    }
    static boolean search(String n, char ta)
    {
        if(n.length()==0)
        {
            return false;
        }
        for(int i=0; i<n.length(); i++)
        {
            if(n.charAt(i)==ta)
            {
                return true;
            }
        }
        return false;
    }
    
}
