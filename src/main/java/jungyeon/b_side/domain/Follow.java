package jungyeon.b_side.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Follow {
    @Id @GeneratedValue
    @Column(name = "follow_id")
    private Long id;

    private Long userId;
    private Long followerId;
    private Long followingId;

}
