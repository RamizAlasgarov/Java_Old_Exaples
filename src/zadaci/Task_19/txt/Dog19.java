package zadaci.Task_19.txt;
//Бизнес требования:
//        - Должна быть возможность указывать возраст собаки.
//        - Возраст указывается в годах (целым числом).
//        - Возраст собаке дают в момент создания.
//        - Собака должна уметь выполнять команду голос (voice()),
//        при выполнении этой команды на консоль должно выводиться
//        кличка собаки и ее возраст.

public class Dog19 {
    int age = 3;


    public void voice(){
        System.out.println("My name is Lucky " + "and my age is "+ age);
    }
}