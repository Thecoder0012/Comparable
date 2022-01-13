import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Animal> animalList = new ArrayList<>();

        animalList.add(new Animal("Dog",5,"Boy"));
        animalList.add(new Animal("Cat",3,"Girl"));
        animalList.add(new Animal("Snake",1,"Boy"));

        Collections.sort(animalList);

        for(Animal a : animalList){
            System.out.println(a);
        }



    }
}
