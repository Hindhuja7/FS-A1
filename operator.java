import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
public class operator{
    // public static void m1(Integer x)
    // {
    //     System.out.print("Integer");
    // }
    // public static void m1(int...x)
    // {
    //     System.out.print("Integer1");
    // }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //int x=5;
        // System.out.println(x++);
        // System.out.println(++x);
        // System.out.println(x--);
        // System.out.println(--x);


        // System.out.print(5/2.5);//answer is in float

        // if('c'>'a')
        // {
        //     System.out.print(true);
        // }
        // else{
        //     System.out.print(false);
        // }
        //m1(x);
        //System.out.print(m1(x));
        // double z=15.0;
        // float y=15.0;
        // System.out.print(y+z);
        // LocalDate d = LocalDate.of(2026, 8, 29);

        // d = d.plusYears(1);

        // System.out.println(d);


        //  LocalDateTime dt = LocalDateTime.now();

        // dt.plusDays(10);

        // System.out.println(dt.getDayOfMonth());


        //  List<Double> list = new ArrayList<>();

        // list.add(2.5);

        // list.add(new Double(4));

        // double x = list.get(1);

        // System.out.println(list);

        // System.out.println(x);


    //      LocalDateTime dt = LocalDateTime.of(2025, 2, 25, 10, 30);

    // DateTimeFormatter f =

    //   DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

    // System.out.println(f.format(dt));

    // System.out.println(dt.format(f));


    //  LocalDate d = LocalDate.now();

    //     d = d.plusDays(2).plusMinutes(30);

    //     System.out.println(d);


    //  Double d = 5.0;

    // Integer i = 5;

    // System.out.println(d.equals(i));

    // System.out.println(d == 5.0);


    //  LocalDate d1 = LocalDate.of(2027, 1, 5);

    // LocalDate d2 = LocalDate.of(2027, 1, 5);

    // LocalDate d3 = LocalDate.of(2027, 1, 6);



    // System.out.println(d1.isAfter(d2));

    // System.out.println(d1.isBefore(d3));

    // System.out.println(d2.isBefore(d1));

    //  Integer i = 20;

    // Integer j = i;

    // i += 5;

    // j -= 10;

    // System.out.println(i + " " + j);

     LocalDateTime dt =

            LocalDateTime.of(2027, Month.APRIL, 5, 6, 15, 30, 0);

        System.out.println(dt);
    }
}