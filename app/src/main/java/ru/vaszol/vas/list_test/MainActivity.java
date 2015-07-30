package ru.vaszol.vas.list_test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import ru.vaszol.vas.list_test.model.ToDoManager;


public class MainActivity extends ActionBarActivity {

    private ListView todoLV = null;
    private ToDoManager todoManager = null;
    private ToDoAdapter a = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        todoLV = (ListView)findViewById(R.id.listView1);
        todoManager = ((ToDoApp)getApplication()).getToDoManager();
        a=new ToDoAdapter(getApplicationContext(),todoManager.getTodos());
        todoLV.setAdapter(a);

        todoLV.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> lv,
                                           View v, int position, long id) {
                todoManager.removePosition(position);
                a.notifyDataSetChanged();
                return false;
            }
        });
        todoLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(MainActivity.this, ToDoDitailsActivity.class);
                i.putExtra("todoPosition", position);
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_settings:
                Intent i = new Intent(Intent.ACTION_DIAL, null);
                startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}
