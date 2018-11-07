package co.edu.pdam.eci.persistenceapiintegration.data;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import co.edu.pdam.eci.persistenceapiintegration.data.dao.TeamDao;
import co.edu.pdam.eci.persistenceapiintegration.data.entity.Team;

/**
 * Created by 2114928 on 11/7/2018.
 */

@Database(entities = {Team.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract TeamDao userDao();
}
