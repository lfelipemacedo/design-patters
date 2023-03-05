package builder.person;

public class Person {

    private final String name;
    private final String age;
    private final String cpf;
    private final String id;
    private final String height;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", cpf='" + cpf + '\'' +
                ", id='" + id + '\'' +
                ", height='" + height + '\'' +
                '}';
    }

    public Person(String name, String age, String cpf, String id, String height) {
        this.name = name;
        this.age = age;
        this.cpf = cpf;
        this.id = id;
        this.height = height;
    }

    public static class Builder {
        private String name;
        private String age;
        private String cpf;
        private String id;
        private String height;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(String age) {
            this.age = age;
            return this;
        }

        public Builder cpf(String cpf) {
            this.cpf = cpf;
            return this;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder height(String height) {
            this.height = height;
            return this;
        }

        public Person builder() {
            return new Person(this.name, this.age, this.cpf, this.id, this.height);
        }
    }
}
