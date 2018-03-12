package Family;

public abstract class FamilyMember {
    String gender;
    int age;
    String name;

    protected FamilyMember(String gender, int age, String name) {
        this.gender = gender;
        this.age = age;
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getGender(){
        return this.gender;
    }

    public void aboutMe(){
        System.out.format("My name is:%s. I'm %d years old and I'm a %s",this.name,this.age,this.gender);
    }
}
