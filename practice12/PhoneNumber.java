package ru.mirea.practice12;

public class PhoneNumber {
    private String number;
    private String countryCode;
    PhoneNumber(String str){
        this.number=getNumberFromString(str);
    }

    public String getNumberFromString(String str) {
       if (str.charAt(0)=='+') countryCode=str.substring(1,str.length()-10);
       else countryCode=str.substring(0,str.length()-10);
       int k=countryCode.length();
        str="+"+countryCode+str.substring(k,k+3)+"-"+str.substring(k+3,k+6)+"-"+str.substring(k+6,k+10);
        return str;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "number='" + number+"}";
    }

    public static void main(String[] args) {
        String str1="+104289652211";
        PhoneNumber num1=new PhoneNumber(str1);
        System.out.println(num1);
        String str2="89175655655";
        PhoneNumber num2=new PhoneNumber(str2);
        System.out.println(num2);
    }
}
