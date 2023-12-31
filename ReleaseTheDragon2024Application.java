package com.example.release_the_dragon_2024;

import org.springframework.context.annotation.Configuration;

import java.sql.SQLOutput;

@Configuration
public class ReleaseTheDragon2024Application {
    public static void main(String[] args) {
        Dragon dragon1 = new Dragon("Farid_Tahmazov_CodeIcon");
        Dragon dragon2 = new Dragon("Elcan_Mentor_GoogleMaster");
        System.out.println(Dragon.activation("Farid_Tahmazov_CodeIcon", "Farid_Tahmazov_CodeIcon"));
        System.out.println(Dragon.activation("Elcan_Mentor_GoogleMaster", "Elcan_Mentor_GoogleMaster"));
        System.out.println("Happy New 2024 Dragon Year! I am proud of you!");
    }
    private static class Dragon {
        //Default Dragon Values
        final Long health = Long.MAX_VALUE;
        final Long wealth = Long.MAX_VALUE;
        final Long luck = Long.MAX_VALUE;
        Boolean THIRD_EYE_IS_ON = Boolean.TRUE;//once is ON, cannot be OFF.
        private static String fullname = null;//Nobody Knows

        Dragon(String input) {
            this.fullname = input;
        } //Initialization

        public static Dragon activation(String input, String fullname) {
            if (input.equalsIgnoreCase(fullname)) {
                return new Dragon(input);
            } else {
                return null;
            }
        } // Authentication
    }
}

