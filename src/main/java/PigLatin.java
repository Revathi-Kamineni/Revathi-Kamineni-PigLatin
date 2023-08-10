
public class PigLatin {
    /**
     * Pig latin works as follows: every word has its first character moved to the end, and 'ay' is added to the end of the
     * word.
     *
     *     example:
     *     word = ordway
     *     pig = igpay
     *     latin = atinlay
     *
     * Take in a word and return the pig latin form. You will need to use the substring method of String to break
     * up the string.
     * String docs: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     *
     * @param in A string.
     * @return the pig latin form of in.
     */
    public String returnPigLatin(String in){
/*
        String newString = in.substring(1);
        newString = newString +in.substring(0,1)+"ay";
        return newString;
        */
        int flag=0;
        String piglatin="";
        for(int i=0;i<in.length();i++)
        {
            char x=in.charAt(i);
            if(x=='a' || x=='e' || x=='i' || x=='o' ||x=='u')
            {
                piglatin=in.substring(i)+in.substring(0,i)+"ay";
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            piglatin=in+"ay";
        }
        return piglatin;
    }
}
