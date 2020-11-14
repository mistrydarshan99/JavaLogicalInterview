public class TrickyPrint {

    public static void main(String[] args) {

        A a = null;
        a.demo();

        System.out.println(test());
    }

    static int test(){
        return (true ? null : 0);
    }
}

class A {
    static void demo() {
        System.out.println("Demo");
    }
}
