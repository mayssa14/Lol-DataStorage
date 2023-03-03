package tn.esprit.loldatastorage.utils

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import tn.esprit.loldatastorage.dao.ChampionDao

// TODO 8 "Change to a ROOMDataBase"
abstract class AppDataBase : RoomDatabase() {

    // TODO 8.1 "Add the DAO"
    abstract fun daoChamp(): ChampionDao

    companion object {
        @Volatile
        private var instance: AppDataBase? = null

        fun getDatabase(context: Context): AppDataBase {
            if (instance == null) {
                synchronized(this) {
                    // TODO 8.2 "Build the DataBase"
                    instance = Room.databaseBuilder(
                        context,
                        AppDataBase::class.java,
                        "champions-db"
                    )
                        .allowMainThreadQueries()
                        .build()
                }
            }
            return instance!!
        }
    }
}


