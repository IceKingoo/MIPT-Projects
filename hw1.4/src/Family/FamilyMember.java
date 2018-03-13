package Family;

public abstract class FamilyMember {

    private String gender;
    private int age;
    private String name;

    protected FamilyMember(String gender, int age, String name) {
        this.gender = gender;
        this.age = age;
        this.name = name;
    }
    protected String getName(){
        return this.name;
    }
    protected int getAge(){
        return this.age;
    }
    protected String getGender(){
        return this.gender;
    }

    public void aboutMe(){
        System.out.format("My name is %s. I'm %d years old and I'm a %s",this.name,this.age,this.gender);
        System.out.println();
    }

}
