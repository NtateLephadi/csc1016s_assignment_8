import java.util.* ;
import java.io.* ;

/**
 * Question2 object loads a file and prints out each line in ascending order according to the line length 
 * with the line number and number of characters in each line excluding empty spaces.
 * @author Tumelo Lephadi
 * @version 25/09/2015
 */

public class Question2 implements Comparator<String>
{
   
   /**
    * Loads a file and prints out each line in ascending order according to the line length 
    * with the line number and number of characters in each line excluding empty spaces.
    */
   public int compare ( String first, String second )
   {
      int strings = 0;
      if ( first.length() == second.length() )
      {
         strings = 0 ;
      }
      else if ( first.length() > second.length() )
      {
         strings = 1 ;
      } 
      else
      {
         strings = -1 ; 
      }
      return strings ;
   }
    
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
         
         Collections.sort( words, new Question2() ) ;
                    
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