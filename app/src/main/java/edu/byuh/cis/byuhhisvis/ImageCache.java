package edu.byuh.cis.byuhhisvis;


import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ImageCache {

    private static Bitmap empty;

    public static void init(Resources res, float w2, float h) {
        float w = w2 / 4;

        empty = loadAndScale(res,R.drawable.example,w);

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
            allLargeImagesIds.add(R.drawable.example_large);
            // repeat this step to add all large images' id to a list
        }

        return allLargeImagesIds;
    }

    public static ArrayList<Integer> getAllInfoFilesIds() {

        ArrayList<Integer> allInfoFilesIds = new ArrayList<>();

        allInfoFilesIds.add(R.raw.april_space_six_comma_space_one_eight_three_zero);
        allInfoFilesIds.add(R.raw.may_space_one_one_comma_space_one_eight_four_three);
        allInfoFilesIds.add(R.raw.may_space_one_comma_space_one_eight_four_four);
        allInfoFilesIds.add(R.raw.september_space_two_five_comma_space_one_eight_five_zero);
        allInfoFilesIds.add(R.raw.december_space_one_two_comma_space_one_eight_five_zero);
        allInfoFilesIds.add(R.raw.january_space_two_six_comma_space_one_eight_six_five);
        allInfoFilesIds.add(R.raw.october_space_one_eight_six_five);
        allInfoFilesIds.add(R.raw.october_space_one_six_comma_space_one_eight_seven_five);
        allInfoFilesIds.add(R.raw.june_space_one_comma_space_one_nine_one_five);
        allInfoFilesIds.add(R.raw.november_space_two_seven_comma_space_one_nine_one_nine);
        allInfoFilesIds.add(R.raw.february_space_seven_comma_space_one_nine_two_one);
        allInfoFilesIds.add(R.raw.april_space_nine_comma_space_one_nine_five_one);
        allInfoFilesIds.add(R.raw.july_space_two_one_comma_space_one_nine_five_four);
        allInfoFilesIds.add(R.raw.february_space_one_two_comma_space_one_nine_five_five);
        allInfoFilesIds.add(R.raw.september_space_one_comma_space_one_nine_five_five);
        allInfoFilesIds.add(R.raw.september_space_two_six_comma_space_one_nine_five_five);
        allInfoFilesIds.add(R.raw.december_space_one_nine_five_five);
        allInfoFilesIds.add(R.raw.january_space_one_nine_five_six);
        allInfoFilesIds.add(R.raw.june_space_one_comma_space_one_nine_five_six);
        allInfoFilesIds.add(R.raw.december_space_one_seven_comma_space_one_nine_five_eight);
        allInfoFilesIds.add(R.raw.march_space_one_nine_five_nine);
        allInfoFilesIds.add(R.raw.august_space_two_one_comma_space_one_nine_five_nine);
        allInfoFilesIds.add(R.raw.august_space_one_nine_five_nine);
        allInfoFilesIds.add(R.raw.january_space_one_nine_six_zero);
        allInfoFilesIds.add(R.raw.march_space_one_nine_six_zero);
        allInfoFilesIds.add(R.raw.february_space_two_three_comma_space_one_nine_six_one);
        allInfoFilesIds.add(R.raw.june_space_three_comma_space_one_nine_six_one);
        allInfoFilesIds.add(R.raw.early_space_one_nine_six_two);
        allInfoFilesIds.add(R.raw.february_space_one_nine_comma_space_one_nine_six_three);
        allInfoFilesIds.add(R.raw.october_space_one_two_comma_space_one_nine_six_three);
        allInfoFilesIds.add(R.raw.august_space_two_comma_space_one_nine_six_four);
        allInfoFilesIds.add(R.raw.october_space_one_nine_six_four);
        allInfoFilesIds.add(R.raw.january_space_one_nine_six_eight);
        allInfoFilesIds.add(R.raw.february_space_one_seven_comma_space_one_nine_six_nine);
        allInfoFilesIds.add(R.raw.may_space_one_five_comma_space_one_nine_six_nine);
        allInfoFilesIds.add(R.raw.february_space_one_one_comma_space_one_nine_seven_two);
        allInfoFilesIds.add(R.raw.january_space_two_six_comma_space_one_nine_seven_three);
        allInfoFilesIds.add(R.raw.april_space_one_three_comma_space_one_nine_seven_four);
        allInfoFilesIds.add(R.raw.june_space_one_nine_seven_four);
        allInfoFilesIds.add(R.raw.february_space_one_three_comma_space_one_nine_seven_six);
        allInfoFilesIds.add(R.raw.october_space_two_zero_comma_space_one_nine_seven_six);
        allInfoFilesIds.add(R.raw.january_space_two_three_comma_space_one_nine_seven_seven);
        allInfoFilesIds.add(R.raw.march_space_one_nine_comma_space_one_nine_eight_zero);
        allInfoFilesIds.add(R.raw.june_space_four_comma_space_one_nine_eight_zero);
        allInfoFilesIds.add(R.raw.august_space_one_comma_space_one_nine_eight_zero);
        allInfoFilesIds.add(R.raw.september_space_one_nine_eight_one);
        allInfoFilesIds.add(R.raw.january_space_seven_comma_space_one_nine_eight_four);
        allInfoFilesIds.add(R.raw.july_space_one_comma_space_one_nine_eight_six);
        allInfoFilesIds.add(R.raw.june_space_one_nine_eight_eight);
        allInfoFilesIds.add(R.raw.june_space_one_five_comma_space_one_nine_eight_eight);
        allInfoFilesIds.add(R.raw.september_space_one_nine_nine_one);
        allInfoFilesIds.add(R.raw.october_space_five_comma_space_one_nine_nine_two);
        allInfoFilesIds.add(R.raw.november_space_one_nine_nine_four);
        allInfoFilesIds.add(R.raw.february_space_one_two_comma_space_one_nine_nine_eight);
        allInfoFilesIds.add(R.raw.january_space_one_one_comma_space_two_zero_zero_one);
        allInfoFilesIds.add(R.raw.february_space_eight_comma_space_two_zero_zero_one);
        allInfoFilesIds.add(R.raw.november_space_three_comma_space_two_zero_zero_one);
        allInfoFilesIds.add(R.raw.november_space_one_five_comma_space_two_zero_zero_two);
        allInfoFilesIds.add(R.raw.april_space_two_five_comma_space_two_zero_zero_three);
        allInfoFilesIds.add(R.raw.may_space_one_two_comma_space_two_zero_zero_three);
        allInfoFilesIds.add(R.raw.may_space_one_six_comma_space_two_zero_zero_three);
        allInfoFilesIds.add(R.raw.october_space_two_five_comma_space_two_zero_zero_three);
        allInfoFilesIds.add(R.raw.may_space_two_one_comma_space_two_zero_zero_four);
        allInfoFilesIds.add(R.raw.june_space_one_nine_comma_space_two_zero_zero_four);
        allInfoFilesIds.add(R.raw.december_space_two_comma_space_two_zero_zero_four);
        allInfoFilesIds.add(R.raw.january_space_two_zero_zero_five);
        allInfoFilesIds.add(R.raw.february_space_two_four_comma_space_two_zero_zero_five);
        allInfoFilesIds.add(R.raw.april_space_one_two_comma_space_two_zero_zero_five);
        allInfoFilesIds.add(R.raw.may_space_two_three_comma_space_two_zero_zero_five);
        allInfoFilesIds.add(R.raw.august_space_one_nine_comma_space_two_zero_zero_five);
        allInfoFilesIds.add(R.raw.september_space_two_zero_comma_space_two_zero_zero_five);
        allInfoFilesIds.add(R.raw.october_space_one_six_dash_two_three_comma_space_two_zero_zero_five);
        allInfoFilesIds.add(R.raw.june_space_five_comma_space_two_zero_zero_seven);
        allInfoFilesIds.add(R.raw.august_space_two_four_comma_space_two_zero_zero_seven);
        allInfoFilesIds.add(R.raw.november_space_seven_comma_space_two_zero_zero_seven);
        allInfoFilesIds.add(R.raw.april_space_one_zero_comma_space_two_zero_zero_eight);
        allInfoFilesIds.add(R.raw.november_space_six_comma_space_two_zero_zero_eight);
        allInfoFilesIds.add(R.raw.december_space_one_seven_comma_space_two_zero_zero_eight);
        allInfoFilesIds.add(R.raw.january_space_two_five_comma_space_two_zero_zero_nine);
        allInfoFilesIds.add(R.raw.march_space_one_one_comma_space_two_zero_zero_nine);
        allInfoFilesIds.add(R.raw.april_space_four_comma_space_two_zero_zero_nine);
        allInfoFilesIds.add(R.raw.april_space_two_eight_comma_space_two_zero_zero_nine);
        allInfoFilesIds.add(R.raw.may_space_one_two_comma_space_two_zero_zero_nine);
        allInfoFilesIds.add(R.raw.july_space_two_seven_comma_space_two_zero_zero_nine);
        allInfoFilesIds.add(R.raw.july_space_two_seven_comma_space_two_zero_zero_nine_duplicate_zero);
        allInfoFilesIds.add(R.raw.september_space_one_seven_comma_space_two_zero_zero_nine);
        allInfoFilesIds.add(R.raw.october_space_two_zero_zero_nine);
        allInfoFilesIds.add(R.raw.november_space_five_comma_space_two_zero_zero_nine);
        allInfoFilesIds.add(R.raw.november_space_two_two_comma_space_two_zero_zero_nine);
        allInfoFilesIds.add(R.raw.january_space_six_comma_space_two_zero_one_zero);
        allInfoFilesIds.add(R.raw.may_space_two_comma_space_two_zero_one_zero);
        allInfoFilesIds.add(R.raw.may_space_two_zero_one_zero);
        allInfoFilesIds.add(R.raw.july_space_two_six_comma_space_two_zero_one_zero);
        allInfoFilesIds.add(R.raw.november_space_two_one_comma_space_two_zero_one_zero);
        allInfoFilesIds.add(R.raw.march_space_one_nine_comma_space_two_zero_one_one);
        allInfoFilesIds.add(R.raw.march_space_two_zero_one_one);
        allInfoFilesIds.add(R.raw.march_space_two_six_comma_space_two_zero_one_one);
        allInfoFilesIds.add(R.raw.april_space_two_zero_one_one);
        allInfoFilesIds.add(R.raw.april_space_two_six_comma_space_two_zero_one_one);
        allInfoFilesIds.add(R.raw.june_space_two_comma_space_two_zero_one_one);
        allInfoFilesIds.add(R.raw.september_space_two_zero_one_one);
        allInfoFilesIds.add(R.raw.september_space_two_two_comma_space_two_zero_one_one);
        allInfoFilesIds.add(R.raw.november_space_one_zero_comma_space_two_zero_one_one);
        allInfoFilesIds.add(R.raw.november_space_one_four_comma_space_two_zero_one_one);
        allInfoFilesIds.add(R.raw.december_space_nine_comma_space_two_zero_one_one);
        allInfoFilesIds.add(R.raw.december_space_one_seven_comma_space_two_zero_one_one);
        allInfoFilesIds.add(R.raw.december_space_two_zero_one_one);
        allInfoFilesIds.add(R.raw.january_space_two_zero_one_two);
        allInfoFilesIds.add(R.raw.march_space_eight_dash_one_one_comma_space_two_zero_one_two);
        allInfoFilesIds.add(R.raw.march_space_nine_comma_space_two_zero_one_two);
        allInfoFilesIds.add(R.raw.april_space_one_six_comma_space_two_zero_one_two);
        allInfoFilesIds.add(R.raw.april_space_two_three_comma_space_two_zero_one_two);
        allInfoFilesIds.add(R.raw.may_space_one_eight_comma_space_two_zero_one_two);
        allInfoFilesIds.add(R.raw.may_space_one_nine_comma_space_two_zero_one_two);
        allInfoFilesIds.add(R.raw.may_space_two_four_comma_space_two_zero_one_two);
        allInfoFilesIds.add(R.raw.september_space_one_seven_comma_space_two_zero_one_two);
        allInfoFilesIds.add(R.raw.september_space_two_six_comma_space_two_zero_one_two);
        allInfoFilesIds.add(R.raw.october_space_four_comma_space_two_zero_one_two);
        allInfoFilesIds.add(R.raw.october_space_one_eight_comma_space_two_zero_one_two);
        allInfoFilesIds.add(R.raw.november_space_two_nine_dash_december_space_one_comma_space_two_zero_one_two);
        allInfoFilesIds.add(R.raw.january_space_two_zero_one_three);
        allInfoFilesIds.add(R.raw.may_space_two_zero_one_three);
        allInfoFilesIds.add(R.raw.may_space_two_two_comma_space_two_zero_one_three);
        allInfoFilesIds.add(R.raw.june_space_one_zero_dash_two_four_comma_space_two_zero_one_three);
        allInfoFilesIds.add(R.raw.june_dash_august_space_two_zero_one_three);
        allInfoFilesIds.add(R.raw.september_space_eight_comma_space_two_zero_one_three);
        allInfoFilesIds.add(R.raw.october_space_two_zero_one_three);
        allInfoFilesIds.add(R.raw.october_space_one_one_comma_space_two_zero_one_three);
        allInfoFilesIds.add(R.raw.october_space_one_one_comma_space_two_zero_one_three_duplicate_one);
        allInfoFilesIds.add(R.raw.december_space_one_three_comma_space_two_zero_one_three);
        allInfoFilesIds.add(R.raw.february_space_nine_comma_space_two_zero_one_four);
        allInfoFilesIds.add(R.raw.march_space_one_two_dash_one_six_comma_space_two_zero_one_four);
        allInfoFilesIds.add(R.raw.march_space_two_eight_comma_space_two_zero_one_four);
        allInfoFilesIds.add(R.raw.may_space_two_zero_comma_space_two_zero_one_four);
        allInfoFilesIds.add(R.raw.september_space_two_zero_one_four);
        allInfoFilesIds.add(R.raw.september_space_two_zero_one_four_duplicate_two);
        allInfoFilesIds.add(R.raw.september_space_two_zero_one_four_duplicate_three);
        allInfoFilesIds.add(R.raw.february_space_six_dash_one_two_comma_space_two_zero_one_five);
        allInfoFilesIds.add(R.raw.march_space_one_one_comma_space_two_zero_one_five);
        allInfoFilesIds.add(R.raw.april_space_one_six_comma_space_two_zero_one_five);
        allInfoFilesIds.add(R.raw.may_space_one_two_comma_space_two_zero_one_five);
        allInfoFilesIds.add(R.raw.may_space_two_zero_one_five);
        allInfoFilesIds.add(R.raw.october_space_two_four_comma_space_two_zero_one_five);
        allInfoFilesIds.add(R.raw.october_comma_space_two_zero_one_five);
        allInfoFilesIds.add(R.raw.november_space_one_zero_comma_space_two_zero_one_five);

        return allInfoFilesIds;
    }

}


