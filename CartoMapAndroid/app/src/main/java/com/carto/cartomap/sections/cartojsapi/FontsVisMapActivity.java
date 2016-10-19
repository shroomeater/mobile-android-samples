package com.carto.cartomap.sections.cartojsapi;

import android.os.Bundle;

import com.carto.cartomap.util.Description;

/**
 * Created by aareundo on 13/10/16.
 */
@Description(value = "Vis displaying text on the map")
public class FontsVisMapActivity extends VisJsonBaseMapActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        updateVis("https://cartomobile-team.carto.com/u/nutiteq/api/v2/viz/13332848-27da-11e6-8801-0e5db1731f59/viz.json");
    }
}