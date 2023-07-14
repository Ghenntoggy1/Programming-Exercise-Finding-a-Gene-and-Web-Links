public class Part3 {
    public Boolean twoOccurrences (String stringa, String stringb) {
        int firstOccur = stringb.indexOf(stringa);
        if (firstOccur == -1) {
            return false;
        }
        else {
            int secondOccur = stringb.indexOf(stringa, firstOccur + 1);
            if (secondOccur == -1) {
                return false;
            }
            else {
                return true;
            }
        }
    }
    
    public String lastPart (String stringa, String stringb) {
        int occur = stringb.indexOf(stringa);
        if (occur == -1) {
            return stringb;
        }
        else {
            return stringb.substring(occur + stringa.length());
        }
    }
    
    public void testing () {
        String stringFull = "A story by Abby Long";  // valid 2 of by
        String stringSub = "by";
        Boolean result = twoOccurrences(stringSub, stringFull);
        System.out.println(stringSub + " in " + stringFull + " " + result);
        
        stringFull = "carcar";  // valid 3 of car
        stringSub = "car";
        result = twoOccurrences(stringSub, stringFull);
        System.out.println(stringSub + " in " + stringFull + " " + result);
        
        stringFull = "banana";  // valid 3 of a
        stringSub = "a";
        result = twoOccurrences(stringSub, stringFull);
        System.out.println(stringSub + " in " + stringFull + " " + result);
        
        stringFull = "anamaria";  // invalid 0 of a
        stringSub = "b";
        result = twoOccurrences(stringSub, stringFull);
        System.out.println(stringSub + " in " + stringFull + " " + result);
        
        stringFull = "ctgtatgta";  // invalid 1 of a
        stringSub = "atg";
        result = twoOccurrences(stringSub, stringFull);
        System.out.println(stringSub + " in " + stringFull + " " + result);
        
        System.out.println("=====================================================");
        
        stringFull = "banana";  // valid
        stringSub = "an";
        String result2 = lastPart(stringSub, stringFull);
        System.out.println("The part of the string after " + stringSub + " in " + stringFull + " is " + result2 + ".");
        
        stringFull = "forest";  // invalid
        stringSub = "zoo";
        result2 = lastPart(stringSub, stringFull);
        System.out.println("The part of the string after " + stringSub + " in " + stringFull + " is " + result2 + ".");
        
        stringFull = "forest";  // invalid
        stringSub = "est";
        result2 = lastPart(stringSub, stringFull);
        System.out.println("The part of the string after " + stringSub + " in " + stringFull + " is " + result2 + ".");
    
    }
}
