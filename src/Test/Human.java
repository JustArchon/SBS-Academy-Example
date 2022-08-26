package Test;

public class Human {
    public Human(String name){
        this.name = name;
    }
    public Human(int age, boolean married){
        this.age = age;
        this.married = married;
    }
    public Human(){

    }
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    private int age;

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    private boolean married;
    public void setMarried(boolean married){
        this.married = married;
    }
    public String getMarried(){
        if(married == true){
            return "유";
        }
        return "무";
    }
    private String job;
    public void setJob(String job){
        this.job = job;
    }
    public String getJob(){
        return job;
    }
    public void printInfo(){
        System.out.println(String.format("이름: %s, 나이: %d, 결혼여부: %s, 직업: %s",name,age,getMarried(),job));
    }

    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("제이슨");
        human1.setAge(20);
        human1.setMarried(false);
        human1.setJob("학생");
        human1.printInfo();
    }
}
