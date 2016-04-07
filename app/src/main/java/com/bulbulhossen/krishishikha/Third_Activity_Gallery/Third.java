package com.bulbulhossen.krishishikha.Third_Activity_Gallery;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import com.bulbulhossen.krishishikha.GridView_Main_Activity.GridViewAdapter;
import com.bulbulhossen.krishishikha.GridView_Main_Activity.Gridview_ImageItem;
import com.bulbulhossen.krishishikha.R;
import com.bulbulhossen.krishishikha.paddy_list.List_main;

import java.util.ArrayList;


public class Third extends AppCompatActivity {


    Intent i;
    private GridView gridView;
    private GridViewAdapter customGridAdapter;
    ArrayList<Gridview_ImageItem> gridviewImageItems = new ArrayList<Gridview_ImageItem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_layout);

        Bitmap one = BitmapFactory.decodeResource(this.getResources(), R.drawable.paddy);
        Bitmap two = BitmapFactory.decodeResource(this.getResources(), R.drawable.paddy);
        Bitmap three = BitmapFactory.decodeResource(this.getResources(), R.drawable.paddy);
        Bitmap four = BitmapFactory.decodeResource(this.getResources(), R.drawable.paddy);
        Bitmap five = BitmapFactory.decodeResource(this.getResources(), R.drawable.paddy);
        Bitmap six = BitmapFactory.decodeResource(this.getResources(), R.drawable.paddy);
        Bitmap seven = BitmapFactory.decodeResource(this.getResources(), R.drawable.paddy);
        Bitmap eight = BitmapFactory.decodeResource(this.getResources(), R.drawable.paddy);
        Bitmap nine = BitmapFactory.decodeResource(this.getResources(), R.drawable.paddy);
        Bitmap ten = BitmapFactory.decodeResource(this.getResources(), R.drawable.paddy);


        gridviewImageItems.add(new Gridview_ImageItem(one, "আমন ধান"));
        gridviewImageItems.add(new Gridview_ImageItem(two, "আউশ ধান "));
        gridviewImageItems.add(new Gridview_ImageItem(three, "বোর ধান"));
        gridviewImageItems.add(new Gridview_ImageItem(four, "ধান"));
        gridviewImageItems.add(new Gridview_ImageItem(five, "ধান"));
        gridviewImageItems.add(new Gridview_ImageItem(six, "ধান"));
        gridviewImageItems.add(new Gridview_ImageItem(seven, "ধান"));
        gridviewImageItems.add(new Gridview_ImageItem(eight, "ধান"));
        gridviewImageItems.add(new Gridview_ImageItem(nine, "ধান"));
        gridviewImageItems.add(new Gridview_ImageItem(ten, "ধান"));


        gridView = (GridView) findViewById(R.id.gridView);
        customGridAdapter = new GridViewAdapter(this, R.layout.row_grid, gridviewImageItems);
        gridView.setAdapter(customGridAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                switch (position) {
                    case 0:
                        i = new Intent(Third.this, List_main.class);
                        overridePendingTransition(R.anim.push_up_in, R.anim.push_up_out);

                        break;
/*                    case 1:
                        i = new Intent(Second.this, Button_style_main.class);
                        break;
                    case 2:
                        i = new Intent(Second.this, Details_Class.class);
                       overridePendingTransition(R.anim.push_up_in, R.anim.push_up_out);
                        break;

                    case 3:
                        i = new Intent(Second.this, ExampleActivity.class);
                       overridePendingTransition(R.anim.push_up_in, R.anim.push_up_out);
                        break;*/
                }

                startActivity(i);
            }

        });

    }


    //Application Exiting code start--------------->>

/*
    public void onBackPressed() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                Second.this);

        // set title
        alertDialogBuilder.setTitle("কবিতা ভাণ্ডার");

        // set dialog message
        alertDialogBuilder
                .setMessage("আপনি কি অ্যাপ্লিকেশান বন্ধ করতে চান ?")
                .setCancelable(false)
                .setPositiveButton("হ্যাঁ", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // if this button is clicked, close
                        // current activity
                        Second.this.finish();
                    }
                })
                .setNegativeButton("না", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // if this button is clicked, just close
                        // the dialog box and do nothing
                        dialog.cancel();
                    }
                });

        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();

        // show it
        alertDialog.show();
*/

    //Application Exiting code end -----------<<


//  Apps rating ... code start---------------->>

/*        AppRate.with(this)
                //.setStoreType(AppRate.StoreType.GOOGLEPLAY) //default is Google, other option is Amazon
                .setInstallDays(3) // default 10, 0 means install day.
                .setLaunchTimes(10) // default 10 times.
                .setRemindInterval(2) // default 1 day.
                .setShowLaterButton(true) // default true.
                .setDebug(true) // default false.
                .setCancelable(false) // default false.
                .setOnClickButtonListener(new OnClickButtonListener() { // callback listener.
                    @Override
                    public void onClickButton(int which) {
                        Log.d(Second.class.getName(), Integer.toString(which));
                    }
                })
                .setMessage(R.string.meassage)
                .setTitle(R.string.new_rate_dialog_title)
                .setTextLater(R.string.new_rate_dialog_later)
                .setTextNever(R.string.new_rate_dialog_never)
                .setTextRateNow(R.string.new_rate_dialog_ok)
                .monitor();


        AppRate.showRateDialogIfMeetsConditions(this);*/

// rating code end-------------------<<<


}
