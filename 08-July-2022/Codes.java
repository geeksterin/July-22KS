public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
//          integer input
        int a=scn.nextInt();
        int b=scn.nextInt();
//         Character input
        char ch=scn.next().charAt(0);
        
//         Boolean input
        boolean c=scn.nextBoolean();
        
//         String input
        // scn.nextLine();
        String str=scn.nextLine();
        
//          Double Input
        double e=scn.nextDouble();
        
        System.out.println("My Double Value is: "+ e);
        System.out.println("My String is:"+ str);
        System.out.println("My Boolean input is:" +c);
        System.out.println("My Character is:" + ch);
        System.out.println("My Sum is:" + (a+b));
        
//         take three variables from user (x,y,z) -> 2*(x+2*y+z)
        
        int x=scn.nextInt();
        int y=scn.nextInt();
        int z=scn.nextInt();
        System.out.println(2*(x+2*y+z));
        
        
        
//         You have given the length and breadth of rectangle 
//  1) Area of rectangle 2) Perimeter of a Rectangle
        int l=scn.nextInt();
        int b=scn.nextInt();
        System.out.println("Area of rectangle:" + (l*b));
        System.out.println("Perimater of Rectangle: "+(2*(l+b)));
        
        

        
//         Take a,b integer input from user and print their sum
        
        
    }
}
