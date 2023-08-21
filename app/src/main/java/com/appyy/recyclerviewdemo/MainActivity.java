package com.appyy.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<contactModel> arrContact = new ArrayList<>();
    RecyclerContactAdapter adapter;
    FloatingActionButton btnOpeningDialog;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerContact);
        btnOpeningDialog = findViewById(R.id.btnOpenDialog);

        btnOpeningDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.add_update_lay);

                EditText edtName = dialog.findViewById(R.id.txtName);
                EditText edtNumber = dialog.findViewById(R.id.txtNumber);
                Button btnAction = dialog.findViewById(R.id.btnAction);

                btnAction.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                      /*  String name ="",number="";
                        if (!edtName.getText().toString().equals("")){
                             name = edtName.getText().toString();
                        }else {
                            Toast.makeText(MainActivity.this, "Please Enter Contact Name!", Toast.LENGTH_SHORT).show();
                        }
                        if (!edtNumber.getText().toString().equals("")){
                             number = edtNumber.getText().toString();
                        }else {
                            Toast.makeText(MainActivity.this, "Please Enter Contact Number", Toast.LENGTH_SHORT).show();
                        }

                        arrContact.add(new contactModel(name,number));

                        adapter.notifyItemInserted(arrContact.size()-1);
                        recyclerView.scrollToPosition(arrContact.size()-1);
                        recyclerView.scrollToPosition(arrContact.size()-1);*/

                    }
                });
                dialog.show();
            }
        });



        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //contactModel model1 = new contactModel(R.drawable.a,"A","9871245184");

       // arrContact.add(model1);
        arrContact.add(new contactModel(R.drawable.a,"A","9871245184"));
        arrContact.add(new contactModel(R.drawable.b,"B","9871245184"));
        arrContact.add(new contactModel(R.drawable.c,"C","9871245184"));
        arrContact.add(new contactModel(R.drawable.d,"D","9871245184"));
        arrContact.add(new contactModel(R.drawable.e,"E","9871245184"));
        arrContact.add(new contactModel(R.drawable.f,"F","9871245184"));
        arrContact.add(new contactModel(R.drawable.g,"G","9871245184"));
        arrContact.add(new contactModel(R.drawable.h,"H","9871245184"));
        arrContact.add(new contactModel(R.drawable.i,"I","9871245184"));
        arrContact.add(new contactModel(R.drawable.a,"A","9871245184"));
        arrContact.add(new contactModel(R.drawable.b,"B","9871245184"));
        arrContact.add(new contactModel(R.drawable.c,"C","9871245184"));
        arrContact.add(new contactModel(R.drawable.d,"D","9871245184"));
        arrContact.add(new contactModel(R.drawable.e,"E","9871245184"));
        arrContact.add(new contactModel(R.drawable.f,"F","9871245184"));
        arrContact.add(new contactModel(R.drawable.g,"G","9871245184"));
        arrContact.add(new contactModel(R.drawable.h,"H","9871245184"));
        arrContact.add(new contactModel(R.drawable.i,"I","9871245184"));
        arrContact.add(new contactModel(R.drawable.a,"A","9871245184"));
        arrContact.add(new contactModel(R.drawable.b,"B","9871245184"));
        arrContact.add(new contactModel(R.drawable.c,"C","9871245184"));
        arrContact.add(new contactModel(R.drawable.d,"D","9871245184"));
        arrContact.add(new contactModel(R.drawable.e,"E","9871245184"));
        arrContact.add(new contactModel(R.drawable.f,"F","9871245184"));
        arrContact.add(new contactModel(R.drawable.g,"G","9871245184"));
        arrContact.add(new contactModel(R.drawable.h,"H","9871245184"));
        arrContact.add(new contactModel(R.drawable.i,"I","9871245184"));
        arrContact.add(new contactModel(R.drawable.a,"A","9871245184"));
        arrContact.add(new contactModel(R.drawable.b,"B","9871245184"));
        arrContact.add(new contactModel(R.drawable.c,"C","9871245184"));
        arrContact.add(new contactModel(R.drawable.d,"D","9871245184"));
        arrContact.add(new contactModel(R.drawable.e,"E","9871245184"));
        arrContact.add(new contactModel(R.drawable.f,"F","9871245184"));
        arrContact.add(new contactModel(R.drawable.g,"G","9871245184"));
        arrContact.add(new contactModel(R.drawable.h,"H","9871245184"));
        arrContact.add(new contactModel(R.drawable.i,"I","9871245184"));

       RecyclerContactAdapter adapter = new RecyclerContactAdapter(this,arrContact);
  recyclerView.setAdapter(adapter);

    }
}