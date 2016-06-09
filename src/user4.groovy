/**
 * Created by smita on 8/6/16.
 */
class Person1 {
    String firstName
    String lastName
    String a
    String b
    float c
    int score
}

Map n = [firstName: "hello", lastName: "bolo", score: 3, a: 2, b: 3, c: 2.3]
Person1 u=new Person1(n)
println u.firstName
println u.lastName
println u.a
println u.b
println u.c
println u.score