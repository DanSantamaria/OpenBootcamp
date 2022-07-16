public class Exercises4 {
    static class Person{
        public String name;
        public int age;
        public String phoneNumber;
    }

    static class Client extends Person {
        public int credit;
    }

    static class Worker extends Person {
        public int salary;
    }

    public static void main(String[] args) {
        Client myClient = new Client();
        myClient.name = "John";
        myClient.age = 30;
        myClient.phoneNumber = "123456";
        myClient.credit = 1500;
        System.out.println("Client: \n" + myClient.name + "\n" + myClient.age + "\n" + myClient.phoneNumber + "\n" + myClient.credit);

        Worker myWorker = new Worker();
        myWorker.name = "William";
        myWorker.age = 35;
        myWorker.phoneNumber = "234567";
        myWorker.salary = 2500;
        System.out.println("Worker: \n" + myWorker.name + "\n" + myWorker.age + "\n" + myWorker.phoneNumber + "\n" + myWorker.salary);
    }

}
