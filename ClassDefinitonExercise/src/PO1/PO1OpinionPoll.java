package PO1;

public class PO1OpinionPoll {

    private String name;
    private int age;

    public PO1OpinionPoll(String name,int age){
        this.name=name;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
      @Override
    public String toString(){
        return String.format("%s - %d",this.getName(),this.getAge());
    }
}
