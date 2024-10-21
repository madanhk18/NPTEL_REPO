public class demo3 {//varargs method using objects with ellipsis
    static  void harsha(Object ...mhk){//Ellipsis
        System.out.println("Number of elements: "+mhk.length);
        for (Object hk:mhk){
            System.out.println(hk);
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        harsha(8,9,6,-7);
        harsha(5,0);
        harsha(9,"HAll",8.99,"6yjg",88.0098898,true);
        harsha();
    }


}
