package Lesson_1.Marathon;

public class Team {
    Competitor[] competitors = new Competitor[4];
    String Name;
    public Team(Human human,Cat cat, Dog dog, Human human2){
        competitors[0]=human;
        competitors[1]=cat;
        competitors[2]=dog;
        competitors[3]=human2;
    }
    public void SuccessInfo(){
        for (Competitor c :competitors) {
           if (c.isOnDistance()==true) {
              c.info();
           }
        }
    }
    public void Info(){
        for (Competitor c :competitors) {
                c.info();
        }
    }








}
