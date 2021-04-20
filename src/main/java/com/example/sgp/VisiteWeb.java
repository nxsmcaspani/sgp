package com.example.sgp;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class VisiteWeb {
    private String id;
    private String chemin;
    private int tempsExecution;

    public VisiteWeb(String chemin, int tempsExecution) {
        this.id = DateTimeFormatter.ofPattern("yMdHmsS").format(ZonedDateTime.now());
        this.chemin = chemin;
        this.tempsExecution = tempsExecution;
    }

    public String getChemin() {
        return chemin;
    }

    public int getTempsExecution() {
        return tempsExecution;
    }

}
