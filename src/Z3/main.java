package Z3;

import java.util.Arrays;
import java.io.File;
import java.util.Objects;
import java.util.stream.Stream;

public class main
{
    public static void main(String[] args)
    {
        File katalog = new File("src/");
        String[] str = katalog.list();
        Arrays.stream(str).map(i -> i).filter(Objects::nonNull).forEach(System.out::println);
    }
}
