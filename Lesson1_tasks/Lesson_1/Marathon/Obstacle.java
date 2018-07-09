package Lesson_1.Marathon;

public abstract class Obstacle {
    public abstract void doIt(Competitor competitor);

    public static class Water extends Obstacle {
        int length;

        public Water(int length) {
            this.length = length;
        }

        @Override
        public void doIt(Competitor competitor) {
            competitor.swim(length);
        }
    }

    public static class Wall extends Obstacle {
        int height;

        public Wall(int height) {
            this.height = height;
        }

        @Override
        public void doIt(Competitor competitor) {
            competitor.jump(height);
        }
    }
    public static class Cross extends Obstacle {
        int length;

        public Cross(int length) {
            this.length = length;
        }

        @Override
        public void doIt(Competitor competitor) {
            competitor.run(length);
        }
    }


}
