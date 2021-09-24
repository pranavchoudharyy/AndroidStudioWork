package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.text.AutoText;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class database extends Activity {
    SQLiteDatabase db;
    TextView tv;
    EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);
        tv=(TextView)findViewById(R.id.textView1);
        et1=(EditText)findViewById(R.id.editText1);
        et2=(EditText)findViewById(R.id.editText2);
        db= openOrCreateDatabase("Mydb", MODE_PRIVATE, null);

        db.execSQL("create table if not exists mytable(name varchar, sur_name varchar)");
    }

    public void insert(View v)
    {
        String name=et1.getText().toString();
        String sur_name=et2.getText().toString();
        et1.setText("");
        et2.setText("");

        db.execSQL("insert into mytable values('"+name+"','"+sur_name+"')");
        Toast.makeText(this, "values inserted successfully.", Toast.LENGTH_LONG).show();
    }

    public void display(View v)
    {
        String name1=et1.getText().toString();
        if(name1.equals("")) {


            Toast.makeText(getApplicationContext()," enter name to search ",Toast.LENGTH_LONG).show();
            Intent in1 =new Intent(getApplicationContext(),database.class);
            startActivity(in1);
        }
        else{
            Cursor c=db.rawQuery("select * from mytable where name ='"+ name1 +"'", null);
            tv.setText("");
            Toast.makeText(getApplicationContext(),"result found",Toast.LENGTH_LONG).show();
            c.moveToFirst();

            do
            {
                String name=c.getString(c.getColumnIndex("name"));
                String surname=c.getString(1);
                tv.append("Name:"+name+" and SurName:"+surname+"\n");
            }while(c.moveToNext());
        }}
}