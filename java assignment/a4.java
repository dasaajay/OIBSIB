class program4{
void calArea(int radius,double pie){
System.out.println("the area of a circle is:" +(pie*(radius*radius)));
}
void calArea(int len,int breadth){
System.out.println("the area of a rectangle is:" +(len*breadth));
}
}
class a4{
public static void main(String ar[]){
program4 ob = new program4();
ob.calArea(4,3.14);
ob.calArea(3,4);
}
}
