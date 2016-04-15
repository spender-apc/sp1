package novozhilova.nastest;

import android.text.format.DateFormat;

import java.sql.SQLDataException;


public class Cost {

    String _rank; //категория
    String _subrank;//подкатегория
    int _amount;// сумма
    DateFormat _date;//дата


    // constructors
    public Cost(){
    }

    public Cost(String rank, String subrank, int _amount,DateFormat _date){
        this._rank = rank;
        this._subrank = subrank;
        this._amount = _amount;
        this._date = _date;
    }

    public Cost(String subrank, int _amount){
        this._subrank = subrank;
        this._amount = _amount;
    }

    //Получить/установить категорию
    public String getRank(){
        return this._rank;
    }
    public String getSubRank(){
        return this._subrank;
    }
    public void setRankAndSubRank(String rank, String subrank){
        this._rank = rank;
        this._subrank = subrank;
    }

    //Получить/ устаносить сумму
    public int getAmount(){
        return this._amount;
    }

    public void setAmount(int amount){
        this._amount = amount;
    }
//Получить/установить дату
    public DateFormat getDate(){
        return this._date;
    }

    public void setDate(DateFormat date){
        this._date = date;
    }


}
