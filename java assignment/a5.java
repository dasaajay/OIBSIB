class shape{
    void s1(){
        System.out.println("This is shape");
    }
}
class rectangle extends shape{
    void s2(){
        System.out.println("This is rectangular shape"); 
    }
}
class circle extends shape{
    void s3(){
        System.out.println("This is circular shape");  
    }
}
class square extends rectangle{
    void s4(){
        System.out.println("square is a rectangle"); 
    }
}
class a5{
    public static void main(String ar[]){
        square obj = new square();
        obj.s1();
        obj.s2();
    }
    }