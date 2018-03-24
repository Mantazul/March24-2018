package keywords;

public class Child extends Father {

    public Child(){
        super(12);
    }

    public void higherEducation(){
        super.education();
    }

    public void athleticSkill(){
        int numberOfSports = super.numberOfSports;
        System.out.println(numberOfSports);
    }

}
