package Lesson_1.Marathon;

public class Main {
    public static void main(String[] args) {
     Course c = new Course();
     Team team = new Team(new Human("Боб"), new Cat("Барсик"), new Dog("Бобик"),new Human("Джек"));
      c.doIt(team);


























//        Competitor[] competitors = {new Human("Боб"), new Cat("Барсик"), new Dog("Бобик")};
//        Obstacle[] course = {new Obstacle.Cross(80), new Obstacle.Wall(2), new Obstacle.Wall(1), new Obstacle.Cross(120)};
//        for (Competitor c : competitors) {
//            for (Obstacle o : course) {
//                o.doIt(c);
//                if (!c.isOnDistance()) break;
//            }
//        }
//        for (Competitor c : competitors) {
//            c.info();
//        }
    }
}
