package Switch;

public class SwitchExample02 {
    public static void main(String[] args) {
        System.out.println(getTranslationForDayOfWeek("Tuesday"));
        System.out.println(getTranslationForDayOfWeek("Friday"));
        System.out.println(getTranslationForDayOfWeek("Funday"));
    }

    public static String getTranslationForDayOfWeek(String en) {
        String pigLatin;
        en = en.toLowerCase();
        if(en.equals("monday"))
            pigLatin = "Ondaymay";
        else if(en.equals("tuesday"))
            pigLatin = "Uesdaytay";
        else if(en.equals("wednesday"))
            pigLatin = "Ednesdayway";
        else if(en.equals("thursday"))
            pigLatin = "Ursdaythay";
        else if(en.equals("friday"))
            pigLatin = "Idayfray";
        else if(en.equals("saturday"))
            pigLatin = "Aturdaysay";
        else if(en.equals("sunday"))
            pigLatin = "Undaysay";
        else
            pigLatin = "Invalid day of the week";
        return pigLatin;
    }
}
