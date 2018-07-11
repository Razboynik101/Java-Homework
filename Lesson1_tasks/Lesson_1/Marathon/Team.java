package Lesson_1.Marathon;

import java.util.Random;

public class Team {
    String Name;
    Random rnd = new Random();

    public Team(imt num){
       public Competitor[] competitors = new Competitor[num];
        for (int i = 0; i < num-1 ; i++) {
            int z = 1+ rnd.nextInt(2);
          switch (z)
            case 1:
                competitors[i]=Human human;
                break;
            case 2:
                competitors[i]=Cat cat;
                break;
            case 3:
                competitors[i]=Dog dog;
                break;
        }
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
