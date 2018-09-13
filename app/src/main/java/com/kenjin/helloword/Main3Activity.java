package com.kenjin.helloword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.kenjin.helloword.adapter.CardViewPresidenAdapter;
import com.kenjin.helloword.adapter.GridPresidenAdapter;
import com.kenjin.helloword.adapter.ListPresidenAdapter;
import com.kenjin.helloword.model.Presiden;
import com.kenjin.helloword.model.PresidenData;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Presiden> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        recyclerView=findViewById(R.id.recylerView);
        recyclerView.hasFixedSize();
        list = new ArrayList<>();
        list.addAll(PresidenData.getListData());
        showRecyclerList();

    }
    private void showRecyclerList(){
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListPresidenAdapter listPresidentAdapter = new ListPresidenAdapter(this);
        listPresidentAdapter.setListPresident(list);
        recyclerView.setAdapter(listPresidentAdapter);
    }




















    /*




    private void showRecyclerGrid(){
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        GridPresidenAdapter gridPresidentAdapter = new GridPresidenAdapter(this);
        gridPresidentAdapter.setListPresident(list);
        recyclerView.setAdapter(gridPresidentAdapter);
    }
    private void showRecyclerCardView(){
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CardViewPresidenAdapter cardViewPresidentAdapter = new CardViewPresidenAdapter(this);
        cardViewPresidentAdapter.setListPresident(list);
        recyclerView.setAdapter(cardViewPresidentAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.action_list:
            showRecyclerList();
            break;

        case R.id.action_grid:
            showRecyclerGrid();
            break;

        case R.id.action_cardview:
            showRecyclerCardView();
            break;
        }
        return super.onOptionsItemSelected(item);
    }*/
}
