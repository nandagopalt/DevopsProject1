import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Number2Words {
	 private final NumberWords numberWords;
	    private final BufferedReader reader;
	 
	    public Number2Words() { 
	        numberWords = new NumberWords();
	        reader = new BufferedReader(new InputStreamReader(System.in));
	    } 
	 
	    public void execute() { 
	        while (true) { 
	            try { 
	                System.out.print("\nPlease type a number between 1 and 999 OR (0 to exit) :  ");
	                String value = reader.readLine();
	                int number = Integer.parseInt(value);
	                if(number == 0) {
	                   	System.exit(0);
	                } else {
	                	String toWords = numberWords.toWords(number);
	                	System.out.println(toWords);
	                }
	                } catch (Exception e) {
	                System.out.println("Invalid number");
	            } 
	        } 
	    } 
	 
	    public static void main(String[] args) {
	        new Number2Words().execute(); 
	    	//String result = new Number2Words().new NumberWords().toWords(99);
	    	//System.out.println(result);
	    } 
	    
	    
	    public class NumberWords { 
	    	String result = "";
	        public String toWords(int number) {
	         if (number < 0) {
	                result = "Number out of range";
	            } else if(number == 0) {
	                result = "ZERO";
	            } else if(number >= 1000){
	                result = "Number not in range";
	            } else if (number > 0 && number <= 999) {
	                    result = numberToWord(((number / 100) % 10), " HUNDRED AND");
	                    result = result + numberToWord((number % 100), " ");
	            } 
	            
	            return result.trim();
	        } 
	     
	        public String numberToWord(int num, String val) {
	        	String retrunValue = "";
	            String ones[] = {" ", " ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN", " EIGHT", " NINE", " TEN", " ELEVEN", " TWELVE", " THIRTEEN", " FOURTEEN", " FIFTEEN", " SIXTEEN", " SEVENTEEN", " EIGHTEEN", " NINETEEN"
	                }; 
	                String tens[] = {" ", " ", " TWENTY", " THIRTY", " FOURTY", " FIFTY", " SIXTY", " SEVENTY", " EIGHTY", " NINETY"};
	                if (num > 19) {
	                	retrunValue = (tens[Math.round(num / 10)] + "" + ones[num % 10]);
	                } else { 
	                	retrunValue = (ones[num]);
	                } 
	                if (num > 0) {
	                	retrunValue += val;
	                } 
	                return retrunValue;
	            } 
	    } 
}
