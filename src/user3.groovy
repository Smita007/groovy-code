/**
 * Created by smita on 8/6/16.
 */
class Person {
    int c = 13
    String hello(int a, int b){
        println a
        println b
        println c
    }
    String hello(int a, int b, int c){

    }
}

Person u = new Person()
u.hello(14,15)
try {
    u.hello("dgfgt", false)
}
catch(MissingMethodException){
    println "hello"
}
u.hello(14, 23)