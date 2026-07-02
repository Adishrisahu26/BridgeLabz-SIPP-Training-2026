interface Worker{

    void performDuties();
}

class Person{

    String name;

    Person(String name){

        this.name=name;
    }
}

class Chef extends Person implements Worker{

    Chef(String name){

        super(name);
    }

    public void performDuties(){

        System.out.println(name+" is Cooking");
    }
}

class Waiter extends Person implements Worker{

    Waiter(String name){

        super(name);
    }

    public void performDuties(){

        System.out.println(name+" is Serving Food");
    }
}

public class Main{

    public static void main(String args[]){

        Chef c=new Chef("Rahul");

        Waiter w=new Waiter("Aman");

        c.performDuties();

        w.performDuties();
    }
}