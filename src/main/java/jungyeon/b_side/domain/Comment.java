package jungyeon.b_side.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Getter
public class Comment {
    @Id @GeneratedValue
    @Column(name = "comment_id")
    private Long id;

    private String content;
    private Long userId;
    private Long boardId;
    private LocalDateTime date; // 댓글 작성일

    private Long parentId; // 대댓글의 경우 부모 댓글 ID
    private Long depth; // 대댓글의 깊이
    private Long order; // 대댓글의 순서
}
