public class Master {
    String[] Names = new String[7];

    public void hasCat (Cat cat1,Cat cat2,Cat cat3,Cat cat4,Cat cat5,Cat cat6,Cat cat7){
        Names[0]=cat1.name;
        Names[1]=cat2.name;
        Names[2]=cat3.name;
        Names[3]=cat4.name;
        Names[4]=cat5.name;
        Names[5]=cat6.name;
        Names[6]=cat7.name;
    }
    public void info(){
        for (String z: Names) {
            System.out.println(z);
        }
    }
}
