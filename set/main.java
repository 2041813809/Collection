package set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class main {
    public static void main(String[] args) {

        Student s1 = new Student("小美",15);
        Student s2 = new Student("小明",16);
        Student s3 = new Student("小可",17);
        Student s4 = new Student("小胖",18);

        Collection<Student> cs = new ArrayList<Student>();

        cs.add(s1);
        cs.add(s2);
        cs.add(s3);
        cs.add(s4);

        //遍历集合：迭代器方式
        Iterator<Student> it = cs.iterator();
        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
