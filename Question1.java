import java.util.* ;
import java.io.* ;

/**
 * Question1 object loads a file and prints out each line with the line number and number of characters in each line excluding empty spaces.
 * @author Tumelo Lephadi
 * @version 25/09/2015
 */
 
public class Question1
{
   /**
    * Loads data from file and prints out each line with the line number and number of characters in each line excluding empty spaces.
    */
    
   public static void main ( String [] args )
   {
      try
      {
         LinkedList <String> words = new LinkedList <String> () ;  
         BufferedReader buffer = new BufferedReader (new FileReader ( args [ 0 ] ) ) ;        
         String line ;        
         line = buffer.readLine () ;
      
         while (line != null ) 
         {
            words.add ( line ) ;
            line = buffer.readLine () ;
         }
         buffer.close () ;
         
         for ( int i = 0; i < words.size() ; i ++ )
         {
            System.out.println ( i + 1 + "/" + words.get ( i ).replaceAll ( "\\s", "" ).length ( ) + ": " + words.get ( i ) ) ;
         }
      }
      
      /**
       * Exit program if error is found.
       */
       
      catch ( Exception exception )
      {
         System.exit ( 0 ) ;
      }      
   }
}