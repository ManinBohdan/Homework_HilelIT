    // Клас Man
public class Man {
    // Поля
   private   String name;
        private   Integer age;
        private   int height;
        private   String nation;
        private   String sex;
        private Boolean number;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public String getNation() {
            return nation;
        }

        public void setNation(String nation) {
            this.nation = nation;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }



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



    // Точка входу у програму

}
