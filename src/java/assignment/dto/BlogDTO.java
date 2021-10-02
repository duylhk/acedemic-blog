package assignment.dto;

public class BlogDTO {

    private String blogId;
    private String content;
    private String userId;
    


    public BlogDTO(String blogId, String content, String userId) {
        this.blogId = blogId;
        this.content = content;
        this.userId = userId;
    }

}