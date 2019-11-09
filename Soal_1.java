public class Soal_1 {

    public static String nama;
    public static int umur;

    public static void main(String[] args) {

        nama = "naufal";
        umur = 24;
        String output = function(nama, umur);
        System.out.println(output);

    }

    private static String function(String nama, int umur) {

        String text = "{\"name\":" + "\"" + nama + "\"" + ","
                + "\"age\":" + umur +  ","
                + "\"address\":" + "Cimahi" +  ","
                + "\"hobbies\":" + "[\"belajar\",\"bermain\"]" +  ","
                + "\"is_married\":" + "false" +  ","
                + "\"list_school\":" +
                "[{\"name\":\"ITB\",\"year_in\":"+ 2014 +",\"year_out\":"+ 2019 + ",\"major\":\"Physics\"}," +
                "{\"name\":\"SMAN 3 Bandung\",\"year_in\":"+ 2011 +",\"year_out\":"+ 2014 + ",\"major\":" + "\"IPA\"" + "}]" +  ","
                + "\"skills\":" +
                "[{\"skill_name\":\"java\",\"level\":\"beginner\"}," +
                "{\"skill_name\":\"android studio\",\"level\":\"beginner\"}]" +  ","
                + "\"interest_in_coding\":" + "true" +  ","
                + "}";

        return text;
    }
}
