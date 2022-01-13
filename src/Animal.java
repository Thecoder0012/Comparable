public class Animal implements Comparable<Animal> {



    private String type;
    private int age;
    private String gender;


    public Animal(String type, int age, String gender){

        this.type = type;
        this.age = age;
        this.gender = gender;
    }


    public String getType(){
        return this.type;
    }
    public void setType(String type){
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+":"+
                " type = "+type+
                ", age = "+age+
                ", gender = "+gender;
    }

    @Override
    public int compareTo(Animal animal) {
        if(this.getAge() > animal.getAge())
        return 1;
        else
        return -1;
    }

}
