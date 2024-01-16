public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        //System.out.println(capVowelsLowRest("Hello World"));
        //int[] result = allIndexOf("Hello world", 'l');
        //printArray(result);

    }
        
        

    public static String capVowelsLowRest (String string) {
        char[] result = new char[string.length()];
		
		for (int i = 0; i < string.length(); i++) {
            
            char ch = string.charAt(i); 

			if (isVowel(ch)) {
				result[i] = (char) (ch >= 'a' && ch <= 'z' ? ch - 'a' + 'A' : ch);	

			} else {
				result[i] = (char) (ch >= 'A' && ch <= 'Z' ? ch - 'A' + 'a' : ch);

			}
		}
    
        return new String(result);
    }

    public static boolean isVowel(char ch) {

        return "aeiouAEIOU".indexOf(ch) != -1;
    }



    public static String camelCase (String string) {
        boolean isCapital = false;
        boolean isFirst = false;
        String ans = "";

        for (int i = 0; i < string.length(); i++) {

            if(!isFirst && string.charAt(i) != ' ') {
                ans += isLower(string.charAt(i));
                isFirst = true;
                isCapital = false;

            }
            if (isCapital && string.charAt(i) != ' ') {
                ans += isUpper(string.charAt(i));
                isCapital = false;

            } else if (!isCapital && string.charAt(i) != ' ') {
                ans += isLower(string.charAt(i));

            }

            if ( string.charAt(i) == ' ') {
                isCapital = true;

            }

        }
            return ans;
        }
        
    public static char isLower(char ch) {
        if (ch >= 'A' && ch <= 'Z') {

            return (char) (ch - 'A' + 'a');

        } else {

            return (char) (ch);
        }
            
    } 

    public static char isUpper(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return (char) (ch - 'a' + 'A');
            
        } else {
            return (char) (ch);
        }
    }

    public static boolean isCapital (char ch) {
        return ch >= 'A' && ch <= 'Z';
    }

    public static int[] allIndexOf (String string, char chr) {
        int count = 0;

        for(int i = 0; i < string.length(); i++) {

            if (string.charAt(i) == chr) {

                count++;  
            }  
        }

        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < string.length(); i++) { 

            if (string.charAt(i) == chr) {
                result[index++] = i;
            }

        }

        return result;
    }

    //public static void printArray(int[] arr) {
        //System.out.print("{");
        //for (int i = 0; i < arr.length; i++) {
            //System.out.print(arr[i]);
            //if (i < arr.length - 1) {
                //System.out.print(", ");
            //}
        //}
        //System.out.println("}");
    //}

}

