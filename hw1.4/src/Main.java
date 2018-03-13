import Family.*;

public class Main {
    public static void main(String[] args) {
        FamilyMember father = new Father("Male",35,"Alexy");
        FamilyMember mama = new Mother("Female",33,"Nadejda");
        FamilyMember daughter = new Daughter("Female",17,"Luba");
        FamilyMember son = new Son("Male",19,"Leonid");
        father.aboutMe();
        mama.aboutMe();
        daughter.aboutMe();
        son.aboutMe();
    }
}
