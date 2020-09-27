 package com.example.sql_lite;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ZoomButtonsController;

 public class MainActivity extends AppCompatActivity {
    DatabaseHelper myDb;

    Button btn_insert_data,btn_dataView;
    EditText text_Name , text_Marks,text_Roll;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDb=new DatabaseHelper( this );
        btn_insert_data=(Button) findViewById( R.id.btn_insert);
        text_Name=(EditText) findViewById(R.id.editTextName);
        text_Roll=(EditText) findViewById(R.id.Roll_num);
        text_Marks=(EditText) findViewById(R.id.editTextMarks);
        btn_dataView=(Button) findViewById(R.id.btn_ViewAll);

        btn_insert_data.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                boolean isinserted=myDb.insertData(text_Name.getText().toString() ,text_Marks.getText().toString());
                if(isinserted==true)
                    Toast.makeText(MainActivity.this,"Data_inserted",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this,"Not  inserted",Toast.LENGTH_SHORT).show();

            }
        });

        btn_dataView.setOnClickListener( new View.OnClickListener(){
            public void onClick(View view){
                Cursor cur=myDb.getAllData();
                if(cur.getCount() ==0)
                    Toast.makeText(MainActivity.this, "Empty", Toast.LENGTH_SHORT).show();

                StringBuffer buffer=new StringBuffer();

                while(cur.moveToNext()){
                    buffer.append("ID: "+cur.getString(0)+"\n");
                    buffer.append("Name: "+cur.getString(1)+"\n");
                    buffer.append("Marks: "+cur.getString(2)+"\n");

                }
                showMessage("Data",buffer.toString());
            }
        });
    }
    public void showMessage(String title,String Message){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }
}