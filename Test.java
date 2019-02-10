import java.io.BufferedReader;
import java.io.InputStreamReader;

class Test
{
    public static void main(String args[])
    {
        Integer i1=new Integer(2000);
        Integer i2=new Integer(3000);
        Integer i3=new Integer(4000);

        Object a = i1;
        i1=i2;
        i2=i3;
        i3=null;// Line 15

    }
}