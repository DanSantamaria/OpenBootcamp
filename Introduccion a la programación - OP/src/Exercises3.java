public class Exercises3 {

    public static class Person {
        private String name;
        private int age;
        private String phoneNumber;

        //Getters
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }
        public String getPhone() {
            return phoneNumber;
        }

        //Setters
        public void setName(String name) {
            this.name = name;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    }

    public static void main(String[] args) {
        Person personOne = new Person();
        personOne.setName("John Doe");
        personOne.setAge(25);
        personOne.setPhoneNumber("123456789");
        System.out.println(personOne.getName());
        System.out.println(personOne.getAge());
        System.out.println(personOne.getPhone());
    }
}
