package com.develogical.app;

public class QueryProcessor {
    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "R Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.toLowerCase().contains("javier")) {
            return "Javier is an " +
                    "Spanish poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the Spanish language and the world's pre-eminent dramatist.";
        } else if (query.toLowerCase().contains("rubhan")) {
            return "Xavier is an " +
                    "Indian poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the Indian language and the world's pre-eminent dramatist.";
        }
        return "";

    }
}
