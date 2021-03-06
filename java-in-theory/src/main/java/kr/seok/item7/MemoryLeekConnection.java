package kr.seok.item7;

import java.sql.Connection;

public class MemoryLeekConnection {
    public static void main(String[] args) {
        // DB 자원 접근
        DBConnection conn = new DBConnection.Builder("", "", "", "").build();

        // Connection 정보 확인
        Connection connection = conn.getConnection();

        // 메타 정보 살짝 확인
        conn.getMetaDataInfo(connection);

        // 자원 반환
        conn.disConnect();
    }
}
