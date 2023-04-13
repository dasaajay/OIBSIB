class student{
     String str;
    String name;
  public student(String str){
      name = str;
  }
  public student()
  {
      name = "unknown";
  }
}
class a3{
    public static void main(String[] args) {
        student ob = new student();
        ob.str = "ajay";
        System.out.println(ob.str);
        System.out.println(ob.name);

    }
}