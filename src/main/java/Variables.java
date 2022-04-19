public class Variables {
    public static void main(String[] agrs){
        byte age = 30;
        age = 35;
        System.out.println(age);
        //never run the same variable on the same line even though you can
        byte temperature = 20;
        System.out.println(temperature);
        // be careful how you name things
        byte myAge = 30;
        byte herAge = myAge;
        System.out.println(herAge);
        //use byte because you don't need that much memory to store someone's age
        // Java always sees values as integers add (L) to indicate long
        long viewsCount = 3_123_456_789L;// underscore makes numbers readable
        float price = 10.99F; // java defaults to double add F to consider float
        char letter = 'A'; // Always use single quotes for single numbers double quotes are for Strings
        boolean isEligible = true; //boolean can be true or false
        //words in orange are keywords used in java

    }
}