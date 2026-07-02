class Course{

    String courseName;
    int duration;

    Course(String name,int duration){

        courseName=name;
        this.duration=duration;
    }
}

class OnlineCourse extends Course{

    String platform;
    boolean isRecorded;

    OnlineCourse(String name,int duration,String platform,boolean recorded){

        super(name,duration);

        this.platform=platform;

        isRecorded=recorded;
    }
}

class PaidOnlineCourse extends OnlineCourse{

    double fee;
    double discount;

    PaidOnlineCourse(String name,int duration,String platform,boolean recorded,double fee,double discount){

        super(name,duration,platform,recorded);

        this.fee=fee;
        this.discount=discount;
    }

    void display(){

        System.out.println(courseName);

        System.out.println("Fee : "+fee);

        System.out.println("Discount : "+discount);
    }

    public static void main(String args[]){

        PaidOnlineCourse p=new PaidOnlineCourse("Java",60,"Udemy",true,5000,20);

        p.display();
    }
}