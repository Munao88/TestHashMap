
package Test20022560;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class TestHashMap {
    public static void main(String[] args) {
        Map<Integer,Student> hm = new TreeMap<Integer,Student>();//เปลี่ยนตรง TreeMap เป็น HashMap ได้ TreeMap จะเรียงจากน้อยไปมาก
        Scanner in = new Scanner(System.in);
        for(int i = 0 ; i<5;i++){
            Student p = new Student();
            //System.out.print("UserID :");
            p.setId(in.nextInt());
            //System.out.print("UserName :");
            p.setName(in.next());
            //System.out.print("UserGPA :");
            p.setGpa(in.nextDouble());
            hm.put(p.id, p);
        }
       // Student mu = hm.get(20);
        //System.out.println(mu.name + " " + mu.gpa);
        
         for (Map.Entry entry : hm.entrySet()) { 
             Student mu = hm.get(entry.getKey());
                System.out.println("Key : " + entry.getKey() + " Value : " + mu.getId() +" "+ mu.getName()); 
         }
    }
}
