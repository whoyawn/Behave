package com.behave.behave.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.behave.behave.R;

public class ChildRedeemPage extends AppCompatActivity {

    String prize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_redeem_page);

    }
    //@Override
    public void returnChild(View view) {
        Intent startNewActivity = new Intent(this, HomeChildrenPage.class);
        startActivity(startNewActivity);

        // TODO: implement this
//        Intent childNameIntent = getIntent();
//        prize = childNameIntent.getStringExtra("prizeName");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater= getMenuInflater();
        menuInflater.inflate(R.menu.child_menu,menu);
        return super.onCreateOptionsMenu(menu);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.item_option1:
                Intent settingsIntent = new Intent(this, ChildSetting.class);
                this.startActivity(settingsIntent);
                break;
            case R.id.item_option2:
                LoginActivity.clearUsername();
                Intent logoutIntent = new Intent(this, MainActivity.class);
                this.startActivity(logoutIntent);
                break;
        }
        return super.onOptionsItemSelected(item);

    }


        // need token counter and prize name, as well as prize picture from database

}
