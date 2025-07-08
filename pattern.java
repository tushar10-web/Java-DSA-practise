public class pattern {
    // RIGHT ANGLE
    public static void main(String[] args) {
        for(int i=1;i<=10;i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    // RIGHT-ANGLE-STAR
      for(int i=1; i<=10; i++)
      {
        for(int sp=1; sp<=10-i; sp++)
        {
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++)
        {
            System.out.print("*");
        }
        System.out.println("");
      }
      
    // TRIANGLE
        for(int i=1; i<=10; i++)
        {
            for(int sp=1; sp<=10-i; sp++)
            {
                System.out.print(" ");
            }
            for(int in=1; in<=i; in++)
            {
                System.out.print(in);
            }
            for(int de=i-1; de>=1; de--)
            {
                System.out.print(de);
            }
             System.out.println("");
        }
     // TRIANGLE WITH ALPHABETS
       for(int i=2; i<=10; i++)
       {
        for(int sp=1; sp<=10-i; sp++)
        {
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++)
        {
            System.out.print(j);
        }
        for(char a=(char)('A'+i-2); a>='A'; a--)
        {
            System.out.print(a);
        }
        System.out.println("");
       }
    // RHOMBUS
    for(int i=1; i<=10; i++)
    {
       for(int sp=1; sp<=10-i; sp++)
       {
        System.out.print(" ");
       }
       for(int j=1; j<=i; j++)
       {
        System.out.print(j);
       }
       for(int de=i-1; de>=1; de--)
       {
        System.out.print(de);
       }
       System.out.println("");
    }
    for(int i=9; i>=1; i--)
    {
        for(int sp=1; sp<=10-i; sp++)
        {
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++)
        {
            System.out.print(j);
        }
        for(int de=i-1; de>=1; de--)
        {
            System.out.print(de);
        }
        System.out.println("");
    }
}
}