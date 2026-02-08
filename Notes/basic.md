1. main method is static because jvm does not create  objects automatically. jvm cannot create objects for non static methods
    even though a class has default constructor jvm does not use constructors to start a program.

2. why String 'S' is caps and all int,float etc.. are Lower case?
    because String is a class and int,float are primitive data types, we use primitive datatypes for speed and memory efficient but String is immutable they methods etc...main important thing String stores sequence of characters which doesnt contain specific size.

    although we use primitive data types,when we need object creation for primitive there is a concept called WRAPPER CLASSES
    it stores primitives as objects which are helpful in Collections, and when u need to store no value in primitive java doesnt accpet it so wrapper allows to store no values as "null",main important thing is wrapper classes provide methods and utilites like Integer.MAX_VALUE etc..

    Primitives are not objects...collections need objects so we use Wrapper classes

3. Method Signature -  a method with parameter, no return type and order of parameter list matters,no access specifiers,no static and no final
    Example- int add(int a, int b) -> no,it is not a method signature
            void add(int a,int b) -> yes

4. when javac test.java is compiled ,java compiler creates a test.class file so during execution JVM loads the .class file and executes it
        important thing to notice here is...  .class file is just a bytecode file,memory is used only when jvm loads it
    if my test.java has 5 classes -> what does compiler do?
        java compiler creates 5 .class files separately because jvm loads .class file only when required this is called LAZY CLASS LOADING.
    what happens if 5 classes bundled in test.class -> jvm loads only required but now all classes will be load memory wasted,
        modifying one class leads to complexity in .class file due to bundled.


5.  y main(String[] args)?  and y not wrapper classes like main(Integer[] args) ? 
    because when u write this main(Integer[] args) and compile java file, it compiles without errors,but when u run java test it will give an error that main method not found
        we will run with a command "java test" so it takes this command as String. JVM does NOT interpret, parse, or convert command-line arguments.
        example-  public class Zoo {
                    public static void main(String[] args) {
                    System.out.println(args[0]);
                    System.out.println(args[1]);
                    } }   
                    javac Zoo.java 
                     java Zoo Bronx Zoo

                     Output: Bronx
                            Zoo