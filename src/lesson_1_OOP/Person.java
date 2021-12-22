package lesson_1_OOP;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;


    public static class Builder {
        private Person newPerson;

        public Builder() {
            newPerson = new Person();
        }

        public Builder firstName(String name) {
            newPerson.firstName = name;
            return this;
        }

        public Builder lastName(String name) {
            newPerson.lastName = name;
            return this;
        }

        public Builder middleName(String name) {
            newPerson.middleName = name;
            return this;
        }

        public Builder counter(String name) {
            newPerson.country = name;
            return this;
        }

        public Builder address(String name) {
            newPerson.address = name;
            return this;
        }

        //Метод возвращающий готовый объект

        public Person build() {
            return newPerson;
        }


    }
}