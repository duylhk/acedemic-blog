package assignment.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import assignment.utils.DBUtils;

public class BlogDAO {

    public List<BlogDTO> getListBlog(String search) throws SQLException {
        List<BlogDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                String sql = "SELECT productID, productName, description, categoryName, productPrice, productQuantity, image, statusID "
                        + "FROM tblProducts, tblCategory "
                        + "WHERE productName like ? AND tblProducts.categoryID=tblCategory.categoryID";
                stm = conn.prepareStatement(sql);
                stm.setString(1, "%" + search + "%");
                rs = stm.executeQuery();
                while (rs.next()) {
                    String blogId = rs.getString("blogId");
                    String content = rs.getString("content");
                    String userId = rs.getString("userId");
                        list.add(new BlogDTO(blogId, content, userId));                   
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return list;
    }
    
}
