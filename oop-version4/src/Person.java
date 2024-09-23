
     public abstract class Person {
        private String name;
        private int age;
        protected String address;

        public Person(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }
        public String getAddress() {
            return address;
        }
        public abstract String getRole();
    }
