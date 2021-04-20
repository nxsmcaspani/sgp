package com.example.sgp;

import java.util.ArrayList;
import java.util.List;

public class VisiteWebService {
    List<VisiteWeb> listeVisites = new ArrayList<>();

    public List<VisiteWeb> listerVisites() {
        return listeVisites;
    }

    public void sauvegarderVisite(VisiteWeb visite) {
        listeVisites.add(visite);
    }

}
