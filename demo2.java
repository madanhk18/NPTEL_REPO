public class demo2 {
    static  void harsha(int ...mhk){//Ellipsis
        System.out.println("Number of elements: "+mhk.length);
        for (int hk:mhk){
            System.out.println(hk);
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        harsha(8,9,6,-7);
        harsha(5,0);
        harsha();
    }

}
