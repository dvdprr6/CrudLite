package com.example.david.crudlite.table;

/*
 * Class that represents all table details and needs for user items
 */
public class UserTable {
    public static final String TABLE_USERS = "USERS";
    public static final String COLUMN_ID = "user_id";
    public static final String COLUMN_FIRST_NAME = "first_name";
    public static final String COLUMN_LAST_NAME = "last_name";
    public static final String COLUMN_EMAIL = "email";

    public static final String[] ALL_COLUMNS = {
            COLUMN_ID,
            COLUMN_FIRST_NAME,
            COLUMN_LAST_NAME,
            COLUMN_EMAIL
    };

    public static final String SQL_CREATE =
            "CREATE TABLE " + TABLE_USERS + "(" +
                    COLUMN_ID + " TEXT PRIMARY KEY," +
                    COLUMN_FIRST_NAME + " TEXT," +
                    COLUMN_LAST_NAME + " TEXT," +
                    COLUMN_EMAIL + ");";

    public static final String SQL_DELETE =
            "DROP TABLE " + TABLE_USERS;
}
