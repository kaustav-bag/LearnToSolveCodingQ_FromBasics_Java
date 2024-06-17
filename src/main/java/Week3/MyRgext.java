package Week3;

public class MyRgext {

    class myRegex {
        String zeroTo255 = "([0-9]|[0-9][0-9]|(0|1)[0-9][0-9]|2[0-4][0-9]|25[0-5])";
        public String pattern = zeroTo255 + "." + zeroTo255 + "." + zeroTo255 + "." + zeroTo255; }
}
