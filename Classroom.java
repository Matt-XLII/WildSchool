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



