//prime no or not
class Prime
{
    private int num;
    void checkPrime(int num){
        int i,flag=0;
        for(i=2;i<num/2;i++)
        {
            if(num%i==0)
            {
                flag++; 
            }
        }
        if(flag!=0)
            System.out.println("It's not a prime no ");
        else
            System.out.println("It's a prime no ");
    }
}
class Main
{
	public static void main(String[] args) {
	    Prime obj= new Prime();
	    obj.checkPrime(65);
		
	}
}
