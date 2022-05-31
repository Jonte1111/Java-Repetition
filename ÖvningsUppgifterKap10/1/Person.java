public class Person {
    private String name;
    private String adress;
    private int age;
    public Person(String name, String adress, int age) {
            this.name = name;
            this.adress = adress;
            this.age = age;
   } 
   public String getName() {
       return this.name;
   }
    public String getAdress() {
       return this.adress;
   }
    public int getAge() {
       return this.age;
   }
   public void adultOrNot() {
       if(this.age >= 18)
            System.out.println("Adult");
        else    
            System.out.println("Child");
   }
}
