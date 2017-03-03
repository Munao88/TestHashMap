
package Test20022560;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Test02 {
    public static void main(String[] args) {
        ArrayList<Student> X88 = new ArrayList<Student>();
        Scanner in = new Scanner(System.in);
        for(int i = 0 ; i<3;i++){
            Student p = new Student();
            System.out.print("UserID :");
            p.setId(in.nextInt());
            System.out.print("UserName :");
            p.setName(in.next());
            System.out.print("UserGPA :");
            p.setGpa(in.nextDouble());
            X88.add(p);
        }
        
        for(int i = 0;i<X88.size();i++){
            Student st = X88.get(i);
            System.out.println("UserName :"+st.name + " -----> " + "UserGPA :" + st.gpa);
            //System.out.println("UserName :"+X88.get(i).getName()+" ----> "+"UserGPA :"+X88.get(i).getGpa());
        }
        
        /*HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(21,"Sattachok");
        map.put(88,"Mu");
        int key = 88;
        String value = map.get(key);
        for(HashMap.Entry<Integer,String> X89:map.entrySet()){
            
        }*/
        
        
    }
}
