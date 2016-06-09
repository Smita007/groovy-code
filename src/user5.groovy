/**
 * Created by smita on 8/6/16.
 */
class Person2 {
    String firstName
    String lastName
    String Email
    int age

    String toString(){
        return "${firstName} ${lastName} ${age}"
    }
}
Map m1=[firstName: "Smita", lastName: "Pallem", Email:"smita.pallem7@gmail.com", age:21]
Map m2=[firstName: "Shubham", lastName: "Jain", Email:"vfvfdvfdfd@gmail.com", age:21]
Map m3=[firstName: "Sagar", lastName: "Jain", Email:"dfgfdgfd@gmail.com", age:21]
Map m4=[firstName: "Priyal", lastName: "Singhal", Email:"ffdbfd@gmail.com", age:21]
Map m5=[firstName: "Praveen", lastName: "Tehalyani", Email:"fdgfdbfd@gmail.com", age:21]

Person2 p1=new Person2(m1)
Person2 p2=new Person2(m2)
Person2 p3=new Person2(m3)
Person2 p4=new Person2(m4)
Person2 p5=new Person2(m5)

List a = [p1, p2, p3, p4, p5]
a.each{
    println "${it.firstName} ${it.lastName} (${it.age})"
}

