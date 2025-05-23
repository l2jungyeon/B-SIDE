package jungyeon.b_side.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Notice {
    @Id @GeneratedValue
    @Column(name = "notice_id")
    private Long id;
    private String title;
    private String content;

    private Long userId;
}
