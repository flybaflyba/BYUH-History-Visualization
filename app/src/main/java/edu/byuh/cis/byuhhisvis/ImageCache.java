package edu.byuh.cis.byuhhisvis;


import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.ArrayList;

public class ImageCache {

    private static Bitmap empty;

    public static void init(Resources res, float w2, float h) {
        float w = w2 / 4;

        empty = loadAndScale(res,R.drawable.shanghai_china_temple,w);

        // repeat last step too load all bitmaps
    }

    private static Bitmap loadAndScale(Resources res, int id, float newWidth) {
        Bitmap original = BitmapFactory.decodeResource(res, id);
        float aspectRatio = (float)original.getHeight()/(float)original.getWidth();
        float newHeight = newWidth * aspectRatio;
        return Bitmap.createScaledBitmap(original, (int)newWidth, (int)newHeight, true);
    }

    public static ArrayList<Member> getTempleObjectsList() {

        ArrayList<Member> allObjectsList = new ArrayList<>();

        for (int i = 0; i <= 144; i ++) {
            allObjectsList.add(new Member(empty, 0f, 0f, 0f));
            // repeat this step to create objects with all resized bitmaps
        }

        return allObjectsList;
    }

    public static ArrayList<Integer> getAllLargeImagesIds() {

        ArrayList<Integer> allLargeImagesIds = new ArrayList<>();

        for (int i = 0; i <= 144; i ++) {
            allLargeImagesIds.add(R.drawable.shanghai_china_temple_large);
            // repeat this step to add all large images' id to a list
        }

        return allLargeImagesIds;
    }

    public static ArrayList<Integer> getAllInfoFilesIds() {

        ArrayList<Integer> allInfoFilesIds = new ArrayList<>();

        for (int i = 0; i <= 144; i ++) {
            allInfoFilesIds.add(R.raw.shanghai_china_temple);
            // repeat this step to add all info files' ids to a list
        }

        return allInfoFilesIds;
    }

}


