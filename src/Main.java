import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        System.out.println("____1st task____");
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num1 = in.nextInt();
        System.out.print("Input a number: ");
        int num2 = in.nextInt();
        System.out.println(num1 % num2);
        in.close();
    }
    public static void task2(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("____2nd task____");
        System.out.print("Введите высоту: ");
        int hi = in.nextInt();
        System.out.print("Введите основание: ");
        int osn = in.nextInt();
        System.out.println((hi*osn)/2);
        in.close();
    }
    public static void task3(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("____3rd task____");
        System.out.print("сколько у вас цыплят?");
        int chiken = in.nextInt();
        System.out.print("сколько у вас коров?");
        int cows = in.nextInt();
        System.out.print("сколько у вас свиней?");
        int pigs = in.nextInt();
        System.out.println(chiken*2+cows*4+pigs*4);
        in.close();
    }
    public static boolean task4(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("____4th task____");
        System.out.println("prob: ");
        float prob = in.nextInt();
        System.out.println("price: ");
        float price = in.nextInt();
        System.out.println("pay: ");
        float pay = in.nextInt();
        boolean x = (prob * price > pay);
        in.close();
        return x;
    }
    public static String task5(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("1st: ");
        float a1 = in.nextInt();
        System.out.println("2nd: ");
        float a2 = in.nextInt();
        System.out.println("3rd: ");
        float n = in.nextInt();
        if (a1+a2==n)
            return "+";
        else if (a1-a2==n)
            return "-";
        else if (a1*a2==n)
            return "*";
        else if (a1/a2==n)
            return "/";
        else
            return "None";
    }
    public static int task6(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите символ");
        String c1 = (in.next());
        char c = c1.charAt(0);
        System.out.println((int) c);
        in.close();
        return ((int) c);
    }

    public static int task7(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число ");
        int o=in.nextInt();
        int x = 0;
        while (o>0)
        {
            x = x+0;
            o = o-1;
        }
        return (x);
    }
    public static int task8(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ребра: ");
        int d1 = in.nextInt();
        int d2 = in.nextInt();
        int ot = d1+d2-1;
        in.close();
        return (ot);
    }
    public static int task9(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("input int's");
        int v1 = in.nextInt();
        int v2 = in.nextInt();
        int v3 = in.nextInt();

        in.close();
        return (v1*v1*v1+v2*v2*v2+v3*v3*v3);
    }
    public static boolean task10(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("input int's ");
        int f1 = in.nextInt();
        int f2 = in.nextInt();
        int f3 = in.nextInt();
        in.close();
        if ((f1*f2)%f3 == 0){
            return (1==1);
        }
        else return (1==0);
    }
}