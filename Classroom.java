public class Classroom {
public static void main(String[] args) {
Wilder Matt = new Wilder("Matt", true);
Wilder JeanClaude = new Wilder("Jean-Claude", false);
Wilder Bryce = new Wilder("Bryce", true);

System.out.println(Matt.whoAmI());
System.out.println(JeanClaude.whoAmI());
System.out.println(Bryce.whoAmI());
JeanClaude.setAware(true);
System.out.println(JeanClaude.whoAmI());
Bryce.setAware(false);
System.out.println(Bryce.whoAmI());

}

}

class Wilder{
    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware){
        this.firstname = firstname;
        this.aware = aware;
    }

    public String getFirstname(){
        return this.firstname;
    }

    public boolean isAware(){
        return this.aware;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public void setAware(boolean aware){
        this.aware = aware;
        if (aware == true){
        System.out.println(this.getFirstname() + " est aware");
        } else {
            System.out.println(this.getFirstname() + " n'est pas aware");
    }}

    public String whoAmI(){
        if (this.aware == true){
            return "Je m'appelle " + this.firstname + " et je suis aware";
        } else {
            return "Je m'appelle " + this.firstname + " et je ne suis pas aware";
        }
    }

    
}

