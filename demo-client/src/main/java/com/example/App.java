package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            Socket s = new Socket("127.0.0.1", 42069); 
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            ObjectMapper om = new ObjectMapper();

            String result = in.readLine();
            Class classe1 = om.readValue(result, Class.class);

            System.out.println(classe1.getStudents().get(0).getName());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
