public class task {
    public static void main(String[] args) {
        int sec = 3664;
        int hour = sec / 3600;
        int min = (sec%3600) / 60;
        int remsec = (sec%3600) % 60;

        System.out.println(hour + " hour " + min + " min " + remsec + " sec ");
    }

    
}
