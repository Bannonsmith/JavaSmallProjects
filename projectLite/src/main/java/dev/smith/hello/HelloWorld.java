//This is the package in which our .java file exits.

/*
Multi Line Comment

This package declaration is needed for Java to compile and run (it needs to know where to find
information/logic/code about the HelloWorld Class)
 */

package dev.smith.hello;

/**
 * This is a java doc comment  - these wills show up when documentation is generated from this source code
 * */

public class HelloWorld {

    /*
    Since Java 6, all Java programs (that are not run inside of a container like Web Servlet Container) start
    and end with the main method.

    The class  containing the main method can have any name, but the method itself must always be named 'main'

        public: is a Java Access Modifier(Access Variable) - it means this main method can be accessed anywhere within
                the program's execution.
        static: is Java Keyword that means the method can be invoked/called/used without creating
                an instance of the class first (making it a global method)

        void: is a Java return type keyword that means this method does not return any values of any data type

     String[] args => 'args' is a variable the represents any arguments passed to the metohd
                        String[] 'String array' means this method can take any number of arguments as a array of String
     */

    public static void main(String[] args) {


        System.out.println("Hello World!");
        //System.out.println("Num args: " +  args.length);
    }

}
