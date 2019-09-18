
public class ForLoops
{
    public static void main ( String args[] ) {
       //Fun little initial statement
       System.out.println();
       System.out.println("Be prepared! There is a lot of work below. I have labeled each section with a respective title to make it easier to read.");
       System.out.println("-Harnoor Sodhi");
       System.out.println();
       System.out.println();
       
                
        
       //New program (Cube)
       System.out.println();
       System.out.println("CUBE PROGRAM");
       int cube;
       System.out.println("i\tcube i"); 
       
       cube = 1;
       for (int i = 1; i <= 10; i++) {
           cube = i*i*i;
           System.out.println (i + "\t" + cube);
        }
       
        
       
        
       //New program (Consecutive Numbers) 
       System.out.println ();
       System.out.println("CONSECUTIVE ODD NUMBERS PROGRAM");
       int consecutive;
       System.out.print ("Consecutive odd numbers [99 to 1 inclusive]");
       System.out.println();
       
       consecutive= 0;
       for (int j=99; j>=1; j=j-2) {
           consecutive = j;
           System.out.println(consecutive);
        }
       
       
        
       //New Program (String) 
       System.out.println ();
       System.out.println ("STRING PROGRAM");        
       String a=  "The quick brown fox jumped over the lazy dog";
       int n = a.length();
       
       a.charAt(0);
       for (int p =0; p< a.length(); p++){
           System.out.println(a.charAt(p));
        }
       
        
        
        
       //Fun little ending statement             
       System.out.println();    
       System.out.println();    
       System.out.println("Be prepared! There is a lot of work above. I have labeled each section with a respective title to make it easier to read.");
       System.out.println("-Harnoor Sodhi");
           
      
       
       
       
    }
}
