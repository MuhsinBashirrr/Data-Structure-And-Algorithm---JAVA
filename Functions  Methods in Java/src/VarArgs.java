import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        //fun(3,4,5,5,6,66);
        multiple(2,3,"muhsin","bashir");

    }

    static void multiple(int a , int b , String ...v){

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }
}
