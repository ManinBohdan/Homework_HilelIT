class main {


    public static void ABC (){
        System.out.println("Hello World!");
    }


    public static void main (String[] args) {
        // Створення об'єкту класу Man та запис його параметрів за допомогою конструктора
        Man Petro = new Man("Petro", 21, 180, "Ukrainian", "male");
        // Створення об'єкту класу Man за допомогою пустого конструктора
        Man Bohdan = new Man();
        // Запис параметрів об'єкта вручну
        Bohdan.setName("Bohdan");
        Bohdan.setAge(17);
        Bohdan.setAge(89);
        Bohdan.setHeight(176);
        Bohdan.setNation("Ukrainian");
        Bohdan.setSex("male");
        // Виклик функції виводу зображення у консоль, застосування методу toString до об'єкту Petro без перезаписування
        System.out.println(Petro.toString());
        // Виклик функції виводу зображення у консоль, застосування методу toString до об'єкту Petro з перезаписуванням
        System.out.println(Petro.toString(23, "Swiss"));
        // Виклик функції виводу зображення у консоль, застосування методу toString до об'єкту Bohdan без перезаписування
        System.out.println(Bohdan.toString());
        Petro.toString(22, "Ukraine");
        Petro.toString(25, "Ukraine");
        System.out.println(Bohdan.getAge());



        ABC();
    }
}
