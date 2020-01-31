
package human;


public class Human {
private String skin_color = "fair";
private String eye_color = "blue";
private String gender = "male";
private int height = 189;
private int weight = 55;
private int age = 20;
private String race = "Asian";
private String name = "Jimmy";
    
    public static void main(String[] args) {
    Human b = new Human ();
    System.out.println(b.skin_color);
    System.out.println(b.eye_color);
    System.out.println(b.gender);
    System.out.println(b.height);
    System.out.println(b.weight);
    System.out.println(b.age);
    System.out.println(b.race);
    System.out.println(b.name);
    
    Child a = new Child();
    System.out.println(a.intelligence_rating);
    System.out.println(a.mood_rating);
    System.out.println(a.genetic_diseases);
    System.out.println(a.wealth_rating);
    }
    
}
