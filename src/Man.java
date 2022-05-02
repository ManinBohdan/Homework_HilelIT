    // Клас Man
public class Man {
    // Поля
     public String name;
     public int age;
     public int height;
     public String nation;
     public String sex;

        // Конструктор
    public Man(String n, int a, int h, String nat, String s){
        this.name = n;
        this.age = a;
        this.height = h;
        this.nation = nat;
        this.sex = s;
    }
    // Пустий конструктор
    public Man (){
    }
    // Метод toString
    public String toString (int age, String nation){
        return "Name: " + name + "\n" + "Age: " + age + "\n" + "Height: " + height + "\n" + "Nation:" + nation + "\n" + "Sex: " + sex;
    }
    // Перевантаження методу toString
    public String toString (){
        return "Name: " + name + "\n" + "Age: " + age + "\n" + "Height: " + height + "\n" + "Nation:" + nation + "\n" + "Sex: " + sex;
    }
    // Статична функція
    public static void PersonInformation (String name, int age, String nation) {
        System.out.println("He/She is " + name);
        System.out.println("His/Her age is " + age);
        System.out.println("His/Her is " + nation);
    }
    // Статична функція
    public static String Recomendations (String name, int age, String nation) {
        return "Hello," + name + "!!!" +"\n" + "You're almost " + (age + 1) + "\n" + "I'm very happy that you are " + nation + "\n" + "See you soon)";
    }
    // Статична функція
    public static String True_False (boolean value) {
        if (value) {
            return "It's true!";
        }
        else {
            return "Ufortunately, but it's false!";
        }
    }



}
