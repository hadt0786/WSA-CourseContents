/*
 * Write a program that reads in a sentence from the user and
 *  prints it out with each word reversed, but with the words and punctuation in the original order: 
 */

public class WordReverse
 {
    public static void main(String[] args) 
	{
        
       		String sentence = "Wow! Emertxe.";
        	final int len = sentence.length();

        	char[] txt = new char[len];//create char array of length same as sentence

        	//check each character
        	for (int i = 0; i < len; ++i)
       		 {
         		char ch = sentence.charAt(i);
        		//checks whether character is letter
      			 if (Character.isLetter(ch)) 
       			 {
         			int pos = i;
         			//checks position of words
        			while (pos < len && Character.isLetter(sentence.charAt(pos)))
       				 ++pos;

        			//Reverse the words
       				 for (int beg = i, end = --pos; beg <= pos; beg++, end--)
       				 {
      				  txt[beg] = sentence.charAt(end);
        			 }

        			  //Reset the value of i
       				  i = pos;
        		}
        		else 
			{

       				 /*
       				 If the Character is not a letter, then copy the character into
        			the array at the same position for original order.
        			*/
        			txt[i] = ch;

        		}

        	 }

        		/* output the original text */
        		System.out.println("Original: " + sentence);

        		/* Output the array by creating new String */
        		System.out.println("Reversed: " + new String(txt));
        }
 }
