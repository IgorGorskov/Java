import java.util.*;
public class S6 {
    public static void main(String[] args) {
        MySet ms = new MySet();
        ms.add(1);
        ms.add(2);
        ms.add(3);
        ms.add(4);
        ms.add(5);
        ms.add(4);
        ms.add(4);
        ms.add(5);
        ms.add(4);
        ms.add(5);
        ms.print();
        String line = ms.toString();
        System.out.println();
        System.out.println(line);
    }
    static class MySet{
        private static final Object OBJECT = new Object();
        String space = " ";
        HashMap<Integer,Object> mySet;
        public MySet(){
            this.mySet = new HashMap<>();
        }
        public void print(){
            mySet.forEach((k,v) -> System.out.print(k + space));
        }
        public void add(int num){
            this.mySet.putIfAbsent(num, 0);
        }
        public int size(){
            return this.mySet.size();
        }
        public int get(int index){ //метод позволяющий читать элементы по индексу.
            return (int) this.mySet.keySet().toArray()[index];
        }
        public ArrayList<Integer> toList(){
            return new ArrayList<Integer>(this.mySet.keySet());
        }
        public ArrayList<Integer> toListUpToElement(int element){
            if (!mySet.containsKey(element)) return null;
            ArrayList<Integer> list = new ArrayList<>();
            for (int k:
                 mySet.keySet()) {
                list.add(k);
                if(k == element) break;
            }
            return list;
        }
        public String toString() { //метод toString возвращающий строку с элементами множества
            final String[] line = {""};
            mySet.forEach((k, v) -> line[0] += k.toString() + " ");
            return line[0];
//            public String toString() { //метод toString возвращающий строку с элементами множества
//                String line = "";
//                mySet.forEach((k, v) -> line += k.toString());
//                return line;
        }
    }
}
