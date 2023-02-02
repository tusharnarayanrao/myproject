package multiplication_without_using_operator;

public class Factorial_ 
{   public static void main(String[] args) {
	

	int num =4 ;
	int  fact = 1 ;
	
	for(int i = num ; i >=1 ;i --)
	{
		fact =fact*i ;
		
	}
	System.out.println(fact);

}
}