package Z2;

public class main
{
    public static void main(String[] args)
    {
        Integer[] str = new Integer[]{"ala", "ma", "kota", "123"};
        print(str);
    }
    static class Enumeration
    public static<E extends Iterable<E>>void print(E[] arg)
    {
        for (int i = 0; i < arg.length; i++)
        {
            System.out.println(arg[i].iterator() + ", ");
        }
    }
}
