import java.sql.SQLOutput;

public class demo {
  static  void harsha(String ...mhk){//Ellipsis
  System.out.println("Number of elements: "+mhk.length);
  for (String hk:mhk){
      System.out.println(hk);
      System.out.println(" ");
  }
  }

    public static void main(String[] args) {
        String mhk[]={"hi","bye","gm"};
        String hsn[]={"guud","bad","true","flse"};
        harsha(mhk);
        harsha(hsn);
    }
}