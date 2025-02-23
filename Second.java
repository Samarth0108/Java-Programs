interface First{
    default void display(){
        System.out.println("I am into interface");
    }
}

class Second implements First{
    public static void main(String args[]){
        System.out.println("I am into class.");
        First f = new Second();
        f.display();
    }
}