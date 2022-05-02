class main {


    public static void main (String[] args) {
        // Створення об'єкту класу Man та запис його параметрів за допомогою конструктора
        Man Petro = new Man("Petro", 21, 180, "Ukrainian", "male");
        // Створення об'єкту класу Man за допомогою пустого конструктора
        Man Bohdan = new Man();
        // Bohdan.height = 175;

        // Виклик функції виводу зображення у консоль, застосування методу toString до об'єкту Petro без перезаписування
        System.out.println(Petro.toString());
        // Виклик функції виводу зображення у консоль, застосування методу toString до об'єкту Petro з перезаписуванням
        System.out.println(Petro.toString(23, "Swiss"));
        // Виклик функції виводу зображення у консоль, застосування методу toString до об'єкту Bohdan без перезаписування
        System.out.println(Bohdan.toString());


        Man.PersonInformation("Bohdan", 17, "Ukrainian");
        System.out.println(Man.Recomendations("Bohdan", 17, "Ukrainian"));
        System.out.println(Man.True_False(true));







    }
}
