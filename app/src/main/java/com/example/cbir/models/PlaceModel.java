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
        if(name.equals("Bigar")){
            this.placeName = "Bigar waterfall";
            this.placeDesciption = "Bigar Waterfall is located in Caras - Severin County and is the crossing point of Parallel 45 through Romania. The nature reserve covers an area of 176.60 hectares and is part of the Cheile Nerei National Park. The hilly area is made up of springs, gorges, valleys, meadows, meadows, mammals, birds, reptiles, fish and flora, giving you a wonderful and unique view. It has been protected by law since 2000 and was established in 1982. Following its declaration as the most beautiful waterfall in the world in 2013 by the American site \"The World Geography\", it has become very well known. ";
            this.placeRating = 5;
            this.latit = (long) 45.0011944444444444;
            this.longit = (long) 21.95361111111111;
        }
        if(name.equals("Sibiu")){
            this.placeName = "Sibiu";
            this.placeDesciption = "Sibiu, also known as the German Hermannstadt, was and is one of the most representative cities in Romania, both in terms of tourism, culture and economy. Here there is the most important center of the German minority in Transylvania, as well as other minorities. Of course, the largest share is held by the population of Romanian origin, who knew how to preserve and combine the other cultures from above. The city of Sibiu is located in the southern part of Transylvania, on the river Cibin, relatively close to the geographical center of Romania. The city is located near the Fagaras Mountains, the Cindrel and Lotru Mountains, which border the Cibin depression in the southwest. ";
            this.placeRating = 5;
            this.latit = (long) 45.78333333333333;
            this.longit = (long) 24.083333333333333;
        }
        if(name.equals("Sighisoara")){
            this.placeName = "Sighisoara";
            this.placeDesciption = "Located in the heart of Transylvania, the medieval fortress of Sighisoara is historically linked to Vlad Tepes' father, Vlad Dracul, who lived in the fortress. Built by Saxon settlers in the twelfth century on the banks of the Great Tarnava, Sighisoara is among the few medieval fortresses still inhabited, it is inscribed on the UNESCO World Heritage List. The fortress is built on two \"floors\", on the upper one being the Church from the Hill and the School, and at the base being the buildings of the fortress. The wall was built in the 14th century, having a height between 4 and 14 meters, having from place to place defense towers belonging to different craft guilds. Of the 14 towers initially built, today only 9 are preserved, the most important, which has also become the symbol of Sighisoara, being the Clock Tower with 7 figurines representing the days of the week. ";
            this.placeRating = 4;
            this.latit = (long) 46.21694444444444 ;
            this.longit = (long) 24.79111111111111;
        }
        if(name.equals("PodDumnezeu")){
            this.placeName = "God's bridge ";
            this.placeDesciption ="God's Bridge is one of three natural bridges in the world and the second largest in Europe. Located in Ponoarele commune, near Baia de Arama, Mehedinti county, it is the only natural bridge that can be circulated, being formed of limestone, as a result of the collapse of the ceiling of a cave. There are several legends related to this natural bridge. It is said that the Devil himself lived in the Ponoarele cave, quietly dealing with his evils. But one day they asked God to save them from the devil, and he, listening to their prayers, struck the ceiling of the cave, collapsing it over the entrance. The devil, skilled, escaped through the second exit of the cave, clinging to a hill and thus forming the two plains today called Aphrodite and Cleopatra. It is said that he watches over the people who visit the place, without being able to resume his residence. ";
            this.placeRating =5;
            this.latit = (long) 44.975 ;
            this.longit = (long) 22.76111111111111;
        }
        if(name.equals("Transfagarasan")){
            this.placeName = "Transfagarasan";
            this.placeDesciption ="Transfagarasan Road is considered the most beautiful road in Romania and rightly so. The dozens of tight curves, the panoramas with the Fagaras mountains and the wonderful tourist objectives along it make Transfagarasan a real holiday destination. The Transfagarasan road or DN 7C starts from Bascov locality, Arges county, near Pitesti. The route goes north and ends in Cartisoara, located 50 kilometers from Sibiu and 104 kilometers from Brasov. The route is 151 kilometers long and climbs to a maximum altitude of 2042 meters, at Balea Lac. ";
            this.placeRating = 5;
            this.latit = (long)45.60365 ;
            this.longit = (long)24.61730;
        }
        if(name.equals("Delta")){
            this.placeName = "The Danube Delta";
            this.placeDesciption ="The mighty Danube River flows 1,788 miles from its springs in Germany's Black Forest to the Black Sea. Just before reaching the sea it forms the second largest and best preserved of Europe's deltas: 2,200 square miles of rivers, canals, marshes, tree-fringed lakes and reed islands. The Danube Delta is a wildlife enthusiast's (especially a bird watcher's) paradise. Some 300 species of birds make Danube's Delta their home, including cormorants, white tailed eagles and glossy ibises.  The bird watching season lasts from early spring to late summer. Birds are not the only inhabitants of the Delta. There is also a rich community of fish and animals; from wildcats, foxes and wolves, to even an occasional boar or deer. Altogether, 3,450 animal species can be seen here, as well as 1,700 plant species.";
            this.placeRating =4;
            this.latit = (long) 45.33333333333333;
            this.longit = (long) 29.5;
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


