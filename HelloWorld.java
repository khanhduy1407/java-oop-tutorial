public class HelloWorld {
    public static void main(String[] args) {
        Person[] a = new Person[2];

        for (int i = 0; i < a.length; i++) {
            a[i] = new Person();
            a[i].name = "NKDuy no." + i;
            a[i].age = 21 + i;
            a[i].height = 0.7f + i;
        }

        for (Person person: a) {
            System.out.println(person.name);
            System.out.println(person.height);
            System.out.println(person.age);
        }
    }
}
