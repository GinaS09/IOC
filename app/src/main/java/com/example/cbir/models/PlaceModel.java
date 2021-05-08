package com.example.cbir.models;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PlaceModel {

    public String placeName;
    public String placeDesciption;
    public Integer placeRating;
    public Long latit, longit;
    public List<CommentModel> comments;

    public PlaceModel(String name) {
        if (name.equals("Cantacuzino")) {
            this.placeName = "Cantacuzino Castle";
            this.placeDesciption = "Cantacuzino Castle is located in Busteni, Zamora district, on the site of an old hunting lodge, which has existed since the 15th century. 18th century and which served as a stop for the Cantacuzino family, on its way to Brasov. Cantacuzino Castle is built in neo-Romanian style, the only style that revived the tradition, strengthened the origins and connected them to the present. ";
            this.placeRating = 3;
            this.latit = (long) 45.413782432849;
            this.longit = (long) 25.542441583345;
            CommentModel model = new CommentModel("Oana","It is a wonderful place!");
            CommentModel model1 = new CommentModel("Gina", "The castle looks amazing!");
            comments = new ArrayList<>();
            this.comments.add(model);
            this.comments.add(model1);
        }
    }
/*
    private String getFromFile(String filename) throws FileNotFoundException {
        File myObj = new File(filename);
        if(myObj.exists()) {
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Readable " + myObj.canRead());
            Scanner myReader = new Scanner(myObj);
            String element = myReader.nextLine();
            myReader.close();
            myObj.delete();
            return element;
        }
        return null;

    }

    private Map<String, String> getComments(String filename) throws FileNotFoundException {
        Map<String, String> comm = new HashMap();
        File myObj = new File(filename + "comments");
        for( final File fileEntry : myObj.listFiles()){
            Scanner myReader = new Scanner(fileEntry);
            String element = myReader.nextLine();
            comm.put(fileEntry.getName(), element);
        }
        return comm;
    }*/

}


