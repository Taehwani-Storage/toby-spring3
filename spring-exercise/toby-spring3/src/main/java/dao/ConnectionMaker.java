package dao;

import java.sql.Connection;

public interface ConnectionMaker {
    Connection makeConnection();

    Connection makeNewConnection();
}
