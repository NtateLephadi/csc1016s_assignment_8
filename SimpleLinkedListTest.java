import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * SimpleLinkedListTest object tests methods in SimpleLinkedList object. 
 * @author Tumelo Lephadi
 * @version 25/09/2015
 */

public class SimpleLinkedListTest 
{ 
   /**
    * Tests if constructor returns linked list with all elements passed as parameters.
    */
      
   @Test
   public void TestConstructor()
   {
      String [] fruit = { "apples", "bananas", "cherrys" } ;
      SimpleLinkedList<String> simpleLinkedList = new SimpleLinkedList<String> ( fruit ) ;
      for ( int i = 0; i < simpleLinkedList.size(); i ++ )
      {
         assertEquals ( fruit[ i ], simpleLinkedList.get(i).toString() ) ; 
      }
   }
   /**
    * Tests if indexOf method returns correct index of element in LinkedList<T>.
    */
    
   @Test
   public void TestIndexOf()
   {
      String [] fruit = { "apples", "bananas", "cherrys" } ;
      SimpleLinkedList<String> simpleLinkedList = new SimpleLinkedList<String> ( fruit ) ;
      for ( int i = 0; i < simpleLinkedList.size(); i ++ )
      {
         assertEquals ( i, simpleLinkedList.indexOf( simpleLinkedList.get(i) ) ) ; 
      }
   }
   
   /**
    * Tests if insert() method inserts element into LinkedList<T> at desired positions.
    */
    
   @Test
   public void TestInsert()
   {
      String [] fruit = { "apples", "bananas", "cherrys" } ;
      SimpleLinkedList<String> simpleLinkedList = new SimpleLinkedList<String> ( fruit ) ;
      simpleLinkedList.insert ( 1, "date" ) ;
      assertEquals ( 1, simpleLinkedList.indexOf ( "date" ) ) ;
      assertEquals ( "date", simpleLinkedList.get ( 1 ) ) ; 
   }
   
   /**
    * Tests if trimToSize( int i ) method trims LinkedList<T> to desired size.
    */
    
   @Test
   public void TestTrimToSize()
   {
      String [] fruit = { "apples", "bananas", "cherrys" } ;
      SimpleLinkedList<String> simpleLinkedList = new SimpleLinkedList<String> ( fruit ) ;
      simpleLinkedList.trimToSize ( 1 ) ;
      assertEquals ( 1, simpleLinkedList.size() ) ;
   }
}