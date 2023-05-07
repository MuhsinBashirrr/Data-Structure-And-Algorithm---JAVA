public class MethodOverloading {
    public static void main(String[] args) {
        //fun(67);
        //fun("muhsinbashir");

        int ans = sum(4,5);
        System.out.println(ans);
        int anss = sum(8,9,7);
        System.out.println(anss);

    }
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b , int c){
        return a+b+c;
    }
    static void fun (int a){
        System.out.println(a);
    }
    static void fun (String name){
        System.out.println(name);
    }

}
