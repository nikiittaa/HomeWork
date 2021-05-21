package Homework5;

public class Person {
    String name;

    class Account {
        int password;

        public Account(int password) {
            this.password = password;
        }

        public void displayAccount(){
            System.out.println(name);
        }
    }

}
