/*
 * 1. Пусть дан LinkedList с несколькими элементами. 
 * Реализуйте метод(не void), который вернет “перевернутый” список.
*/

package homework_seminar_java04;
import java.util.LinkedList;
public class task1 {

    public static void main(String[] args) {

        int[] listMas = {5, 3, 2, 6, 7, 4, 9, 1};
        LinkedList<Integer> linkList = new LinkedList<>();

        for (Integer temp : listMas) {
            linkList.add(temp);
        }
        
        int temp = 0;
        while (temp != linkList.size() - 1) {
            linkList.add(linkList.size()-temp, linkList.getFirst());
            linkList.removeFirst();
            temp++;
        }


        System.out.println("linkList = " + linkList);

        
    }
}
