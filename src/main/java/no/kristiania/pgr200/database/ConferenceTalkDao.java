package no.kristiania.pgr200.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class ConferenceTalkDao {

    private DataSource dataSource;

    public ConferenceTalkDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    public void insertTalk(ConferenceTalk talk) throws SQLException {
        try(Connection conn = dataSource.getConnection()) {
            String sql = "insert into CONFERENCE_TALK (TITLE, DESCRIPTION) values (?, ?)";
            try (PreparedStatement statement = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {
                statement.setString(1, talk.getTitle());
                statement.setString(2, talk.getDescription());

                statement.executeUpdate();
            }
        }
    }

    public List<ConferenceTalk> listAll() throws SQLException {

        try (Connection myConn = dataSource.getConnection()) {
            String sql = "select * from conference_talk";

            try (PreparedStatement statement = myConn.prepareStatement(sql)) {
                try (ResultSet rs = statement.executeQuery()) {
                    List<ConferenceTalk> talks = new ArrayList<>();
                    while (rs.next()) {
                        ConferenceTalk talk = new ConferenceTalk();
                        talk.setId(rs.getInt("id"));
                        talk.setTitle(rs.getString("title"));
                        talk.setDescription(rs.getString("description"));
                        talks.add(talk);
                        System.out.println(talk.getId() + "." +
                                "\n" + "Title: " + talk.getTitle() +
                                "\n" + "Descrption: " + talk.getDescription());
                        System.out.println();
                    }
                    return talks;
                }

            }

        }
    }

}
