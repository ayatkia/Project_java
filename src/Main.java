import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Animal dog = new Dog();
//        Duck duck = new Duck();
//        Fish fish = new Fish();
//        dog.setName("Dog");
//        dog.sound();
//        duck.fly();
//        duck.swim();
//        fish.setName("Fish");
//        fish.swim();
/// ////////////////////////////////////////////////////////////////////////////////////////////////////
//        int[] numbers = {1, 3, 5, 7, 9, 11};
//        List<Searchable> searcheAlgoritms = new ArrayList<>();
//        searcheAlgoritms.add(new BinarySearch());
//        searcheAlgoritms.add(new LinearSearch());
//        int target = 7;
//        for(Searchable algo: searcheAlgoritms){
//            int index=algo.search(numbers, target);
//            System.out.println(algo.getClass().getSimpleName()+"found  "+target+" at index "+index);
//        }

//        ArrayList<String> student=new ArrayList<>();
//        student.add("Ali");
//        student.add("taghi");
//        student.add("naghi");
//
//        System.out.println("لیست اولیه دانشجوها: " + student);
//
//
//        student.set(1,"Sara update");
//        student.remove("Ali");
//        System.out.println("بعد از تغییرات در ArrayList:"+student);
        HashSet<Integer> studentId = new HashSet<>();
        studentId.add(105);
        studentId.add(107);
        studentId.add(109);
        studentId.add(110);
        studentId.add(101);
        studentId.add(106);
        System.out.println("لیست اولیه دانشجوها: " + studentId);
        System.out.println(" آیا شماره 103 وجود دارد؟ " + studentId.contains(103));
        TreeSet<Integer> sortId = new TreeSet<>(studentId);

        System.out.println("لیست مرتب اولیه دانشجوها: " + sortId);

        System.out.println("کوچکترین شماره : " + sortId.first());
        System.out.println("بزرگترین شماره : " + sortId.last());





    }

}