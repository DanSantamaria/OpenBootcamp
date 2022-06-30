public class Main {
    public static int sum(int a, int b, int c){
        int result = a+b+c;
        return result;
    }
    public static class Car {
        public int doors = 4;
        public void addDoor() {
            this.doors++;
        }
    }
    public static void main(String[] args) {
        System.out.println("Resultado suma:"+ sum(10,15,54));

        Car myCar = new Car();
        myCar.addDoor();
        System.out.println("Number of doors:" + myCar.doors);
    }
}