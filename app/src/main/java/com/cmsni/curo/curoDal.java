package com.cmsni.curo;


import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import android.widget.Toast;

import com.parse.FindCallback;
import com.parse.ParseAnonymousUtils;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.location.Location;

import java.util.List;

/**
 * Created by david on 22/06/2015.
 */
public class curoDal {



    public  void syncTodosToParse() {


        ParseQuery<curoLists> query = ParseQuery.getQuery("Courses");

        query.findInBackground(new FindCallback<curoLists>() {

            @Override
            public void done(List<curoLists> healthList, ParseException e)
            {
                if (e == null)
                {
                    healthList.clear();
                    for (ParseObject health : healthList)
                    {


                    }
                }
                else
                {
                    Log.d("Post retrieval", "Error: " + e.getMessage());
                }
            }
        });


        }
}
