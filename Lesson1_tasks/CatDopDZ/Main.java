public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik");
        Cat cat2 = new Cat("Vasya");
        Cat cat3 = new Cat("Fera");
        Cat cat4 = new Cat("Murzik");
        Cat cat5 = new Cat("Shera");
        Cat cat6 = new Cat("Tisha");
        Cat cat7 = new Cat("Funtik");
        Master Bob = new Master();
        Bob.hasCat(cat1,cat2,cat3,cat4,cat5,cat6,cat7);
        Bob.info();
    }
}
