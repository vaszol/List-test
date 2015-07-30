package ru.vaszol.vas.list_test;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

import ru.vaszol.vas.list_test.model.ToDo;


public class ToDoDitailsActivity extends ActionBarActivity {

    private int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do_ditails);

        position = getIntent().getIntExtra("todoPosition",0);

        TextView idTV = (TextView) findViewById(R.id.textView);
        TextView taskTV = (TextView) findViewById(R.id.textView2);
        TextView priorityTV = (TextView) findViewById(R.id.textView3);

        ToDo todo = ((ToDoApp)getApplication()).getToDoManager().findByPosition(position);
        idTV.setText(""+todo.getId());
        taskTV.setText(todo.getTask());
        priorityTV.setText(""+todo.getPriority());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_to_do_ditails, menu);
        return true;
    }

    public void onClickClose(View v){
//        Intent i = new Intent(ToDoDitailsActivity.this, MainActivity.class);
//        startActivity(i);
        finish();
    }

}
