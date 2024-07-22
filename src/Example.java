public class Example {
    void findNemo(String[] array) {
        for (String s : array) {
            if (s.equals("nemo")) {
                System.out.println(" Found Nemo!");
                break;
            }
        }
    }

    public static void main ( String[] args ) {
        Example example = new Example();
        String[] arrayToSearch = {"nemo ", "dory", "marlin"};
        example.findNemo(arrayToSearch);
    }
}
