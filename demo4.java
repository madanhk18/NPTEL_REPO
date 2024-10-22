public class demo4 {
    static <T> void prtinting(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {
        prtinting("gotcha");
        prtinting(1);
    }
}
