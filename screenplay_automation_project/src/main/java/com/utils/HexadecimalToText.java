package com.utils;

public class HexadecimalToText {
    // Convertir código hexadecimal a cadena
    public static String toStringHex(String s) {
        byte[] baKeyword = new byte[s.length()/2];
        for(int i = 0; i < baKeyword.length; i++) {
            try {
                baKeyword[i] = (byte)(0xff & Integer.parseInt(s.substring(i*2, i*2+2),16));
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
        try {
            s = new String(baKeyword, "utf-8");//UTF-16le:Not
        }
        catch (Exception e1) {
            e1.printStackTrace();
        }
        System.out.println("CONTRASENAAAAAA: --> "+s);
        return s;
    }
}
