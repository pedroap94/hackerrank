package easy;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class BufferedReader {
    public static void main(String[] args) throws IOException{
        java.io.BufferedReader bf = new java.io.BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine().trim());;

        int count = 0;
        while(count < 10){
            System.out.println(N + " x " + (count+1) + " = " + N*(count+1));
            count++;
        }

    }
}
