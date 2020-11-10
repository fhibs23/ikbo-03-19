package ru.mirea.practice12;

import java.util.StringTokenizer;

public class Address {
    private String country,region,city,street,house,corpus,flat;

    Address(String str){
        String[] arr=new String[10];
        int i=0;
        str=str.replace(" ","");
        /*String[] split=str.split(",");
        for (String spl: split){
            arr[i]=spl;
            i++;
        }*/ //task a)
        StringTokenizer st = new StringTokenizer(str, ",.;-");
        while (st.hasMoreTokens()) {
            arr[i] = st.nextToken();
            i++;
        }
        this.country=arr[0];
        this.region=arr[1];
        this.city=arr[2];
        this.street=arr[3];
        this.house=arr[4];
        this.corpus=arr[5];
        this.flat=arr[6];
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", corpus='" + corpus + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }
    public static void main(String[] args) {
        String str1="Russia, moscow, Moscow, friendship, 23, 5A, 4";
        String str2="England.London.London.Baker.9.2.12";
        String str3="USA;Washington;Washington;Truth;7;1L;11";
        String str4="China-Huan-HongKong-Freedom-2-8C-88";
        Address address=new Address(str1);
        System.out.println(address);
        address=new Address(str2);
        System.out.println(address);
        address=new Address(str3);
        System.out.println(address);
        address=new Address(str4);
        System.out.println(address);
    }
}
