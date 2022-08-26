package Animal;

public class Animal {
    private String name;
    private String color;
    private int age;
    private String gender;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
    }
    public void walk(){
        System.out.println("동물이 걷습니다.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
