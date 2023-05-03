//Sum of two complex no in java
class Complex{
    double real;
    double img;
    Complex(){
    }
    Complex(double real, double img){
        this.real=real;
        this.img=img;
    } 
    Complex addComplex(Complex ob){
        Complex temp= new Complex();
        temp.real=real+ob.real;
        temp.img=img+ob.img;
        return temp;
    }
}
class Main
{
	public static void main(String[] args) {
		Complex c1= new Complex(4,3);
		Complex c2= new Complex(5,7);
		Complex c3= new Complex();
		c3=c2.addComplex(c1);
		System.out.println(c3.real+"+ i "+c3.img);
		
	}
}
