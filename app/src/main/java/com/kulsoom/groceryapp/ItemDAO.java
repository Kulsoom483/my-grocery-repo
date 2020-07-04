package com.kulsoom.groceryapp;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ItemDAO {

    @Insert
    void insertItem(Item item);

    @Query("select * from Grocery")
    List<Item> getALLItem();

}
