###### Single file example

//Hi.java

`class Hello{`
    `public static void main(String[] args){`
        `System.out.println("hello");`
    `}`
`}`

javac Hi.java
java Hello

###### FolderExample
folder:person
filename:Person.java
`    package person;
    public class Person {
           public static void main(String[] args) {
            System.out.println("THIS IS PERSON CLASS"); 
        }
    }`
javac -d . person/Person.java
java -classpath . person.Person
