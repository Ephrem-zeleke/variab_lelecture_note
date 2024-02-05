/**
 * using string method
 */


public class HelloString {
    public static void main(String[] args){
        // creating a variable that contain my name
        String name = "Ephrem";
        System.out.println(name);
        // changing my name to upper case
        System.out.println(name.toUpperCase());
        // creating another variable that contain the name of the course i am taking
        String className = "Java programming";
        // try to concatenate the two variables
        System.out.println("my name is " + name + " and i am taking " + className);
        // create another types of variable
        /* java can create different types of variable and the most commonly used are
        String, int and double
        strings used to store string(text) data and the data must always be in a double quote.
        unlike python single quote doesn't work
        whereas int variables are used to store a whole
        number data. double variables are used to store a floating point number or a decimal point
        number.
         */
        // creating an int variable
        int classCredit = 6;
        System.out.println(classCredit);
        // unlike python, in java we can concatenate string and int
        System.out.println(className + " is a " + classCredit + " credit hr course");
        // creating a double variable
        double todayTemp = 3.7;
        System.out.println("Today's temperature is " + todayTemp + "F");

        //escaping special character in string
        String thisClass = "Java programming";
        String classCode = "2545";
        String characters = "@%*!!#$^()";
        String Quote = "Java is to JavaScript as car is to carpet";
        String aStringWithANewline = "college = MCTC \n program = ITEC";
        String needEscape = "Tab \t double quote \" in this string";

        System.out.println(thisClass);
        System.out.println(classCode);
        System.out.println(characters);
        System.out.println(Quote);
        System.out.println(aStringWithANewline);
        System.out.println(needEscape);


    }
}
