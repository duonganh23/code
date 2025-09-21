public class example {
    // Java program to print Identity Matrix
class GFG {
    
    static int identity(int num)
    {
        int row, col;
        
        for (row = 0; row < num; row++)
        {
            for (col = 0; col < num; col++)
            {
                // Checking if row is equal to column 
                if (row == col)
                    System.out.print( 1+" ");
                else
                    System.out.print( 0+" ");
            } 
            System.out.println();
        }
        return 0;
    }
    
    // Driver Code
    public static void main(String args[])
    {
        int size = 5;
        identity(size);
    }
}

/*This code is contributed by Nikita tiwari.*/
}
