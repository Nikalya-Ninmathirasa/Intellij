public class AppForm {

    String name;
    int rollno;


     void display() {
        System.out.println(name);
        System.out.println(rollno);

    }

    public static void main (String[] args) {

        AppForm obj = new AppForm();
        obj.name = "Joe";
        obj.rollno = 1001;

        obj.display();

        App2 obj2 = new App2();
        obj2.add();

    }

}

class App2 {
    int a =10;
    int b =15;

     void add() {


         int c=a+b;
        System.out.println(c);


    }


}

