public class demo5 <T>{
    T obj;
    demo5(T obj){
       this.obj=obj;
    }
    public void method(){
        System.out.println(obj);
    }
}
class hello{
    public static void main(String[] args) {
        Integer x[ ]= {2,6,7,8};
        demo5<Integer []> u=new demo5<Integer[]>(x);
        u.method();
        demo5<String> Z=new demo5<String>("My name is mDSAB");
        Z.method();


    }
}
