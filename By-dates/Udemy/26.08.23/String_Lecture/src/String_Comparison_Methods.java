public class String_Comparison_Methods {
    public static void main(String[] args) {
        //contains,endsWith,startsWith,regionMatches
        String helloWorld = "Hello World";
        String helloWorldLower = helloWorld.toLowerCase();
        if(helloWorld.equals(helloWorldLower)){
            System.out.println("Values Match exactly");
        }
        if(helloWorld.equalsIgnoreCase(helloWorldLower)){
            System.out.println("Values Match ignoring case");
        }
        if(helloWorld.startsWith("Hello")){
            System.out.println("Starts with Hello");
        }
        if(helloWorld.endsWith("World")){
            System.out.println("String ends with World");
        }
        if(helloWorld.contains("World")){
            System.out.println("String contains World");
        }

        if(helloWorld.contentEquals("Hello World")){
            System.out.println("Match");
        }
    }
}
