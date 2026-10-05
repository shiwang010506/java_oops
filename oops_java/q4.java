//Write a Java program to demonstrate how super is used to invoke a parent class constructor
class parent{
 
    parent()
    {
     System.out.println("Parent Constructor");
    }
}
class child extends parent{
    child() {
        super();
        System.out.println("child constructor");
    }
}
class q4{
    public static void main(String[] args){
        child c1 = new child();
      
    }
}
