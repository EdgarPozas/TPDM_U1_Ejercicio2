package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.content.*;

public class MainActivity extends Activity 
{
	private EditText e1,e2,e3;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		e1=findViewById(R.id.valor1);
		e2=findViewById(R.id.valor2);
		e3=findViewById(R.id.valor3);
    }
	
	private boolean validar(int a,int b,int c){
		return a<0||b<0||c<0;
	}
	
	public void obtenerMayor(View v){
		
		if(e1.getText().toString().isEmpty()||e2.getText().toString().isEmpty()||e3.getText().toString().isEmpty()){
			Toast.makeText(MainActivity.this,"Deben de estar llenos todos los campos",Toast.LENGTH_SHORT).show();
			return;
		}
		
		int v1=Integer.parseInt(e1.getText().toString());
		int v2=Integer.parseInt(e2.getText().toString());
		int v3=Integer.parseInt(e3.getText().toString());
		
		if(validar(v1,v2,v3)){
			Toast.makeText(MainActivity.this,"Deben de ser positivos",Toast.LENGTH_SHORT).show();
			return;
		}
		String txt="El mayor es";
		
		if(v1>v2 &&v1>v3){
			txt+=" valor "+v1;
		}else if(v2>v1 &&v2>v3){
			txt+=" valor "+v2;
		}else if(v3>v2 &&v3>v1){
			txt+=" valor "+v3;
		}else{
			txt="no se puede decidir";
		}
		
		AlertDialog.Builder alerta =new AlertDialog.Builder(this);
		alerta.setTitle("TPDM").setMessage(txt);
		alerta.setPositiveButton("Aceptar",new DialogInterface.OnClickListener(){
			@Override
			public void onClick(DialogInterface dialog,int i){
				dialog.dismiss();
			}
		});
		alerta.show();
	}
	public void obtenerMenor(View v){

		if(e1.getText().toString().isEmpty()||e2.getText().toString().isEmpty()||e3.getText().toString().isEmpty()){
			Toast.makeText(MainActivity.this,"Deben de estar llenos todos los campos",Toast.LENGTH_SHORT).show();
			return;
		}

		int v1=Integer.parseInt(e1.getText().toString());
		int v2=Integer.parseInt(e2.getText().toString());
		int v3=Integer.parseInt(e3.getText().toString());

		if(validar(v1,v2,v3)){
			Toast.makeText(MainActivity.this,"Deben de ser positivos",Toast.LENGTH_SHORT).show();
			return;
		}
		String txt="El menor es";

		if(v1<v2 &&v1<v3){
			txt+=" valor "+v1;
		}else if(v2<v1 &&v2<v3){
			txt+=" valor "+v2;
		}else if(v3<v2 &&v3<v1){
			txt+=" valor "+v3;
		}else{
			txt="no se puede decidir";
		}

		AlertDialog.Builder alerta =new AlertDialog.Builder(this);
		alerta.setTitle("TPDM").setMessage(txt);
		alerta.setPositiveButton("Aceptar",new DialogInterface.OnClickListener(){
				@Override
				public void onClick(DialogInterface dialog,int i){
					dialog.dismiss();
				}
			});
		alerta.show();
	}
}
