package com.myworkz.java_features.encode_decode;

import java.util.Base64;

public class EncodeDecodeExecutor {
    public static void main(String[] args) {
        Base64.Encoder encoder2 = Base64.getEncoder();
        String str = encoder2.encodeToString("JavaTpoint".getBytes());
        System.out.println("Encoded string: "+str);

        Base64.Decoder decoder2 = Base64.getDecoder();
        String dStr2 = new String(decoder2.decode(str));
        System.out.println("Decoded string: "+dStr2);

        System.out.println();

        Base64.Encoder encoder = Base64.getMimeEncoder();
        String message = "Hello, You are informed regarding your inconsistency of work";
        String eStr = encoder.encodeToString(message.getBytes());
        System.out.println("Encoded MIME message: "+eStr);

        Base64.Decoder decoder = Base64.getMimeDecoder();
        String dStr = new String(decoder.decode(eStr));
        System.out.println("Decoded message: "+dStr);

        System.out.println();

        Base64.Encoder encoder1 = Base64.getUrlEncoder();
        String eStr1 = encoder1.encodeToString("http://www.javatpoint.com/java-tutorial/".getBytes());
        System.out.println("Encoded URL: "+eStr1);

        Base64.Decoder decoder1 = Base64.getUrlDecoder();
        String dStr1 = new String(decoder1.decode(eStr1));
        System.out.println("Decoded URL: "+dStr1);
    }
}
