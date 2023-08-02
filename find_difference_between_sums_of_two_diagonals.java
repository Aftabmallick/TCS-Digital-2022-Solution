import java.util.*;
public class find_difference_between_sums_of_two_diagonals
{
    
    public static int calculate(int a[][]){
        int ca=0,c=0;
		for(int i=0;i<a.length;i++){
		    ca+=a[i][i];
		}
		for(int i=0;i<a.length;i++){			//Time Complexity O(n)
		    c+=a[i][a.length-i-1];
		}
		int d=Math.abs(c-ca);
		return d;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int row = sc.nextInt();
	    int col = sc.nextInt();
		int a[][]= new int[row][col];
		for(int i=0;i<row;i++){
		    for(int j=0;j<col;j++){
		        a[i][j]=sc.nextInt();
		    }
		}
		
		System.out.println(calculate(a));
	}
}




/*import java.util.*;
public class find_difference_between_sums_of_two_diagonals
{
    
    public static int calculate(int a[][]){
        int ca=0,c=0;
		for(int i=0;i<a.length;i++){
		    for(int j=0;j<a[0].length;j++){
		        if(i==j)
		            c+=a[i][j];			//Time Complexity O(n^2)
		        if(i==a[0].length-j-1)
		            ca+=a[i][j];
		    }
		}
		int d=Math.abs(c-ca);
		return d;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int row = sc.nextInt();
	    int col = sc.nextInt();
		int a[][]= new int[row][col];
		for(int i=0;i<row;i++){
		    for(int j=0;j<col;j++){
		        a[i][j]=sc.nextInt();
		    }
		}
		
		System.out.println(calculate(a));
	}
}*/
