package com.example.sqlitetest;

import java.sql.SQLException;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.io.*;

public class DataHandler {

	public static final String NAME ="name";
	public static final String EMAIL="email";
	
	public static final String TABLE_NAME="mytable";
	public static final String DATABASE_NAME="mydatabase";
	
	public static final int DATABASE_VERSION=1;
	
	public static final String TABLE_CREATE="create table mytable(name text not null, email text not null);";
	
	DatabaseHelper dbHelper;
	Context ctx;
	SQLiteDatabase db;
	
	public DataHandler(Context ctx){
		
		this.ctx=ctx;
		dbHelper = new DatabaseHelper(ctx);
	}
	
	private static class DatabaseHelper extends SQLiteOpenHelper{

		// creating a constructor 
		
		public DatabaseHelper(Context ctx){
			
			super(ctx,DATABASE_NAME,null,DATABASE_VERSION);
		}
		@Override
		public void onCreate(SQLiteDatabase db){

			// add try catch here
			db.execSQL(TABLE_CREATE);
				
		}
		
		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			
			db.execSQL("DROP TABLE IF EXIXTS mytable");
			onCreate(db);
			
		}
		
	}
	
	// to open the database
	
			public DataHandler open(){
				
				db = dbHelper.getReadableDatabase();
				
				return this;
			}
			
			public void close(){
				
				
				
				dbHelper.close();
			}

			
			// to insert data
			
			public long insertData(String name, String email){
				
				ContentValues content = new ContentValues();
				content.put(NAME, name);
				content.put(EMAIL, email);
				
				return db.insertOrThrow(TABLE_NAME, null, content);
			}
			
			// to display data
			
			public Cursor returnData(){
				
				
				return db.query(TABLE_NAME, new String[]{NAME,EMAIL}, null, null, null, null, null);
				
			}
}
