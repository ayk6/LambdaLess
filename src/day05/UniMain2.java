package day05;

import day04.Uni;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UniMain2 {
    public static void main(String[] args) {
        Uni obj1 =new Uni("bgzc","isletme",120,65);
        Uni obj2 =new Uni("odtu","mat",55,75);
        Uni obj3 =new Uni("ıtu","muh",260,50);
        Uni obj4 =new Uni("ytu","comp",30,44);
        Uni obj5 =new Uni("tou","hukuk",170,60);

        List<Uni> unv=new ArrayList<>(Arrays.asList(obj1,obj2,obj3,obj4,obj5));

        System.out.println(studCount(unv)); // false
        isThereMath(unv);
        studSort(unv);
    }
    public static boolean studCount (List <Uni> unv){
        return unv.stream().allMatch(t->t.getStudents()<100);
    }
    public static void isThereMath(List<Uni> unv){
        if (unv.stream().anyMatch(t -> t.getDepartment() == "mat")) {
            System.out.println("mat bölümü var");
        } else {
            System.out.println("mat bölümü yok");
        }
    }
    public static void studSort(List<Uni> unv){
        System.out.println(unv.stream().sorted(Comparator.comparing
                (Uni::getStudents).reversed()).
                collect(Collectors.toList()));
    }
}
