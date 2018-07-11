package Lesson_1.Marathon;

public class Course {
    Obstacle[] course = new Obstacle[4];
    public Course (){
        course[0]=new Obstacle.Cross(80);
        course[1]=new Obstacle.Wall(2);
        course[2]= new Obstacle.Wall(1);
        course[3]= new Obstacle.Cross(120);
    }
    public void doIt(Team team) {
        for (Obstacle c: course) {
            for (Competitor t: team.competitors){
                c.doIt(t);
        }
    }
}
}
