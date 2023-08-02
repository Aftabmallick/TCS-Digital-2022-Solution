public class a_coding_competition
{
    
	public static void main(String[] args) {
        int p1 = 30;
        int p2 = 26;
        int p3 = 28;
        int q  = 14;
        int e  = 345;   // No of Employee
        int r  = 43;    // No of Employee not participated 
        int a  = (e-r+2*q-p1-p2-p3); //2.How many employees have solved exactly one of the 3 problems?
        int b  = a/3+p1+p3-q;        //1.How many employees have solved the first problem?
		
		
		System.out.println(b+"\n"+a);
	}
}
